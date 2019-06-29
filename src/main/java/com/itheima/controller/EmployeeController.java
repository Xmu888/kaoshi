package com.itheima.controller;

import com.itheima.domain.Dept;
import com.itheima.domain.Employee;
import com.itheima.service.DeptService;
import com.itheima.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Employee> employeeList = service.findAll();
        model.addAttribute("employeeList",employeeList);
        return "data";
    }
    @RequestMapping("/delete")
    public String delete(Model model,String id){
        service.delete(id);
        return "redirect:/employee/findAll";
    }

}
