<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>UserData</title>
</head>
<body class="container">
<#include "templates/header.ftl">
<div class="table-responsive">
    <caption>User info</caption>
    <table class="table table-striped">
        <tr>
            <td>Id</td>
            <td>${user.id}</a></td>
        </tr>
        <tr>
            <td>Name</td>
            <td> <#if user.name??>${user.name}<#else> </#if></td>
        </tr>
        <tr>
            <td>Email</td>
            <td><#if user.email??>${user.email}<#else> </#if></td>
        </tr>
        <td>Age</td>
        <td><#if user.age??>${user.age}<#else> </#if></td>
        </tr>
        <tr>
            <td>Phone Number</td>
            <td><#if user.phoneNumber??>${user.phoneNumber}<#else> </#if></td>
        </tr>
        <tr>
            <td>Role</td>
            <td><#if user.role??>${user.role}<#else> </#if></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><#if user.password??>${user.password}<#else> </#if></td>
        </tr>
        <tr>
            <td>Login</td>
            <td><#if user.login??>${user.login}<#else> </#if></td>
        </tr>
    </table>
</div>

<a type="button" href="/users" class="button">Back</a>
</body>
</html>

