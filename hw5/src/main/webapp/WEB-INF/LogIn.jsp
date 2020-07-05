<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<html>
    <head>
        <title>Login</title>
    </head>
    <body>
        <h1> Welcome to Homework 5 </h1>
        <form method="POST">

            <label>Please log in </label> <br/>
            <label>Username</label>
            <input id = "username" type="text" name="username" /><br/>
            <label>Password </label>
            <input id = "password" type="password" name="password" />
            <button type="submit">Login</button><br/>
            <a href="/Register"> Create New Account </a>
        </form>
    </body>
</html>