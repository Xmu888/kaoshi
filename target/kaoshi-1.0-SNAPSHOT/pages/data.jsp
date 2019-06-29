<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page pageEncoding="UTF-8" %>
<html>
<head>
    <title>数据页面</title>
</head>
<body>
<table>
    <tr>
        <th>员工号</th>
        <th>姓名</th>
        <th>部门号</th>
        <th>联系方式</th>
        <th>薪资</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${employeeList}" var="employee">
        <tr>
            <td>${employee.employeeid}</td>
            <td>${employee.employeename}</td>
            <td>${employee.dept_id}</td>
            <td>${employee.linkman}</td>
            <td>${employee.salary}</td>
            <td><a href="${pageContext.request.contextPath}/employee/delete?id=${employee.employeeid}">删除</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
