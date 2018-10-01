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

                <div class="col-sm-4"  align="center">
                    <form:form id="infoForm" modelAttribute="order" action="orderInfo" method="post">
                        <table id="order-table">
                             <tr>
                                 <td>
                                      <form:label path="dateFrom">Date from</form:label>
                                 </td>
                                  <td>
                                      <form:input path="dateFrom" name="dateFrom" id="dateFrom" class="form-control" placeholder="YYYY-MM-DD"/>
                                 </td>
                            </tr>
                            <tr>
                                  <td>
                                       <form:label path="dateTo">Date to</form:label>
                                  </td>
                                  <td>
                                       <form:input path="dateTo" name="dateTo" id="dateTo" class="form-control" placeholder="YYYY-MM-DD"/>
                                  </td>
                            </tr>
                            <tr>
                                  <td>
                                       <form:label path="fromCity">From city</form:label>
                                  </td>
                                  <td>
                                       <form:input path="fromCity" name="fromCity" id="fromCity" class="form-control" placeholder="from City"/>
                                  </td>
                            </tr>
                            <tr>
                                  <td>
                                       <form:label path="toCity">To city</form:label>
                                  </td>
                                  <td>
                                       <form:input path="toCity" name="toCity" id="toCity" class="form-control" placeholder="to City"/>
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
                            <tr>
                                <td></td>
                                <td><p align="center" style="color: DarkBlue; font-style: italic"><h1>${message}<h1></p>
                                </td>
                            </tr>

                        </table>
                    </form:form>

                </div>
                <div class="col-sm-2"></div>
        </div>

        </div>

                <div>
                    <%@ include file="/jsp/footer.jsp" %>
                </div>
        </div>

</body>
</html>