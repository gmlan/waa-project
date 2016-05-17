<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<h1>Add User</h1>
<hr> 
<form:form id="test" action="admin/add" modelAttribute="newUser" class="form-horizontal">
    <form:errors path="*" cssClass="alert alert-danger" element="div"/>
    <fieldset>      
        <form:hidden id="userId" path="userId"  class="form:input-large" />
       
         <h4>Login Info</h4>
         <hr>
        <div class="row">
            <div class="col-md-4">
                    <div class="input-group">
                            <span class="input-group-addon" id="basic-addon1">User Name</span>
                            <form:input path="userName" class="form-control" />
                    </div>
            </div>
            <div class="col-md-2">
                    <form:errors path="userName" cssStyle="color:red" />
            </div>
        </div>
        <br />
        
        <div class="row">
            <div class="col-md-4">
                    <div class="input-group">
                            <span class="input-group-addon" id="basic-addon1">Password</span>
                            <form:password path="password" class="form-control" />
                    </div>
            </div>
            <div class="col-md-2">
                    <form:errors path="password" cssStyle="color:red" />
            </div>
        </div>
        <br />
             
        <div class="row">
            <div class="col-md-4">
                    <div class="input-group">
                            <span class="input-group-addon" id="basic-addon1">Reenter Password</span>
                            <input id="password"  type="password" class="form-control" />
                    </div>
            </div>
            <div class="col-md-2">
                    <form:errors path="password" cssStyle="color:red" />
            </div>
        </div>
         <br />
         
         <h4>Basic Info</h4>
         <hr>
         
         <div class="row">
                <div class="col-md-4">
                        <div class="input-group">
                                <span class="input-group-addon" id="basic-addon1">First Name</span>
                                <form:input path="firstName" class="form-control" />
                        </div>
                </div>
                <div class="col-md-2">
                        <form:errors path="firstName" cssStyle="color:red" />
                </div>

                <div class="col-md-4">
                        <div class="input-group">
                                <span class="input-group-addon" id="basic-addon1">Last Name</span>
                                <form:input path="lastName" class="form-control" />
                        </div>
                </div>
                <div class="col-md-2">
                        <form:errors path="lastName" cssStyle="color:red" />
                </div>
        </div>
        <br />

         <div class="row">
                <div class="col-md-4">
                        <div class="input-group">
                                <span class="input-group-addon" id="basic-addon1">Email</span>
                                <form:input path="email" class="form-control" />
                        </div>
                </div>
                <div class="col-md-2">
                        <form:errors path="email" cssStyle="color:red" />
                </div>

                <div class="col-md-4">
                        <div class="input-group">
                                <span class="input-group-addon" id="basic-addon1">Address</span>
                                <form:input path="address" class="form-control" />
                        </div>
                </div>
                <div class="col-md-2">
                        <form:errors path="address" cssStyle="color:red" />
                </div>
        </div>
        <br />
        
          <div class="row">
                <div class="col-md-4">
                        <div class="input-group">
                                <span class="input-group-addon" id="basic-addon1">Phone</span>
                                <form:input path="phone" class="form-control" />
                        </div>
                </div>
                <div class="col-md-2">
                        <form:errors path="phone" cssStyle="color:red" />
                </div>

                <div class="col-md-4">
                        <div class="input-group">
                               <span class="input-group-addon" id="basic-addon1">Enabled</span>
                               <span class="input-group-addon"><form:checkbox path="enabled" /></span>                         
                        </div>
                </div>
                <div class="col-md-2">
                        <form:errors path="enabled" cssStyle="color:red" />
                </div>
        </div>
        <br />
        
         <div class="row">
                <div class="col-md-4">
                        <div class="input-group">
                                <span class="input-group-addon" id="basic-addon1">User Type</span>                                
                                <span class="input-group-addon"><form:radiobutton path="type"  value="Administrator" /> Administrator</span>
                                <span class="input-group-addon"><form:radiobutton path="type"  value="Librarian" /> Librarian</span>
                        </div>
                </div>
                <div class="col-md-2">
                        <form:errors path="type" cssStyle="color:red" />
                </div>
        </div> 
                
         <br/>
        <div class="row">
            <div class="col-md-4">
                <input type="submit" id="btnAdd" class="btn btn-primary" value="Add" />
            </div>
        </div>
    </fieldset>
</form:form> 