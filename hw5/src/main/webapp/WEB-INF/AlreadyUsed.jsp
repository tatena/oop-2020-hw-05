<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<html>
    <head>
        <title>AlreadyUsed</title>
    </head>
    <body>
        <h1> The name ${name} is already in use </h1>
        <form method="POST">

            <label>Please enter another name and password </label> <br/>
            <label>Username</label>
            <input type="text" name="username" /><br/>
            <label>Password </label>
            <input type="password" name="password" />
            <button type="submit">Login</button><br/>
        </form>
    </body>
</html>