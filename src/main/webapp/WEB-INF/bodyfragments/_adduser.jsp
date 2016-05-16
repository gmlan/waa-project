<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}" />

<h1>Add User</h1>
<form action="admin/add" method="POST" >
First Name : <input type="text" name="firstName" />

<div><input type="submit" value="Add" /></div>
</form>