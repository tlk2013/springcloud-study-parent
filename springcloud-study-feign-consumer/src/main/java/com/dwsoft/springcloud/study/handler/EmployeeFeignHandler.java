package com.dwsoft.springcloud.study.handler;

import com.dwsoft.springcloud.study.api.EmployeeRemoteService;
import com.dwsoft.springcloud.study.entity.Employee;
import com.dwsoft.springcloud.study.util.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tlk
 * @date 2020/6/8-14:42
 */
@RestController
public class EmployeeFeignHandler {
    @Autowired
    private EmployeeRemoteService employeeRemoteService;

    @RequestMapping("/feign/consumer/get/emp")
    public Employee getEmployeeRemote() {
        return employeeRemoteService.getEmployeeRemote(); }
    @RequestMapping("/feign/consumer/get/employee/by/id")
    public ResultUtils<Employee> getEmployeeById(Integer empId) {
        return employeeRemoteService.getEmployeeById(empId);
    }
    @RequestMapping("/feign/consumer/save/employee")
    public Employee getEmployeeById(Employee employee) {
        return employeeRemoteService.saveEmp(employee);
    }

}
