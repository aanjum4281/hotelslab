<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>HERE ARE YOUR RESULTS</h1>
<ol>
<c:forEach var="hotel" items="${hotels}">
       <li>      ${hotel.name} in ${hotel.city}, Price per night is $${hotel.pricePerNight} </li>
            
</c:forEach>
 </ol>

</body>
</html>