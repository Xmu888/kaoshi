package com.itheima.service.Impl;

import com.itheima.domain.Dept;
import com.itheima.mapper.DeptMapper;
import com.itheima.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper mapper;
    @Override
    public List<Dept> findAll() {
        return mapper.findAll();
    }
}
