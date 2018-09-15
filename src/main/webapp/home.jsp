<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <%@ include file="/jsp/include.jsp" %>
        <%@ include file="/jsp/header.jsp" %>
        <link rel="stylesheet" href="<c:url value="/resources/css/style.css" />" />
    </head>

    <body>

    <div class="wrapper">
    <div class="content">

        <div align="center" style="margin-top: 100px">
        <table width=500px border="1"  style="border: 5px ridge DarkBlue">
            <tr>
                <td colspan="2">
                    <p align="center" style="color: DarkBlue; font-weight: bold; font-size: 24px; margin: 10px">
                                        What you need to know for your car rental:</p>
                    <p align="center"><a href="conditions.jsp" style="color: DarkRed; font-size: 20px; font-style: italic">
                                        Important information about your rental</a></p>
                </td>
            </tr>
            <tr>
                <td>
                    <p style="color: DarkBlue; font-weight: bold; font-size: 18px; margin: 10px">If you have an account, please sign in:</p>
                </td>
                <td>
                    <p align="center" style="margin: 10px"><a style="color: DarkGreen" href="login">SIGN IN</a></p>
                </td>
            </tr>
            <tr>
                <td>
                    <p style="color: DarkBlue; font-weight: bold; font-size: 18px; margin: 10px">New to Carbooking?</p>
                    <p style="color: DarkBlue; font-weight: bold; font-size: 18px; margin: 10px">Create an account for free:</p>
                </td>
                <td>
                    <p align="center" style="margin: 10px"><a style="color: DarkGreen" href="register">REGISTER</a></p>
                </td>
            </tr>
        </table>
        </div>
            <div class="container" id="textcontent1" style="margin-top: 120px" >
                <p align="center" id="textcontent2"><u>Why use our service?</u></p>
                <div class="row">
                    <div class="col-sm-6">
                        <ul>
                            <li>Low rental rates</li>
                            <li>No booking fees</li>
                            <li>Find great value rental rates and exclusive specials</li>
                        </ul>
                    </div>
                    <div class="col-sm-6">
                        <ul>
                            <li>24/7 customer service</li>
                            <li>Dedicated phone and email customer service</li>
                            <li>Manage your booking online</li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>


        <div>
            <%@ include file="/jsp/footer.jsp" %>
        </div>
    </div>
    </div>

    </body>
    </html>