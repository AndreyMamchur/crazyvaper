<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>UserData</title>
    <link rel="stylesheet" href="css/style.css" type="text/css" />
</head>
<body class="container">
<#include "templates/headerAdministrated.ftl">
<#include "templates/header.ftl">
<#--<div class="table-responsive" style="background-color: aqua">-->
<h1>Users list</h1>
    <table class="table table-striped">
        <tr id="nameOfColumns">
            <th>Id</th>
            <th>Name</th>
            <th>Email</th>
            <th>Date of Birth</th>
            <th>Phone Number</th>
            <th>Role</th>
            <th>password</th>
            <th>Buttons</th>
        </tr>
    <#list users as user>
        <tr>
            <td><a href="/user/${user.id}">${user.id}</a></td>
            <td>${user.name}</td>
            <td>${user.email}</td>
            <td><#if user.dateOfBirth??>${user.dateOfBirth}<#else> </#if></td>
            <td>${user.phoneNumber}</td>
            <td>${user.password}</td>
            <td><a href="/delete/${user.id}">Delete</a>
                <a href="/edit/${user.id}">Edit</a>
            </td>
        </tr>
    </#list>
    </table>
<#--</div>-->
<#include "templates/createUserForm.ftl"/>
</body>
</html>