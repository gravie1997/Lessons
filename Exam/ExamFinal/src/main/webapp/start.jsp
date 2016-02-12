<%-- 
    Document   : start
    Created on : 12.02.2016, 18:15:26
    Author     : Admin
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
    <a href="../../../../../../AppData/Local/Temp/registration.url"></a>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>StartPage</title>
        <style type="text/css">
                li{
                font-size: 180%;
                color: red;
                padding-top: 25pt;
            }
            
            table{
            padding-left: 1100px;
            min-height: 20px;
            color: red;
            }
            tr{
                
            }
            body{
                width: 100%;
                height: 100%;
                background-image: url(res/img/nike-desktop-wallpaper5.jpg);
                background-size: 100%;
            }
            .colortext{
                color: darkblue;
            }
            
            p{
                font-size: 250%;
                color: red;  
            }
            h1{
                color: red;
            }
      
            
        </style>
    </head>
    <body>  
         <table> 
        <tr> 
        <td> Login </td> 
        <td><input type="text" name= "login" placeholder="Login" required="required"> </td> 
        </tr> 
        <tr> 
        <td> Password </td> 
        <td><input type="password" name= "password" placeholder="Password" required="required"/> </td> 
        </tr> 
        <tr> 
        <td colspan="2"><input type="submit"value="Login"/> </td> 
        </tr> 
        <tr>
            <td colspan="3"><input type="submit"value="Registration"/></td>
            </td>
        </tr>
        </table>
        <p>
            Welcome to our shop! We are glad to see you! 
        </p>
        <p>
            Categories
        </p>
        <ul class="list" >
            <c:forEach var="item" items="${catigories}">
            <li> <a color="red" href="showcat?name=${item.name}">${item.name}</a> </li>  
            </c:forEach>
        </ul>
        

