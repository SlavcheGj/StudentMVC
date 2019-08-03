<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show Students Information</title>
</head>
<body>

<h1>Student Information</h1>
<h2>MyCustomMessage</h2>
<table>
    <tr>
        <th>Name</th>
        <th>Middle Name</th>
        <th>Surname</th>
        <th>School</th>
        <th>Index</th>
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
