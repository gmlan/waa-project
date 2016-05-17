<h2>Hi All</h2>
 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Book</title>
</head>
<body>
	<div class="container">
		<div class="page-header ">
			
				<ul class="breadcrumb">
					<li><a href="${pageContext.request.contextPath}/book"><h3>Books
							</h3></a></li>
					<li><h3>/ Add Book</h3></li>
				</ul>
		</div>

		<br />

		<form:form modelAttribute="book"
			action="${pageContext.request.contextPath}/books/add" method="post"
			enctype="multipart/form-data">

			<div class="row">
				<div class="col-md-4">
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">Title</span>
						<form:input path="title" class="form-control" />
					</div>
				</div>
				<div class="col-md-2">
					<form:errors path="title" cssStyle="color:red" />
				</div>

				<div class="col-md-4">
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">ISBN</span>
						<form:input path="isbn" class="form-control" />
					</div>
				</div>
				<div class="col-md-2">
					<form:errors path="isbn" cssStyle="color:red" />
				</div>
			</div>
			<br />

			<div class="row">
				<div class="col-md-4">
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">Price</span>
						<form:input path="price" class="form-control" />
					</div>
				</div>
				<div class="col-md-2">
					<form:errors path="price" cssStyle="color:red" />
				</div>
				<div class="col-md-4">
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">Quantity</span>
						<form:input path="quantity" class="form-control" />
					</div>
				</div>
				<div class="col-md-2">
					<form:errors path="quantity" cssStyle="color:red" role="alert" />
				</div>
			</div>
			<br />
			<div class="row">
				<div class="col-md-4">
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">Length</span>
						<form:input path="length" class="form-control" />
					</div>
				</div>
				<div class="col-md-2">
					<form:errors path="length" cssStyle="color:red" />
				</div>

				<div class="col-md-4">
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">Language</span>
						<form:input path="language" class="form-control" />
					</div>
				</div>
				<div class="col-md-2">
					<form:errors path="language" cssStyle="color:red" role="alert" />
				</div>
			</div>
			<br />
			<div class="row">
				<div class="col-md-4">
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">Dimensions</span>
						<form:input path="dimension" class="form-control"
							placeholder="2.5'' * 3.4'' * 4.0''" />
					</div>
				</div>
				<div class="col-md-2">
					<form:errors path="dimension" cssStyle="color:red" role="alert" />
				</div>

				<div class="col-md-4">
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">Release
							Date</span>
						<form:input path="releaseDate" class="form-control"
							placeholder="yyyy-MM-dd" />
					</div>
				</div>
				<div class="col-md-2">
					<form:errors path="releaseDate" cssStyle="color:red" role="alert" />
				</div>
			</div>
			<br />

			<div class="row">

				<div class="col-md-4">
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">Book
							Cover</span>
						<form:input path="cover" class="form-control" type="file" />
					</div>
				</div>
				<div class="col-md-2">
					<form:errors path="cover" cssStyle="color:red" />
				</div>

				<div class="col-md-4">
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">Book Type
						</span>
						<form:select path="bookType" items="${bookTypes}"
							class="form-control"></form:select>
					</div>
				</div>
				<div class="col-md-2">
					<form:errors path="bookType" cssStyle="color:red" role="alert" />
				</div>

			</div>
			<br />
			<div class="row">

				<div class="col-md-4">
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">Book
							Category</span>
						<form:select path="bookCategory" class="form-control"
							items="${bookCategories }" />
					</div>
				</div>
				<div class="col-md-2">
					<form:errors path="bookCategory" cssStyle="color:red" role="alert" />
				</div>

				<div class="col-md-4">
                                    <!-- 
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">Authors </span>
						<!--form:select path="authorIds" items="$authors}" class="form-control" itemLabel="fullName" itemValue="id"><!--/form:select -->

<!--					</div>-->
                                    
				</div>
				<div class="col-md-2">
					<!--form:errors path="authorIds" cssStyle="color:red" / -->
				</div>

			</div>
			<br />

			<div class="row">

				<div class="col-md-4">
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">Publisher
						</span>
                                           
						<!-- form:select path="publisherId" items="$publishers}" class="form-control" itemLabel="name" itemValue="id" --><!--/form:select -->
                                            
					</div>
				</div>
				<div class="col-md-2">
					<!--form:errors path="publisherId" cssStyle="color:red" role="alert" /-->
				</div>

				<div class="col-md-4">
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">Description</span>
						<form:textarea path="description" class="form-control" />
					</div>
				</div>
				<div class="col-md-2">
					<form:errors path="description" cssStyle="color:red" role="alert" />
				</div>
			</div>

			<br />
			<br />

			<div>
				<input type="submit" value="Add" class="btn btn-primary" />
			</div>

			<br />
			<br />
		</form:form>
	</div>
</body>
</html>