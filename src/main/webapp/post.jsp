<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML>

<html>
<head>
    <title>Posts</title>

    <!-- reference our style sheet -->
</head>

<body>
<div id="wrapper">
    <div id="header">
        <h2>All Posts!</h2>
    </div>
</div>

<div id="container">
    <div id="content">

        <!-- add our html table here -->
        <table>
            <tr>
                <th>Title</th>
                <th>Date</th>
                <th>Short Description</th>
                <th>Description</th>
                <th>User</th>
            </tr>

            <c:forEach var="posts" items="${recipeByUser}">

                <tr>
                    <td> ${posts.title}
                    <td> ${posts.postDate}
                    <td> ${posts.shortDescription}
                    <td> ${posts.description}
                    <td> ${posts.users.username}
                </tr>
            </c:forEach>
        </table>
    </div>
</div>

</body>
</HTML>