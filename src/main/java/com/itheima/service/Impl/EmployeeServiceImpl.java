package com.itheima.service.Impl;

import com.itheima.domain.Employee;
import com.itheima.mapper.EmployeeMapper;
import com.itheima.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper mapper;
    @Override
    public List<Employee> findAll() {
        return mapper.findAll();
    }

    @Override
    public void delete(String id) {
        mapper.delete(id);
    }
}
