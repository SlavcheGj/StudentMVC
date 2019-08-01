<%--
  Created by IntelliJ IDEA.
  User: sgjorgjiev
  Date: 8/1/2019
  Time: 10:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show Students Information</title>
</head>
<body>

<h1>Student Information</h1>
<table>
    <tr>
        <th>
        <td>Name</td>
        <td>Middle Name</td>
        <td>Surname</td>
        <td>School</td>
        <td>Index</td>
        </th>
    </tr>
    <tr>
        <td>${result.name}</td>
        <td>${result.middleName}</td>
        <td>${result.surname}</td>
        <td>${result.school}</td>
        <td>${result.index}</td>
    </tr>
</table>
</body>
</html>
