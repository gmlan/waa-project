<h1>List User</h1>

<div class="result">
    <p id="nodata">No result found, please try again.</p>
    <table id="table" class="display" cellspacing="0" width="100%">
            <thead>
                    <tr>
                            <th>First Name</th>
                            <th>Last Name</th>
                            <th>Email</th>
                            <th>Phone</th>
                            <th>Address</th>
                    </tr>
            </thead>
    </table>
</div>

<script>
    var table;
    $(function(){
        $.get("admin/rest/list")
        .success(function(data){
                 if(data.length == 0){
                         $("#table").hide();
                         $("#nodata").show();
                 }
                 else{
                         $("#table").show();
                         $("#nodata").hide();

                         if(table)
                                table.destroy();

                         table = $('#table').DataTable( {				
                                      "aaData": data,
                                      "pageLength": 5,
                                      "aoColumns": [
                                              { "mDataProp": "firstName"},
                                              { "mDataProp": "lastName" },
                                              { "mDataProp": "email" },
                                              { "mDataProp": "phone" },
                                              { "mDataProp": "address" }
                                      ]
                              } );
                 }
        })
        .fail(function(data){
                alert(data);
        });
    });
</script>
</form>