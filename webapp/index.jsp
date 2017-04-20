<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>JAVA TASK</title>
</head>
<body>
Hello
<div>
    <div>
        <form action="action" method="post">
            <textarea name="data" rows="20" cols="70" placeholder="Enter data">${data}</textarea>
            <button type="submit" value="action">Sort</button>
        </form>
    </div>

    <div>
        <c:if test="${not empty list}">
            <table border="1">
                <c:forEach var="element" items="${list}">
                    <tr>
                        <c:forEach var="data" items="${element.lineParts}">
                            <td>${data}</td>
                        </c:forEach>
                    </tr>
                </c:forEach>
            </table>
        </c:if>
        <br/>
    </div>

</div>
</body>
</html>
