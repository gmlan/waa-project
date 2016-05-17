<!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
<div class="collapse navbar-collapse navbar-ex1-collapse">
    <ul class="nav navbar-nav side-nav">
        <li class="active">
            <a href="home"><i class="fa fa-fw fa-home"></i> Dashboard</a>
        </li> 
        <li>
            <a href="search"><i class="fa fa-fw fa-search"></i>Search</a>
        </li>
        
        <li>
            <a href="checkout"><i class="fa fa-fw fa-check"></i>Checkout</a>
        </li>
        <li>
            <a href="javascript:;" data-toggle="collapse" data-target="#bookItem"><i class="fa fa-fw fa-book"></i> Books <i class="fa fa-fw fa-caret-down"></i></a>
            <ul id="bookItem" class="collapse">
                <li>
                    <a href="book/add">Add Book</a>
                </li>
                <li>
                    <a href="book/list">List Book</a>
                </li>
            </ul>
        </li>
        <li>
            <a href="javascript:;" data-toggle="collapse" data-target="#userItem"><i class="fa fa-fw fa-user"></i> Administration <i class="fa fa-fw fa-caret-down"></i></a>
            <ul id="userItem" class="collapse">
                <li>
                    <a href="admin/add">Add User</a>
                </li>
                <li>
                    <a href="admin/list">List User</a>
                </li>
            </ul>
        </li>
        <li>
            <a href="admin/add"><i class="fa fa-fw fa-question"></i>Help</a>
        </li>
    </ul>
</div>
<!-- /.navbar-collapse -->