<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form</title>
</head>
<body>
<form action="/submitedForm", method="post" >
    <form:errors path="student.*"/>
    <label>
        <p>Insert Name</p>
        <input type="text" placeholder="Name" name="name">
    </label>
    <label>
        <p>Insert Middle name</p>
        <input type="text" placeholder="Name" name="middleName">
    </label>
    <label>
        <p>Insert Surname</p>
        <input type="text" placeholder="Surname" name="surname">
    </label>
    <label>
        <p>Insert School</p>
        <input type="text" placeholder="School" name="school">
    </label>
    <label>
        <p>Insert index</p>
        <input type="text" placeholder="Index" name="index">
    </label>
    <input type="submit" value="Submit">
</form>
</body>
</html>
