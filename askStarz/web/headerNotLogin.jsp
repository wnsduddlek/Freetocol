<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   	<script type="text/javascript">
	$(function(){
		$("#sign-in").click(function(){
			$("#loginForm").attr({action: 'askstarz?action=login&which=web&eMail='+$("input:text[name=username]").val()+'&password='+$("input:password[name=password]").val(), method : 'post'})
			.submit();
		});	
	
		
	});
	
	
	
	</script>
	
	

	<div class="container-narrow">
        <div class="navbar-inner">
            
          <a style="margin: auto; box-shadow: 0 2px 10px rgba(0,0,0,.1);" class="brand lime" href="loadingWeb.jsp"><img src="./img/c.png" width=140></a>
            <ul class="nav pull-right">
              <li><a data-toggle="modal" href="#signup"><i class="icon-pencil"></i> 회원가입</a></li>
              <li class="divider-vertical"></li>
              <li class="dropdown">
                <a class="dropdown-toggle" href="#" data-toggle="dropdown"><i class="icon-lock"></i> 로그인 <strong class="caret"></strong></a>
                <div class="dropdown-menu" style="padding: 15px; padding-bottom: 0px;">
                  <form id="loginForm" method="post" accept-charset="UTF-8">
                    <input style="margin-bottom: 15px;" type="text" placeholder="김준영 이메일" id="username" name="username">
                    <input style="margin-bottom: 15px;" type="password" placeholder="죽어라 비밀번호" id="password" name="password">
                    <input style="float: left; margin-right: 10px;" type="checkbox" name="remember-me" id="remember-me" value="1">
                    <label style="float: left;" class="string optional" for="user_remember_me">이메일 저장</label>
                    <input class="btn btn-primary btn-block" type="submit" id="sign-in" value="로그인">
                  </form>
                </div>
              </li>
            </ul>
        </div>
      </div>