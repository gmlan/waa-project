<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<script>
    $(function(){
       //$("#btn")
    })
</script>
<h1>Search </h1>
<hr> 
<form action="search" method="POST" />
<div class="search">
    <input type="text" id="search" name="q" placeholder="input in here to start search">
    <div id="btnSearch"  onclick="document.forms[0].submit();">
        <span></span>
    </div>
</div>

<div class="row category">
    <c:forEach items="${categories}" var="category"> 
        <div class="categoryitem" style="padding-bottom: 15px" >                        
            <div class="caption">                            	
                <div>       
                    <a class="btn btn-default" href="search/category/${category.key}" >
                        <img src='<c:url value="static/${category.value}"></c:url>'/>
                        </a>
                    </div>
                    <div class="description">${category.key}</div>
            </div>
        </div>
    </c:forEach>
</div>
</form>