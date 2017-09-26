<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>UserData</title>
    <link rel="stylesheet" href="css/style.css" type="text/css" />
</head>
<body class="container">
<#include "templates/header.ftl">

<h1>Goods list</h1>
        <table class="table table-striped">
        <tr id="nameOfColumns">
            <th>Id</th>
            <th>Name</th>
            <th>Price</th>
            <th>Buttons</th>
        </tr>
    <#list goodsList as goods>
        <tr>
            <td><a href="/goods/${goods.id}">${goods.id}</a></td>
            <td>${goods.name}</td>
            <td>${goods.price}</td>
            <td><a href="/deleteGoods/${goods.id}">Delete</a>
                <a href="/editG/${goods.id}">Edit</a>
            </td>
        </tr>
    </#list>
    </table>
<#include "templates/createGoodsForm.ftl"/>
</body>
</html>