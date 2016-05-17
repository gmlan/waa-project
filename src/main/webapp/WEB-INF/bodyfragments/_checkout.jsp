
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<section>
    <div class=" jumbotron">
        <div class="container">
            <p class="text-center" >
            <h2>Add a checkout</h2>
            </p>
        </div>
    </div>
</section>



<form class="form-horizontal" role="form" method="post" action="checkout">
    <div class="form-group">
        <label for="isbn" class="col-sm-2 control-label">ISBN</label>
        <div class="col-sm-6">
            <select class="form-control mrgn-bttm-md" id="isbn">
                <option name="ISBN" value=""></option>
            </select>
        </div>
    </div>
    <div class="form-group">
        <label for="userId" class="col-sm-2 control-label">User Id</label>
        <div class="col-sm-6">

            <select class="form-control mrgn-bttm-md" id="userId">
                <c:forEach items="${userlist}" var="user">
                    <option name="userId" value="${user.userId}">${user.userId}</option>
                </c:forEach>
            </select>

        </div>
    </div>
    <div class="form-group">
        <label for="checkoutDate" class="col-sm-2 control-label">CheckOut Date</label>
        <div class="col-sm-6">
            <input type="text" name="dateCheckout" class="form-control" id="checkoutDate" placeholder="mm/dd/yyyy" />
        </div>
    </div>
    <div class="form-group">
        <label for="dueDate" class="col-sm-2 control-label">Due Date</label>
        <div class="col-sm-6">
            <input type="text" name="dueDate" class="form-control" id="dueDate" placeholder="mm/dd/yyyy" />
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-primary">Save</button>
        </div>
    </div>
</form>
