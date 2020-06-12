package com.dwsoft.springcloud.study.api;

import com.dwsoft.springcloud.study.entity.Employee;
import com.dwsoft.springcloud.study.util.MyFallBackFactory;
import com.dwsoft.springcloud.study.util.ResultUtils;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author tlk
 * @date 2020/6/8-13:57
 */
@Component
@FeignClient(value = "study-provider",fallbackFactory = MyFallBackFactory.class)
public interface EmployeeRemoteService {
    @RequestMapping("/provider/get/employee/remote")
    public Employee getEmployeeRemote();
    @RequestMapping("/provider/get/employee/by/id")
    public ResultUtils<Employee> getEmployeeById(@RequestParam("empId") Integer empId);
    @RequestMapping("/provider/save/emp")
    public Employee saveEmp(@RequestBody Employee employee);
}
