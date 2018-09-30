<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
        <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
        <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Login</title>
            <%@ include file="/jsp/include.jsp" %>
            <%@ include file="/jsp/header.jsp" %>
            <link rel="stylesheet" href="<c:url value="/resources/css/style.css" />" />
        </head>

        <body>
        <div class="wrapper">
        <div class="content">

            <form:form id="loginForm" modelAttribute="login" action="loginProcess" method="post">
                <table id="login-table">
                    <tr>
                        <td>
                            <form:label path="username">Username: </form:label>
                        </td>
                        <td>
                            <form:input path="username" name="username" id="username" required="required" class="form-control"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="password">Password:</form:label>
                        </td>
                        <td>
                            <form:password path="password" name="password" id="password" required="required" class="form-control"/>
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td align="left">
                            <form:button id="login" name="login" class="btn btn-info">Login</form:button>
                        </td>
                    </tr>
                    <tr></tr>
                    <tr>
                        <td></td>
                        <td><a href="home.jsp" style="color: DarkBlue; font-size: 16px; font-style: italic">back to home page</a>
                        </td>
                    </tr>
                </table>
                <p align="center" style="font-size: 20px; font-style: italic; color: red;">${message}</p>
            </form:form>

        </div>
            <div>
                <%@ include file="/jsp/footer.jsp" %>
            </div>
        </div>

        </body>
        </html>