<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<head>
    <meta charset="utf-8">
    <title>Data Center Login</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">


    <!--External CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

    <!--Internal CSS-->
    <link rel="stylesheet" href="Resources/css/main.css">
    <link rel="stylesheet" href="Resources/css/login.css">
</head>
<body>
<form class="form-signin" action="/login" method="POST">
    <h2>ACCOUNT LOGIN</h2>

    <div class ="group">
        <input type="email"  name="email" placeholder="Email" required>
        <span class="highlight"></span>
        <span class="bar"></span>

    </div>
    <div class ="group">
        <input type="password" name="password" placeholder="Password" required>
        <span class="highlight"></span>
        <span class="bar"></span>

    </div>
    <br>

    <br>
    <button class="btn-hover" style = "width: 100%;" type="submit"></button>
</form>


</body>
</html>