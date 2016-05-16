<!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
<div class="collapse navbar-collapse navbar-ex1-collapse">
    <ul class="nav navbar-nav side-nav">
        <li class="active">
            <a href="${pageContext.request.contextPath}/home"><i class="fa fa-fw fa-dashboard"></i> Dashboard</a>
        </li>
        <li>
            <a href="${pageContext.request.contextPath}/home/contactus"><i class="fa fa-fw fa-bar-chart-o"></i> Charts</a>
        </li>
        <li>
            <a href="home"><i class="fa fa-fw fa-table"></i> Tables</a>
        </li>
        <li>
            <a href="home"><i class="fa fa-fw fa-edit"></i> Forms</a>
        </li>
        <li>
            <a href="contactus"><i class="fa fa-fw fa-desktop"></i> Bootstrap Elements</a>
        </li>
        <li>
            <a href="home"><i class="fa fa-fw fa-wrench"></i> Bootstrap Grid</a>
        </li>
        <li>
            <a href="javascript:;" data-toggle="collapse" data-target="#demo"><i class="fa fa-fw fa-arrows-v"></i> Administration <i class="fa fa-fw fa-caret-down"></i></a>
            <ul id="demo" class="collapse">
                <li>
                    <a href="${pageContext.request.contextPath}/admin/add">Add User</a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/admin/list">List User</a>
                </li>
            </ul>
        </li>
        <li>
            <a href="home"><i class="fa fa-fw fa-dashboard"></i>Help</a>
        </li>
    </ul>
</div>
<!-- /.navbar-collapse -->