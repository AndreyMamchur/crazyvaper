
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>UserData</title>
</head>
<body class="container">
<#include "templates/headerAdministrated.ftl">
<#include "templates/header.ftl">

<form action="/editUser" method="post" name="user" class="form-group">
    <input title="Id" type="hidden" name="id" value="${user.id}"/>
    <input title="Name" type="text" name="name" value="${user.name}"/>
    <input title="Email" type="text" name="email" value="${user.email}"/>
    <input title="Date of Birth" type="text" name="dateOfBirth" <#if user.dateOfBirth??>value="${user.dateOfBirth}"<#else> </#if>/>
    <input title="PhoneNumber" type="text" name="phoneNumber" <#if user.phoneNumber??>value="${user.phoneNumber}"<#else> </#if>/>
    <input title="Role" type="text" name="roleEnum" <#if user.roleEnum??>value="${user.roleEnum}"<#else> </#if>/>
    <input title="Password" type="text" name="password" <#if user.password??>value="${user.password}"<#else> </#if>/>
    <#--<input title="Login" type="" name="login" value="${user.login}"/>-->
    <input type="submit" title="OK" value="Edit!"/>
</form>
<a type="button" href="/users" class="button">Back</a>
</body>
</html>