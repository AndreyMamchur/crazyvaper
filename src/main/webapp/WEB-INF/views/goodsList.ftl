<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>GoodsData</title>
    <link rel="stylesheet" href="resources/css/style.css" type="text/css" />

    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body class="container">
<#include "templates/headerAdministrated.ftl">
<#include "templates/header.ftl">

<h1>FEATURED PRODUCTS</h1>

<!-- Single button -->
<div class="btn-group">
    <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
        Sort by <span class="caret"></span>
    </button>
    <ul class="dropdown-menu">
        <li><a href="/sortGoodsByPrice">Price, low to high</a></li>
        <li><a href="#">Price, high to low</a></li>
        <li><a href="/sortGoodsByName">Alphabet, A-Z</a></li>
        <li><a href="#">Alphabet, Z-A</a></li>
        <li><a href="#">Best seling</a></li>
    </ul>
</div>
<br>

<#list goodsList as goods>
<div id="goodsBlock">
    <p><a href="/goods/${goods.id}"><img width="100%" height="100%" src="/resources/image/${goods.image}"></a></p>
    <p>${goods.name}</p>
    <div style="display: inline">${goods.price}$  <div class="btn-group" roleEnum="group" aria-label="...">
        <button type="button" class="btn btn-default" formaction="">Buy</button></div></div>
</div>
</#list>
</body>
</html>