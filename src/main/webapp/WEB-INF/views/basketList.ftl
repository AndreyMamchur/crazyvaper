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
<#list basketList as basket>
    <tr>
        <td width="20%"><a href="/basket/${basket.id}">${basket.id}</a>
        <td width="80%">
            <#list basket.goodsList as goods>
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