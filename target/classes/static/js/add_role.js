//添加管理角色
$("#add_role_btn").on("click",function () {
    var role = $("#admin_role_hidden").val();
    if(role == "超级管理员"){
        $name = $("#addrolename").val();
        $opts = $("#addoptforrole option:selected").text();
        console.log($opts);
        if($opts != ""){
            var elm={
                add_role_name:$name,
                add_role_opts:$opts
            }
            $.ajax({
                url:"/admin/addrole",
                type:"post",
                dataType:"json",
                data:elm,
                success:function (data) {
                    if(data.msg == "success"){
                        layer.msg('添加成功', {icon: 1});
                        window.setTimeout(function () {//在指定的毫秒数后调用函数
                            window.location.reload();
                        }, 1000);
                    }else{
                        if(data.msg == "exist"){
                            layer.msg("添加失败，该角色已存在",{icon: 5});
                        }else {
                            layer.msg("系统繁忙，请稍后再试",{icon: 5});
                        }
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
            layer.alert("操作权限还未设置哦！")
        }
    }else{
        layer.alert("抱歉，您不是超级管理员无权添加管理角色！");
        return false;
    }

})