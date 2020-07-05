<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<html>
    <head>
        <title>TryAgain</title>
    </head>
    <body>
        <h1> Either your username or password is incorrect. Please try again </h1>
        <form method="POST">

            <label>Please log in </label> <br/>
            <label>Username</label>
            <input type="text" name="username" /><br/>
            <label>Password </label>
            <input type="password" name="password" />
            <button type="submit">Login</button><br/>
            <a href="/Register">Create New Account</a>
        </form>
    </body>
</html>