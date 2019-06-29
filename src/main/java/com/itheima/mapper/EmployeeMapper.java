package com.itheima.mapper;

import com.itheima.domain.Employee;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface EmployeeMapper {

    @Select("select * from Employee")
    List<Employee> findAll();

    @Delete("delete from Employee where employeeid = #{id}")
    void delete(String id);
}
