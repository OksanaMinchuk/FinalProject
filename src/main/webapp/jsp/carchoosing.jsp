<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
        <html>

        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Carchoosing</title>
            <%@ include file="/jsp/include.jsp" %>
            <%@ include file="/jsp/header.jsp" %>
            <link rel="stylesheet" href="<c:url value="/resources/css/style.css" />" />
        </head>

        <body>
        <div class="wrapper">
        <div class="content">

        <div class="row" id="order-page" align="center">
            <div class="col-sm-2"></div>
                <div class="col-sm-4" id="order-table" align="center">

                    <form:form id="bookForm" modelAttribute="car" action="orderCar" method="post">
                        <table>
                            <tr>
                                <td></td>
                                <td>
                                    <p align="center" style="color: DodgerBlue; font-weight: bold">Fill out the form, please</p>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <form:label path="model" >Model</form:label>
                                </td>
                                <td>
                                    <form:select path="model" name="model" id="model" class="form-control" items="${carModels}"/>
                                </td>
                            </tr>
                            <tr>
                                <td></td>
                                <td>
                                    <form:button id="choose" name="choose" class="btn btn-info">Submit</form:button>
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

                    <div class="col-sm-4" id="car-database-table" align="center">
                        <table>
                                <tr>
                                    <td colspan="3">
                                        <p align="center" style="color: DodgerBlue; font-weight: bold">Cars available for order</p>
                                    </td>
                                </tr>
                            <c:forEach var="carInfo" items="${carInfoAttr}">
                                <tr>
                                    <td>${carInfo.model}</td>
                                    <td>${carInfo.transmission}</td>
                                    <td>price per day is ${carInfo.pricePerDay} USD</td>
                                </tr>
                            </c:forEach>
                        </table>
                    </div>
                    <div class="col-sm-2"></div>
        </div>
                        <div>
                            <h1>${myCar}</h1>
                            <p>${car.transmission}</p>

                        </div>

                        <div>
                             <p>${myOrder}</p>
                        </div>
        </div>
                        <div>
                            <%@ include file="/jsp/footer.jsp" %>
                        </div>
        </div>

</body>
</html>