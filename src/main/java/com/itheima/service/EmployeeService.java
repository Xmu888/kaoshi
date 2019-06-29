package com.itheima.service;

import com.itheima.domain.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    void delete(String id);//删除方法
}
