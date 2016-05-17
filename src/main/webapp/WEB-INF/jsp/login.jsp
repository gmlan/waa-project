<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet"
              href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
        <title>Products</title>
    </head>
    <body>
        <section>
            <div class="jumbotron">
                <div class="container">
                    <h2>Welcome to Library Management System</h2>
                    <p>The one and only amazing system</p>
                </div>
            </div>
        </section>
        <div class="container">
            <div class="row">
                <div class="col-md-4 col-md-offset-4">
                    <div class="panel-heading">
                        <h3 class="panel-title">Please sign in</h3>
                    </div>
                    <div class="panel-body">
                        <form:form modelAttribute="user" action="${pageContext.request.contextPath}/login" method="post">
                            <form:errors path="*" cssClass="alert alert-danger" element="div"/>
                            <fieldset>
                                <div class='form-group'>
                                    <form:input class="form-control" placeholder="User Name" path='userName' type="text" />
                                </div>
                                <div class="form-group">
                                    <form:input class='form-control' placeholder="Password"	path='password' type="password" />
                                </div>
                                <div class="form-group">
                                    <div class="checkbox">
                                        <label> <form:checkbox path="rememberme" />Remember Me
                                        </label>
                                    </div>
                                </div>
                                <input class="btn btn-lg btn-success btn-block" type="submit"	value="login">
                            </fieldset>
                        </form:form>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
