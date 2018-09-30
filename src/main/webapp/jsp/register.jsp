<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
        <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Registration</title>
            <%@ include file="/jsp/include.jsp" %>
            <%@ include file="/jsp/header.jsp" %>
            <link rel="stylesheet" href="<c:url value="/resources/css/style.css" />" />
        </head>

        <body>
        <div class="wrapper">
        <div class="content">

            <form:form id="regForm" modelAttribute="user" action="registerProcess" method="post">

                <table id="registration-table">
                    <tr>
                        <td>
                        </td>
                        <td>
                            <p align="center" style="color: DarkBlue; font-weight: bold">Fill out the registration form, please</p>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="firstname" >FirstName</form:label>
                        </td>
                        <td>
                            <form:input path="firstname" name="firstname" id="firstname" required="required" class="form-control" placeholder="firstname" title="firstname"/>
                        </td>
                    </tr>
                    <tr>
                         <td>
                              <form:label path="lastname">LastName</form:label>
                         </td>
                          <td>
                              <form:input path="lastname" name="lastname" id="lastname" required="required" class="form-control" placeholder="lastname" title="lastname"/>
                         </td>
                    </tr>
                    <tr>
                          <td>
                               <form:label path="dateOfBirth">Date of birth</form:label>
                          </td>
                          <td>
                               <form:input path="dateOfBirth" name="dateOfBirth" id="dateOfBirth" required="required" class="form-control" placeholder="YYYY-MM-DD" title="YYYY-MM-DD"/>
                          </td>
                    </tr>
                    <tr>
                          <td>
                               <form:label path="numPassport">Passport number</form:label>
                          </td>
                          <td>
                               <form:input path="numPassport" name="numPassport" id="numPassport" required="required" class="form-control" type="text" placeholder="AB123456" pattern="[A-Z]{2}+[0-9]{6}" title="AB123456"/>
                          </td>
                    </tr>
                    <tr>
                          <td>
                               <form:label path="numTel">Telephone number</form:label>
                          </td>
                          <td>
                               <form:input path="numTel" name="numTel" id="numTel" required="required" class="form-control" type="tel"
                               placeholder="+375-00-123-45-67" pattern="\+375\-[0-9]{2}\-[0-9]{3}\-[0-9]{2}\-[0-9]{2}" title="+375-00-123-45-67"/>
                          </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="username">Username</form:label>
                        </td>
                        <td>
                            <form:input path="username" name="username" id="username" required="required" class="form-control" placeholder="username" title="username"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="password">Password</form:label>
                        </td>
                        <td>
                            <form:password path="password" name="password" id="password" required="required" class="form-control" placeholder="password" title="password"/>
                        </td>
                    </tr>
                    <tr>
                    <tr>
                        <td></td>
                        <td>
                            <form:button id="register" name="register" class="btn btn-info">Register</form:button>
                        </td>
                    </tr>
                    <tr></tr>
                    <tr>
                        <td></td>
                        <td><a href="home.jsp" style="color: DarkBlue; font-size: 16px; font-style: italic">back to home page</a>
                        </td>
                    </tr>
                </table>
            </form:form>

        </div>
            <div>
                <%@ include file="/jsp/footer.jsp" %>
            </div>
        </div>

        </body>
        </html>