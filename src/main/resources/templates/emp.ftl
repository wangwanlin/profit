<!DOCTYPE html>
<html>
<head></head>
<body style="font-size:30px;">
<h2>员工列表</h2>
<table>
    <tr>
        <td>编号 &emsp;  </td>
        <td>姓名 &emsp;  </td>
        <td>年龄 &emsp;  </td>
        <td>工资 &emsp;  </td>
        <td>&emsp;</td>
    </tr>
<#list list as emp>
<tr>
<td>${emp.id} </td>
    <td>${emp.name} </td>
    <td>${emp.age} </td>
    <td>${emp.salary} </td>
    <td> <a href="/deleteEmp?id=${emp.id}" style="text-decoration : underline;color : blue;cursor:pointer;float:left;margin-right: 10px" > delete </a> </td>
</tr>
</#list>


    <#--<c:forEach items="${list}" var="e"-->
               <#--varStatus="stat">-->
        <#--<tr>-->
            <#--<td>${e.id }</td>-->
            <#--<td>${e.name }</td>-->
            <#--<td>${e.age }</td>-->
            <#--<td>${e.salary }</td>-->
            <#--<!-- 难道这里的请求还要写上应用名吗? &ndash;&gt;-->
            <#--<td><a href="/springmvc-demo/emp/delete.form?id=${e.id}">删除</a></td>-->
        <#--</tr>-->
    <#--</c:forEach>-->
</table>
</body>
</html>