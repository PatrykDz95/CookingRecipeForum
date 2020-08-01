<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Create an account</title>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <!--Import materialize.css-->
    <link type="text/css" rel="stylesheet" href="resources/css/materialize.min.css"  media="screen,projection"/>
    <!--JavaScript at end of body for optimized loading-->
    <script type="text/javascript" src="resources/js/materialize.min.js"></script>
</head>
<body>

<h2>
    <security:authorize access="hasAnyRole('ROLE_ADMIN','ROLE_USER')">
        <p>
            Welcome to my page!</p>
        You are logged in as: <security:authentication property="principal.username" />
        </p>
    </security:authorize>
</h2>

<!-- Dropdown Structure -->
<ul id="dropdown1" class="dropdown-content">
    <li><a href="#!">one</a></li>
    <li><a href="#!">two</a></li>
    <li class="divider"></li>
    <li><a href="#!">three</a></li>
</ul>
<nav>
    <div class="nav-wrapper">
        <a href="#!" class="brand-logo">Logo</a>
        <ul class="right hide-on-med-and-down">
            <li><a onclick="document.forms['logoutForm'].submit()">Logout</a></li>
            <li><a href="badges.html">Components</a></li>
            <!-- Dropdown Trigger -->
            <li><a class="dropdown-trigger" href="#!" data-target="dropdown1">Dropdown<i class="material-icons right">arrow_drop_down</i></a></li>
        </ul>
    </div>
</nav>


<div class="container">
    <c:if test="${pageContext.request.userPrincipal.name != null}">
        <form id="logoutForm" method="POST" action="${contextPath}/logout">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>

        <h2>Welcome ${pageContext.request.userPrincipal.name} | <a onclick="document.forms['logoutForm'].submit()">Logout</a></h2>
        <a class="waves-effect waves-light btn" href="${pageContext.request.contextPath}/recipes/posts">Show all posts!</a>
        <a class="waves-effect waves-light btn" href="${pageContext.request.contextPath}/chat.html"><i class="material-icons left">cloud</i>Chat!</a>
        <a class="waves-effect waves-light btn" href="${pageContext.request.contextPath}/recipes/post/${pageContext.request.userPrincipal.name}"><i class="material-icons right">cloud</i>Show your posts!</a>

    </c:if>


</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>
