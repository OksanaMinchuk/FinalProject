<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

        <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <%@ include file="/jsp/include.jsp" %>
    <link rel="stylesheet" href="<c:url value="/resources/css/style.css" />" />
</head>
<body>

<div class="footer" id="footercontext" align="center">
    <div class="row">
          <div class="col-sm-4"></div>
          <div class="col-sm-4"></div>
          <div class="col-sm-4">Follow us
              <a href="https://twitter.com" target="_blank">
                  <img src="resources/images/twitter.png" alt="twitter" class="twitter"/>
              </a>
              <a href="https://www.facebook.com" target="_blank">
                  <img src="resources/images/facebook.png" alt="facebook" class="facebook"/>
              </a>
              <a href="https://www.instagram.com" target="_blank">
                  <img src="resources/images/camera.png" alt="camera" class="camera"/>
              </a>
          </div>
    </div>
    <div class="row">
          <div class="col-sm-4"></div>
          <div class="col-sm-4">Copyright &copy; carbooking.com. 2018. All right reserved</div>
          <div class="col-sm-4"></div>
    </div>
</div>

</body>
</html>