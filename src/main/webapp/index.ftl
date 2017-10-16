<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>VAPES E-CIGS</title>
    <link rel="stylesheet" href="resources/css/style.css" type="text/css" />
</head>
<#include "WEB-INF/views/templates/headerAdministrated.ftl">
<#include "WEB-INF/views/templates/header.ftl">
<body class="container">

<#--<#include "WEB-INF/views/goodsList.ftl">-->
    <h1>FEATURED PRODUCTS</h1>

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