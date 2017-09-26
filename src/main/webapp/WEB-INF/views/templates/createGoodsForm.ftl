<form action="/newGoods" method="post" name="goods" class="form-group">
    <p>Name</p>
    <input title="Name" type="text" name="name"/>
    <p>Price</p>
    <input title="Price" type="number" name="price"/>
    <input type="submit" title="OK" value="OK!"/>
</form>

<br>
Delete 2
<form action="/deleteGoods" method="post" class="form-group">
    Id
    <input title="id" name="id"/>
    <input type="submit" title="OK" value="Delete"/>
</form>