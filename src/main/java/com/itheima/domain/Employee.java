package com.itheima.domain;

import lombok.Data;

/**
 * employeeid INT PRIMARY KEY AUTO_INCREMENT,
 * 	employeename VARCHAR(50),
 * 	dept_id INT,
 * 	linkman VARCHAR(50),
 * 	salary DOUBLE,
 * 	FOREIGN KEY(dept_id) REFERENCES DEPT_C(dept_id)
 */
@Data
public class Employee {
    private Integer employeeid;//员工号
    private String employeename;//姓名
    private Integer dept_id;//部门号
    private String linkman;//联系方式
    private Double salary;//薪资
}
