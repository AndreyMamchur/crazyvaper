
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>UserData</title>
</head>
<body class="container">
<#include "templates/header.ftl">

<form action="/editGoods" method="post" name="goods" class="form-group">
    <input title="Id" type="hidden" name="id" value="${goods.id}"/>
    <input title="Name" type="text" name="name" value="${goods.name}"/>
    <input title="Price" type="number" name="price" value="${goods.price}"/>
    <input type="submit" title="OK" value="Edit!"/>
</form>
<a type="button" href="/goodsList" class="button">Back</a>
</body>
</html>