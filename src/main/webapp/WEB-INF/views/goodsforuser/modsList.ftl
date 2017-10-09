<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>MODS</title>
    <link rel="stylesheet" href="css/style.css" type="text/css" />
</head>
<body class="container">
<#include "*/templates/headerAdministrated.ftl">
<#include "*/templates/header.ftl">

<h1>MODS</h1>

<#--<a href="/sortGoodsByPrice">Sort by price</a> | <a href="/sortGoodsByName">Sort by name</a>-->
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
</body>
</html>