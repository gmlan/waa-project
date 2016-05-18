
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<section>
    <div class=" jumbotron">
        <div class="container">
            <p class="text-center" >
            <h2>Add Checkout</h2>
            </p>
        </div>
    </div>
</section>



<form:form class="form-horizontal" modelAttribute="newCheckOut" >
    <div class="form-group">
        <label for="isbn" class="col-sm-2 control-label">ISBN</label>
        <div class="col-sm-6">
            <form:select path="ISBN" class="form-control mrgn-bttm-md" id="isbn">
                <form:option value="">--SELECT ONE--</form:option>
                <c:forEach items="${bookList}" var="book">
                    <form:option value="${book.isbn}">${book.isbn}</form:option>
                </c:forEach>
            </form:select>
        </div>
    </div>
    <div class="form-group">
        <label for="memberId" class="col-sm-2 control-label">User Id</label>
        <div class="col-sm-6">

            <form:select path="memberId" class="form-control mrgn-bttm-md" id="memberId">
                <form:option value="">--SELECT ONE--</form:option>
                <c:forEach items="${memberList}" var="member">
                    <form:option value="${member.memberId}">${member.memberId}</form:option>
                </c:forEach>
            </form:select>

        </div>
    </div>
    <div class="form-group">
        <label for="checkoutDate" class="col-sm-2 control-label">CheckOut Date</label>
        <div class="col-sm-6">
            <form:input type="text" path="dateCheckout" class="form-control" id="checkoutDate" placeholder="mm/dd/yyyy" />
        </div>
    </div>
    <div class="form-group">
        <label for="dueDate" class="col-sm-2 control-label">Due Date</label>
        <div class="col-sm-6">
            <form:input type="text" path="dueDate" class="form-control" id="dueDate" placeholder="mm/dd/yyyy" />
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <input type="submit" class="btn btn-primary" value="Save" />
        </div>
    </div>
</form:form>
