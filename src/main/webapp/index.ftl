<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>VAPES E-CIGS</title>
    <link rel="stylesheet" href="css/style.css" type="text/css" />
    <style type="text/css">
        .photo {
            vertical-align: top;
            width: 150px; /* Ширина */
            margin: 0 10px 10px 0; /* Отступы */
            padding: 10px 0; /* Поля сверху и снизу */
            text-align: center; /* Выравнивание по центру */
            display: inline-block; /* Строчно-блочный элемент */
        }
        .photo img {
            border: 2px solid #8b8e4b; /* Параметры рамки */
        }
        .photo p {
            margin: 0; /* Отступы */
        }
    </style>
</head>
<#include "WEB-INF/views/templates/headerAdministrated.ftl">
<#include "WEB-INF/views/templates/header.ftl">
<body class="container">

    <h1>FEATURED PRODUCTS</h1>

    <#list goodsList as goods>
        <div class="photo">
            <p><a href="/goods/${goods.id}"><img width="100%" height="100%" src="\resources\${goods.image}"></a></p>
            <p>${goods.name}</p>
            <p>${goods.price}$</p>
        </div>
    </#list>

</body>
</html>