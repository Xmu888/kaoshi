package com.itheima.test;

import com.itheima.domain.Dept;
import com.itheima.service.DeptService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class DeptTest {
    @Autowired
    private DeptService service;

    @Test
    public void test01(){
        List<Dept> deptList = service.findAll();
        System.out.println(deptList);
    }
}
