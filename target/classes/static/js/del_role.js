//删除管理角色
$(".del_role").on("click",function () {
    var  role = $("#admin_role_hidden").val();
    if(role == "超级管理员"){
        var roleid = $(this).attr("name");
        console.log(roleid);
        layer.confirm('您确定要删除吗？', {
            btn: ['确定','取消'] //按钮
        }, function(){
            var elm={
                del_id:roleid
            };
            $.ajax({
                url: "/admin/delrole",
                type: "post",
                dataType: "json",
                data: elm,
                success:function(data){
                    layer.closeAll("loading");
                    if (data.msg == "success"){
                        layer.msg('删除成功', {icon: 1});
                        window.setTimeout(function () {//在指定的毫秒数后调用函数
                            window.location.reload();
                        }, 1000);
                    }else {
                        layer.msg("删除失败，请稍后再试",{icon: 5});
                    }
                },
                error: function(XMLHttpRequest, textStatus, errorThrown) {
                    layer.closeAll("loading");//关闭动画
                    alert(XMLHttpRequest.responseText);
                    alert(XMLHttpRequest.status);
                    alert(XMLHttpRequest.readyState);
                    alert(textStatus); // parser error;
                }
            })

        }, function(){
            layer.msg('取消成功', {
                time: 2000, //20s后自动关闭
            },{icon: 5});
        });
    }else{
        layer.alert("抱歉，您不是超级管理员无权删除管理角色！")
    }

    //layer.load(1);
})