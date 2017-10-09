<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>
<#include "templates/headerAdministrated.ftl">
<#include "templates/header.ftl">
<table class="table" id="loginAndRegistration">
    <tr>
        <th>
            <legend>Log in</legend>
            <form action="/login" method="post" name="user" class="form-group">
                <p>Email</p>
                <input title="Email" type="email" name="email"/>
                <p>Password</p>
                <input title="Password" type="password" name="password"/>
                <input type="submit" title="OK" value="OK!"/>
            </form>
        </th>
        <th>
            <legend>Registration</legend>
            <form action="/newUser" method="post" name="user" class="form-group">
                <p>Name</p>
                <input title="Name" type="text" name="name"/>
                <p>Email</p>
                <input title="Email" type="email" name="email"/>
                <p>Password</p>
                <input title="Password" type="password" name="password"/>
                <input type="submit" title="OK" value="OK!"/>
            </form>
        </th>
    </tr>
</table>
</body>
</html>