<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>BasketData</title>
    <link rel="stylesheet" href="css/style.css" type="text/css" />
</head>
<body class="container">
<#include "templates/headerAdministrated.ftl">
<#include "templates/header.ftl">

<h1>Basket list</h1>
<table class="table">
    <tr id="nameOfColumns">
        <th width="20%">Id</th>
        <th width="80%">Goods</th>
    </tr>
<#list cartList as cart>
    <tr>
        <td width="20%"><a href="/cart/${cart.id}">${cart.id}</a>
        <td width="80%">
            <#list cart.goodsList as goods>
                <table class="table", border="0">
                    <tr >
                        <td style="border-width: 0px;border:none none;" width="50%">${goods.name}</td>
                        <td style="border-width: 0px;border:none none;" width="50%">${goods.price}$</td>
                    </tr>
                </table>
            </#list>
        </td>
    </tr>
</#list>
</table>
</body>
</html>