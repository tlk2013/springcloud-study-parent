package com.dwsoft.springcloud.study.util;

import com.dwsoft.springcloud.study.api.EmployeeRemoteService;
import com.dwsoft.springcloud.study.entity.Employee;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author tlk
 * @date 2020/6/9-10:43
 */
@Component
public class MyFallBackFactory implements FallbackFactory<EmployeeRemoteService> {
    @Override
    public EmployeeRemoteService create(Throwable cause) {
        return new EmployeeRemoteService() {
            @Override
            public Employee getEmployeeRemote() {
                return new Employee(444, "call provider failed,fall back here, reason is "+cause.getClass().getName()+" "+cause.getMessage(), 444.444);
            }

            @Override
            public ResultUtils<Employee> getEmployeeById(Integer empId) {
                return ResultUtils.faileWith("call provider failed,fall back here, reason is "+cause.getClass().getName()+" "+cause.getMessage());
            }

            @Override
            public Employee saveEmp(Employee employee) {
                return null;
            }
        };
    }
}
