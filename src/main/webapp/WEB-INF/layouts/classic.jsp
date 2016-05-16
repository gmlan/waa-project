<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
     <!-- Bootstrap Core CSS -->
     <link href="${pageContext.request.contextPath}/static/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="${pageContext.request.contextPath}/static/css/sb-admin.css" rel="stylesheet">
 
    <!-- Custom Fonts -->
    <link href="${pageContext.request.contextPath}/static/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

<title><tiles:getAsString name="title" /></title>
</head>
 
<body>     
    <div id="wrapper">
        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
           <tiles:insertAttribute name="header" />
           <tiles:insertAttribute name="sidebar" />
        </nav>
        <div id="page-wrapper">            
            <tiles:insertAttribute name="body" />
        </div>
        <div>
            <tiles:insertAttribute name="footer" />
            
        </div>
            
    </div> 
        
        
            
    <!-- jQuery -->
    <script src="${pageContext.request.contextPath}/static/js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="${pageContext.request.contextPath}/static/js/bootstrap.min.js"></script>
 
</body>
</html>