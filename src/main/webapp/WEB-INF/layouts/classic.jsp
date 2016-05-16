<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
    <!-- Specify default URL and default target for all links on a page -->
    <base href="${pageContext.request.contextPath}/" />
     
    <!-- Bootstrap Core CSS -->
    <link href="static/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="static/css/sb-admin.css" rel="stylesheet">
 
    <!-- Custom Fonts -->
    <link href="static/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

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
    <script src="static/js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="static/js/bootstrap.min.js"></script>
 
</body>
</html>