//修改角色权限
$("#uprole_btn").on("click",function () {
    var role = $("#admin_role_hidden").val();
    if(role == "超级管理员"){
        $opts = $("#optup option:selected").text();
        $upId = $("#roleid").val();
        console.log($opts+$upId);
        if($opts != ""){
            var elm={
                up_opt:$opts,
                up_id:$upId
            }
            $.ajax({
                url:"/admin/updaterole",
                type:"post",
                dataType:"json",
                data:elm,
                success:function (data) {
                    if(data.msg == "success"){
                        layer.msg('修改成功', {icon: 1});
                        window.setTimeout(function () {//在指定的毫秒数后调用函数
                            window.location.reload();
                        }, 1000);
                    }else{
                        layer.msg("系统繁忙，请稍后再试",{icon: 5});
                    }
                },
                error:function (XMLHttpRequest, textStatus, errorThrown) {
                    alert(XMLHttpRequest.responseText);
                    alert(XMLHttpRequest.status);
                    alert(XMLHttpRequest.readyState);
                    alert(textStatus); // parser error;
                }
            })
        }else{
            layer.alert("操作权限不能为空哦");
        }}else{
        layer.alert("抱歉，您不是超级管理员无权修角色权限！");
        return false;
    }
})