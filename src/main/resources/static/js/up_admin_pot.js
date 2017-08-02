//修改管理员权限
$("#up_admin_pot_btn").on("click",function () {
    var role = $("#admin_role_hidden").val();
    if(role == "超级管理员"){
        $ad_id = $("#adminid2").val();
        console.log("更新的id是"+$ad_id);
        $roles = $("#admin_role option:selected").text();
        var elm = {
            up_id:$ad_id,
            up_role:$roles
        }
        $.ajax({
            url:"/admin/upadteadminopt",
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
        layer.alert("抱歉，您不是超级管理员无权修改管理员权限！");
        return false;
    }
})