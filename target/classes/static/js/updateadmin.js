$("#up_btn").on("click",function () {
    var role = $("#admin_role_hidden").val();
    if(role == "超级管理员"){}else{
        layer.alert("抱歉，您不是超级管理员无权修改管理员信息！");
        return false;
    }
    var adminid = document.getElementById("adminid").value;
    var password = document.getElementById("password").value;
    var enable = document.getElementById("enable").value;
    var able = /^[01]$/;
    if(password == ""){
        layer.alert("密码不能为空！");
        //document.getElementById("addpwd").reset();
        return false
    }else{
        if(!able.test(enable)){
            layer.alert("是否可用只能输入0或者1!");
            //document.getElementById("addable").reset();
            return false;
        }else{
            var elm={
                up_id:adminid,
                up_pwd:password,
                up_able:enable
            };
            $.ajax({
                url: "/admin/updateadmin",
                type: "post",
                dataType: "json",
                data: elm,
                success:function(data){
                    //layer.closeAll("loading");
                    if (data.msg == "success"){
                        layer.msg('修改成功', {icon: 1});
                        window.setTimeout(function () {//在指定的毫秒数后调用函数
                            window.location.reload();
                        }, 1000);
                    }else {
                        layer.msg("修改失败，请稍后再试",{icon: 5});
                    }
                },
                error: function(XMLHttpRequest, textStatus, errorThrown) {
                    //layer.closeAll("loading");//关闭动画
                    alert(XMLHttpRequest.responseText);
                    alert(XMLHttpRequest.status);
                    alert(XMLHttpRequest.readyState);
                    alert(textStatus); // parser error;
                }
            })
        }
    }
})