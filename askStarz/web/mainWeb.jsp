<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>별들에게 물어봐</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- 여기서부터는 jquery입니다 -->
    <link rel="stylesheet" href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css" />
    <script src="http://code.jquery.com/jquery-1.9.1.js"></script>
	<script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>
	
	
    <!-- Le styles -->
    <link rel="stylesheet" type="text/css" href="css/metro-bootstrap_alt.css">
    <style>
        body
        {
            padding-top: 70px; /* 60px to make the container go all the way to the bottom of the topbar */
        }
		.container-narrow {
        margin: 0 auto;
        max-width: 700px;
        text-align: center;
      }
      .lime{
         background-color: #8cbf26;
      }
      .lime:hover{
        background-color: #79A521;
      }
      .form-search{
        margin: 50px 0 50px;
      }
    </style>
    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
    <body>
      <div class="navbar navbar-fixed-top">
    <c:set value="${sessionScope.userInfo}" var="session"/>
	<c:if test="${session.eMail == null}">
		<jsp:include page="headerNotLogin.jsp" flush="false"/>
		<jsp:include page="signUp.jsp" flush="false"/>
 	</c:if>
 	<c:if test="${session.eMail != null && session.memberCode == 0}">
		<jsp:include page="headerAdminLogin.jsp" flush="false"/>
 	</c:if>
 	<c:if test="${session.eMail != null && session.memberCode == 1}">
		<jsp:include page="headerLogin.jsp" flush="false"/>
		<jsp:include page="warning.jsp" flush="false"/>
 	</c:if>
 	<c:if test="${session.eMail != null && session.memberCode == 2}">
		<jsp:include page="headerLogin.jsp" flush="false"/>
 	</c:if>
 	</div>
	
<div class="container-narrow">
    	<jsp:include page="search.jsp" flush="false"/>
<div class="tabbable" style="margin-bottom: 18px;">
        <ul class="nav nav-pills">
          <li class="active"><a href="#tab1" data-toggle="tab">Great</a></li>
          <li><a href="#tab2" data-toggle="tab">Hot</a></li>
          <li><a href="#tab3" data-toggle="tab">Week</a></li>
          <li><a href="#tab4" data-toggle="tab">Understand</a></li>
          <li><a href="#tab5" data-toggle="tab">Happy</a></li>
        </ul>
        <div class="tab-content" style="padding-bottom: 9px; border-bottom: 1px solid #ddd;">
          <div class="tab-pane active" id="tab1">
			<jsp:include page="listByGreat.jsp" flush="false"/>
		  </div>
          <div class="tab-pane" id="tab2">
           	<jsp:include page="listByHot.jsp" flush="false"/>
          </div>
          <div class="tab-pane" id="tab3">
            <jsp:include page="listByWeek.jsp" flush="false"/>
          </div>
          <div class="tab-pane" id="tab4">
            <jsp:include page="listByUnderstand.jsp" flush="false"/>
          </div>
          <div class="tab-pane" id="tab5">
            <jsp:include page="listByHappy.jsp" flush="false"/>
          </div>
        </div>
      </div> 
	  </div>
    <script type="text/javascript" src="docs/bootstrap-tooltip.js"></script>
    <script type="text/javascript" src="docs/bootstrap-alert.js"></script>
    <script type="text/javascript" src="docs/bootstrap-button.js"></script>
    <script type="text/javascript" src="docs/bootstrap-carousel.js"></script>
    <script type="text/javascript" src="docs/bootstrap-collapse.js"></script>
    <script type="text/javascript" src="docs/bootstrap-dropdown.js"></script>
    <script type="text/javascript" src="docs/bootstrap-modal.js"></script>
    <script type="text/javascript" src="docs/bootstrap-popover.js"></script>
    <script type="text/javascript" src="docs/bootstrap-scrollspy.js"></script>
    <script type="text/javascript" src="docs/bootstrap-tab.js"></script>
    <script type="text/javascript" src="docs/bootstrap-transition.js"></script>
    <script type="text/javascript" src="docs/bootstrap-typeahead.js"></script>
    <script type="text/javascript" src="docs/jquery.validate.js"></script>
    <script type="text/javascript" src="docs/jquery.validate.unobtrusive.js"></script>
    <script type="text/javascript" src="docs/jquery.unobtrusive-ajax.js"></script>
    <script type="text/javascript" src="docs/metro-bootstrap/metro-docs.js"></script>
    </body>
</html>