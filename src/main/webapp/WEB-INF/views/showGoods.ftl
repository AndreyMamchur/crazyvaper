<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>GoodsData</title>
</head>
<body class="container">
<#include "templates/headerAdministrated.ftl">
<#include "templates/header.ftl">
    <caption>Goods info</caption>
    <table class="table table-striped">
        <tr>
            <td>Name</td>
            <td>${goods.name}</td>
        </tr>
        <tr>
            <td>Brands</td>
            <td>${goods.brands}</td>
        </tr>
        <tr>
            <td>Color</td>
            <td>${goods.color}</td>
        </tr>
        <tr>
            <td>Price</td>
            <td>${goods.price}$</td>
        </tr>
        <tr>
            <td>Info</td>
            <td>${goods.prodDescription}</td>
        </tr>
    </table>
</div>

<a type="button" href="/goodsList" class="button">Back</a>
</body>
</html>