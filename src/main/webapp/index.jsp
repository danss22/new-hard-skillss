<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="by.mtereshchenko.Lesson20.model.City" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
        <table border="1">
        <tr>
                <th>id</th>
                <th>name</th>
        </tr>
            <c:forEach var="city" items="${cities}">
                <tr>
                    <td>${city.id}</td>
                    <td>${city.name}</td>
                </tr>
            </c:forEach>
        </table>
</body>
</html>