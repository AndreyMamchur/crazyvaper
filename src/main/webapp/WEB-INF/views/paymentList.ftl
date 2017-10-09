<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>PaymentsData</title>
    <link rel="stylesheet" href="css/style.css" type="text/css" />
</head>
<body class="container">
<#include "templates/headerAdministrated.ftl">
<#include "templates/header.ftl">
<#--<div class="table-responsive" style="background-color: aqua">-->
<h1>Payments list</h1>
<table class="table table-striped">
    <tr id="nameOfColumns">
        <th>Id</th>
        <th>User</th>
        <th>Total Price</th>
        <th>Status</th>
        <th>Buttons</th>
    </tr>
<#list paymentList as payment>
    <tr>
        <td><a href="/payment/${payment.id}">${payment.id}</a>
        <td>${payment.user.name}</td>
        <td>${payment.totalPrice}</td>
        <td>${payment.status}</td>
        <td><a href="/delete/${payment.id}">Delete</a>
            <a href="/edit/${payment.id}">Edit</a>
        </td>
    </tr>
</#list>
</table>
<#--</div>-->
</body>
</html>