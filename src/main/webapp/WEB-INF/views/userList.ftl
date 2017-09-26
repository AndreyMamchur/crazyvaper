<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>UserData</title>
    <link rel="stylesheet" href="css/style.css" type="text/css" />
</head>
<body class="container">
<#include "templates/header.ftl">
<#--<div class="table-responsive" style="background-color: aqua">-->
<h1>Users list</h1>
    <table class="table table-striped">
        <tr id="nameOfColumns">
            <th>Id</th>
            <th>Name</th>
            <th>Email</th>
            <th>Age</th>
            <th>Phone Number</th>
            <th>Role</th>
            <th>password</th>
            <th>login</th>
            <th>Buttons</th>
        </tr>
    <#list users as user>
        <tr>
            <td><a href="/user/${user.id}">${user.id}</a></td>
            <td><#if user.name??>${user.name}<#else> </#if></td>
            <td><#if user.email??>${user.email}<#else> </#if></td>
            <td><#if user.age??>${user.age}<#else> </#if></td>
            <td><#if user.phoneNumber??>${user.phoneNumber}<#else> </#if></td>
            <td><#if user.role??>${user.role}<#else> </#if></td>
            <td><#if user.password??>${user.password}<#else> </#if></td>
            <td><#if user.login??>${user.login}<#else> </#if></td>
            <td><a href="/delete/${user.id}">Delete</a>
                <a href="/edit/${user.id}">Edit</a>
            </td>
        </tr>
    </#list>
    </table>
<#--</div>-->
<#--<#include "templates/createUserForm.ftl"/>-->
</body>
</html>