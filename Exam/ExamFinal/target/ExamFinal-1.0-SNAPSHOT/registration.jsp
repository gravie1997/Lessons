<%-- 
    Document   : registration
    Created on : 12.02.2016, 18:14:44
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns:h="http://xmlns.jcp.org/jsf/html" xmlns:f="http://xmlns.jcp.org/jsf/core">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
        <style type="text/css">
            
            table{
                border: red;
                color: red;
                padding-left: 510px;
                padding-right: 590px;
                height: 150px;
                width: 150px;
            }
            body{
                width: 100%;
                height: 100%;
                background-image: url(res/img/nike.jpg);
                background-size: 100%;
            }
            
            TD{
                border: 1px solid red;
                padding: 5px;
            }
            
            
 
        </style>
    
    </head>
    <body>
        <form method="post" action="insertUser">
            <table>
                  <caption>Registration</caption>
                  <h1></h1>
                  <tr>
                      <td>Login</td>
                      <td><input type="text" name="name" required="required" placeholder="Login"/></td>
                  </tr>
                  <tr>
                      <td>Password</td>
                      <td><input type="password" name="passowrd" required="required" placeholder="Password"/></td>
                  </tr>
                  <tr>
                      <td>Name</td>
                      <td><input type="text" name="name" required="required" placeholder="Name"/></td>
                  </tr>
                  <tr>
                      <td>Lastname</td>
                   <td><input type="text" name="lastname" required="required" placeholder="Lastname"/></td>
                  </tr>
                  <tr>
                      <td>Email</td>
                      <td><input type="email" name="email" required="required" placeholder="Email"/></td>
                  </tr>
                  <tr>
                      <td>Phone</td>
                      <td><input type="text" name="phone" required="required" placeholder="Phone"/></td>
                  </tr>
                <tr>
                    <td colspan="2"> <input class="button" type="submit" value="Submit"/></td> 
                    
                </tr>  
                <c:forEach var="item" items="${userlist}">
                    <li><c:out value="${item.id}"/></li>
                    <c:out value="${item.login}"/></td>
                    <c:out value="${item.password}"/></td>
                    <li><c:out value="${item.name}"/></li>
                    <li><c:out value="${item.lastname}"/></li>
                    <li><c:out value="${item.email}"/></li>
                    <li><c:out value="${item.phone}"/></li>
        </form>
    </body>
</html>
