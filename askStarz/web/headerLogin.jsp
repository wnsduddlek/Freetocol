<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


	<div class="container-narrow">
        <div class="navbar-inner">
            
          <a style="margin: auto; box-shadow: 0 2px 10px rgba(0,0,0,.1);" class="brand lime" href="#"><img src="./img/c.png" width=140></a>
            <ul class="nav pull-right">
              <li>${sessionScope.userInfo.nickName} 님<br/>
              	${sessionScope.userInfo.point }점
              </li>
              <li class="divider-vertical"></li>
              <li class="dropdown">
                <a data-toggle="button" href="askstarz?action=logout&which=web"><i class="icon-lock"></i> 로그아웃</a></a>
              </li>
              
            </ul>
            
        </div>
        
      </div>
