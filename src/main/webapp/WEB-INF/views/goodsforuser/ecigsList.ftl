<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>E-CIGS</title>
    <link rel="stylesheet" href="resources/css/style.css" type="text/css" />
</head>
<body class="container">
<#include "*/templates/headerAdministrated.ftl">
<#include "*/templates/header.ftl">

<h1>E-CIGS</h1>

<#list goodsList as goods>
<div id="goodsBlock">
    <p><a href="/goods/${goods.id}"><img width="100%" height="100%" src="/resources/image/${goods.image}"></a></p>
    <p>${goods.name}</p>
    <div style="display: inline">${goods.price}$  <div class="btn-group" roleEnum="group" aria-label="...">
        <button type="button" class="btn btn-default">Buy</button></div></div>
</div>
</#list>
</body>
</html>