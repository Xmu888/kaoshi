package com.itheima.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**dept_id INT PRIMARY KEY AUTO_INCREMENT,
 dept_name VARCHAR(50) NOT NULL UNIQUE,
 major_name VARCHAR(50),
 telephone VARCHAR(50),
 email VARCHAR(100)
 */
@Data
public class Dept implements Serializable {
    private Integer dept_id;//部门id
    private String dept_name;//部门名称
    private String major_name;//部门主管名称
    private String telephone;//电话
    private String email;//部门邮箱
    private List<Employee> Employees;
}
