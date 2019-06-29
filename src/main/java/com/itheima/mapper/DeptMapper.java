package com.itheima.mapper;

import com.itheima.domain.Dept;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DeptMapper {
    /**
     * employeeid INT PRIMARY KEY AUTO_INCREMENT,
     * 	employeename VARCHAR(50),
     * 	dept_id INT,
     * 	linkman VARCHAR(50),
     * 	salary DOUBLE,
     */
    //    private Integer dept_id;//部门id
    //    private String dept_name;//部门名称
    //    private String major_name;//部门主管名称
    //    private String telephone;//电话
    //    private String email;//部门邮箱
    //    private List<Employee> Employees;
    @Select("select * from dept_c")
    @Results({
            @Result(property = "dept_id",column = "dept_id",id = true),
            @Result(property = "dept_name",column = "dept_name"),
            @Result(property = "major_name",column = "major_name"),
            @Result(property = "telephone",column = "telephone"),
            @Result(property = "email",column = "email"),
            @Result(property = "Employees",
                    column = "dept_id",
                    javaType = List.class,
                    many = @Many(select = "com.itheima.mapper.EmployeeMapper.findAll")
            )
    })
    List<Dept> findAll();
}
