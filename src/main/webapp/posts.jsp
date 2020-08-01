<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML>

<html>
<head>
    <title>Posts</title>

    <meta name = "viewport" content = "width = device-width, initial-scale = 1">
    <link rel = "stylesheet"
          href = "https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel = "stylesheet"
          href = "https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.3/css/materialize.min.css">
    <script type = "text/javascript"
            src = "https://code.jquery.com/jquery-2.1.1.min.js"></script>
    <script src = "https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.3/js/materialize.min.js">
    </script>
</head>

<body>
<div id="wrapper">
    <div id="header">
        <h2>All Posts!</h2>
    </div>
</div>

<div id="container">
    <div id="content">



<%--            <c:forEach var="posts" items="${allRecipes}">--%>

<%--                <tr>--%>
<%--                    <td> ${posts.title}--%>
<%--                    <td> ${posts.postDate}--%>
<%--                    <td> ${posts.shortDescription}--%>
<%--                    <td> ${posts.description}--%>
<%--                    <td> ${posts.users.username}--%>
<%--                </tr>--%>
<%--            </c:forEach>--%>
        <c:forEach var="posts" items="${allRecipes}">
        <div class="row">
            <div class="col s4 m6 l3">
                <div class="card blue-grey darken-1">
                    <div class="card-content white-text">
                        <span class="card-title">${posts.title}</span>
                        <p style="font-size: 70%">${posts.users.username}</p>
                        <p>${posts.shortDescription}</p>
                    </div>
                    <div class="card-action">
                    </div>
                </div>
            </div>
        </div>
        </c:forEach>


    </div>
</div>

</body>
</HTML>