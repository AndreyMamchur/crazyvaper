<form action="/newUser" method="post" name="user" class="form-group">
    <p>Name</p>
    <input title="Name" type="text" name="name" required/>
    <p>Email</p>
    <input title="Email" type="email" name="email" required/>
    <p>Password</p>
    <input title="Password" type="password" name="password" required/>
    <p>Phone Number</p>
    <input title="Phone Number" type="text" name="phoneNumber"/>
    <p>Date of Birth</p>
    <input title="Date of Birth" type="text" name="dateOfBirth"/>
    <p>Role</p>
    <input title="Role" type="text" name="role"/>
    <input type="submit" title="OK" value="OK!"/>
</form>

<br>
Delete 2
<form action="/delete" method="post" class="form-group">
    Id
    <input title="id" name="id"/>
    <input type="submit" title="OK" value="Delete"/>
</form>
