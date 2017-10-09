<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>PaymentData</title>
</head>
<body class="container">
<#include "templates/headerAdministrated.ftl">
<#include "templates/header.ftl">
<caption>Payment info</caption>
<table class="table table-striped">
    <tr>
        <td>Id</td>
        <td>${paiment.id}</a></td>
    </tr>
    <tr>
        <td>Status</td>
        <td>${paiment.status}</td>
    </tr>
    <tr>
        <td>Time</td>
        <td>${paiment.time}</td>
</table>
</div>

<a type="button" href="/paymentList" class="button">Back</a>
</body>
</html>