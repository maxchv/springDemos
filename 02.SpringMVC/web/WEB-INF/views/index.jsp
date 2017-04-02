<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <spring:url value="/resources/css/style.css" var="style" />
    <link rel="stylesheet" href="${style}"/>
</head>
<body>
    <form action="/add-student" method="post">
        <label>
            Name<br/> <input type="text" name="name" />
        </label>
        <br/>
        <label>
            Age<br/> <input type="number" name="age"/>
        </label>
        <br/>
        <input type="submit"/>
    </form>
</body>
</html>
