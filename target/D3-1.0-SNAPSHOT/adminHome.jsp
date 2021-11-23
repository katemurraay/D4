<%--
  Created by IntelliJ IDEA.
  User: katem
  Date: 23/11/2021
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"  import ="com.complex.entity.User" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Admin Home</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">


    <!-- Bootstrap & External CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

    <!--Internal CSS-->
    <link rel ="stylesheet" href="Resources/css/admin.css">
    <link rel="stylesheet" href="Resources/css/main.css">



</head>

<body>
<div class="navbar">


    <img src ="Resources/images/kmhklogo.png" alt ="logo" class="logo">
    <div class="rightnav">
        <% User user = (User)session.getAttribute("SKUSER"); %>
        <a href="#" class="navbar-link">Welcome <%= user.getFirstName() %></a>
        <a href="index.jsp"><i class="fa fa-power-off"></i></a>


    </div>

</div>






<div class="container">
    <a href="UserManagement?action=List">
        <div class="card">
            <img src="Resources/images/admin/mgt-user.png" alt="avatar" style="width:100%">


            <br>
            <br>
            <p>Update, Remove or Disable Users</p>


        </div>
    </a>

    <a href="ProductManagement?action=report">
        <div class="card">

            <img src="Resources/images/admin/mgt-product.png" alt="avatar" style="width:100%">
            <br>
            <br>
            <p>Add, Edit or Remove Products</p>



        </div>
    </a>


    <a href="adminReport.jsp">
        <div class="card">

            <img src="Resources/images/admin/report.png" alt="avatar" style="width:100%">
            <br>
            <br>
            <p>Inventory Levels, Total Sales and User Activity</p>




        </div>
    </a>
</div>

<footer>

</footer>



</body>
</html>
