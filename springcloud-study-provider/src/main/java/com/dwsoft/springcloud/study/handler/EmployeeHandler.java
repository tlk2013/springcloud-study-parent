package com.dwsoft.springcloud.study.handler;

import com.dwsoft.springcloud.study.entity.Employee;
import com.dwsoft.springcloud.study.util.ResultUtils;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * @author tlk
 * @date 2020/6/8-11:00
 */
@RestController
public class EmployeeHandler {


    @RequestMapping("/provider/get/employee/remote")
    public Employee getEmployeeRemote(HttpServletRequest httpServletRequest) {

        return new Employee(555, "tom555"+httpServletRequest.getServerPort(), 555.55);
    }
    @HystrixCommand(fallbackMethod = "getEmployeeByIdBackup")
    @RequestMapping("/provider/get/employee/by/id")
    public ResultUtils<Employee> getEmployeeById(@RequestParam("empId") Integer empId){
        if(empId==111){

            throw new RuntimeException("你来就异常"+empId);
        }

        return ResultUtils.successWithData(new Employee(empId, "tom555", 555.55));
    }

    public ResultUtils<Employee> getEmployeeByIdBackup(@RequestParam("empId") Integer empId){

        return ResultUtils.faileWith("异常》"+empId);
    }

    @RequestMapping("/provider/save/emp")
    public Employee saveEmp(@RequestBody Employee employee){

        return employee;
    }
}
