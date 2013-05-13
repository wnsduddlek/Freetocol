<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <title>별들에게 물어봐</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- 여기서부터는 jquery입니다 -->
    <script src="http://code.jquery.com/jquery-1.9.1.js"></script>
	<script src="http://code.jquery.com/ui/1.10.2/jquery-ui.js"></script>

    
    
    
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
 	</c:if>
 	<c:if test="${session.eMail != null && session.memberCode == 1}">
		<jsp:include page="headerLogin.jsp" flush="false"/>
		<jsp:include page="warning.jsp" flush="false"/>
 	</c:if>
 	<c:if test="${session.eMail != null && session.memberCode == 2}">
		<jsp:include page="headerLogin.jsp" flush="false"/>
 	</c:if>
 	</div>
	<div class="modal hide" id="signup">
	  <div class="modal-header">
		<button type="button" class="close" data-dismiss="modal">x</button>
		<h3><i class="icon-pencil"></i> 회원가입</h3>
	  </div>
	  <div class="modal-body">
		<form method="post" action='' name="login_form">
		  <p>이메일<input type="text" class="span3" name="eid" id="email" placeholder="김준영@남자.com"></p>
		  <p>비밀번호<input type="password" class="span3" name="passwd" placeholder="8자 이상"></p>
		  <p><button type="submit" class="btn btn-primary">가입</button>
		  <button type="button" class="btn btn-info" data-dismiss="modal">취소</button>
		  </p>
		</form>
	  </div>
	</div>
<div class="container-narrow">
    <form class="form-search">
      <div class="btn-group" data-toggle="buttons-radio">
        <button type="button" class="btn active">교수별</button>
        <button type="button" class="btn">전공별</button>
        <button type="button" class="btn">학교별</button>
      </div>
      <input type="text" class="input-medium search-query">
      <button type="submit" class="btn btn-success">검색</button>
    </form>
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
            <p>김준영3.</p>
          </div>
          <div class="tab-pane" id="tab4">
            <p>김준영4.</p>
          </div>
          <div class="tab-pane" id="tab5">
            <p>김준영5.</p>
          </div>
        </div>
      </div> 
	  </div>
    <script type="text/javascript" src="docs/jquery-1.8.0.js"></script>
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