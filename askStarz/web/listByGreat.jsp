<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div class="row">
         	<div class="metro span5">
       	     <div id="tile-listview-demo" class="tile-listviewitem-container">
   			<c:forEach items="${requestScope.listByGreat}" var="evaluationEach" begin="0" end="2" varStatus ="status">
		
               <div class="row-fluid">
                  <div class="tile-listviewitem">
                     <div class="span3">
                        	<a href="askstarz?action=detail&professorCode=${evaluationEach.professorCode}&which=web">
								<c:if test="${status.index == '0'}">
								<img src="./img/one.png" width="100" height="100"/>
								</c:if>
								<c:if test="${status.index == 1}">
								<img src="./img/two.png" width="100" height="100"/>
								</c:if>
								<c:if test="${status.index == 2}">
								<img src="./img/three.png" width="100" height="100"/>
								</c:if>
							</a>
                     </div>
                     <div class="span8">
                        <div class="detail">
                           <div class="title">${evaluationEach.professorName}</div>
                           <div class="subtitle">${evaluationEach.schoolName}  ${evaluationEach.majorName}</div>
                           <p> 
                           Hot : ${evaluationEach.hotScore}
                           Week : ${evaluationEach.weekScore}
                           Understand : ${evaluationEach.understandScore}
                           Happy : ${evaluationEach.happyScore}
                           
                           </p>
                        </div>
                     </div>
					 <div class="span1">
						<div style="float: right;" class="overall">
						<fmt:formatNumber value="${evaluationEach.greatScore/100*(4.5)}" type="number" var="numberType"/>
											점수 ${numberType}/4.5</div>
					</div>
                  </div>
               </div>
           </c:forEach>    
               <c:forEach items="${requestScope.listByGreat}" var="evaluationEach" begin="3" varStatus ="status">
		
               <div class="row-fluid">
                  <div class="tile-listviewitem">
                     <div class="span3">
                        	
                     </div>
                     <div class="span8">
                        <div class="detail">
                           <div class="title"><a href="askstarz?action=detail&professorCode=${evaluationEach.professorCode}&which=web">${evaluationEach.professorName}</a></div>
                           <div class="subtitle">${evaluationEach.schoolName}  ${evaluationEach.majorName}</div>
                           <p> 
                           Hot : ${evaluationEach.hotScore}
                           Week : ${evaluationEach.weekScore}
                           Understand : ${evaluationEach.understandScore}
                           Happy : ${evaluationEach.happyScore}
                           
                           </p>
                        </div>
                     </div>
					 <div class="span1">
						<div style="float: right;" class="overall"><fmt:formatNumber value="${evaluationEach.greatScore/100*(4.5)}" type="number" var="numberType"/>
											점수 ${numberType}/4.5</div>
					</div>
                  </div>
               </div>
           </c:forEach>    
            </div>
         </div>

</div>