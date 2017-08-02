$("#add_admin").on("click",function () {
    var role = $("#admin_role_hidden").val();
    if(role == "超级管理员"){
        var username = document.getElementById("addname").value;
        var password = document.getElementById("addpwd").value;
        var enable = document.getElementById("addable").value;
        var myreg = /^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1}))+\d{8})$/;// 验证130-139,150-159,180-189号码段的手机号码
        var able = /^[01]$/;
        console.log("密码"+password);
        if(!myreg.test(username)){
            layer.alert("请输入有效的手机号码!");
            //document.getElementById("addname").reset();
            return false;
        }else{
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
                        add_name:username,
                        add_pwd:password,
                        add_able:enable
                    };
                    $.ajax({
                        url: "/admin/addadmin",
                        type: "post",
                        dataType: "json",
                        data: elm,
                        success:function(data){
                            //layer.closeAll("loading");
                            if (data.msg == "success"){
                                layer.msg('添加成功', {icon: 1});
                                window.setTimeout(function () {//在指定的毫秒数后调用函数
                                    window.location.reload();
                                }, 1000);
                            }else {
                                if(data.msg == "exist"){
                                    layer.msg("添加失败，该管理已存在",{icon: 5});
                                }else {
                                    layer.msg("系统繁忙，请稍后再试",{icon: 5});
                                }
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
        }
    }else{
        layer.alert("抱歉，您不是超级管理员无权进行添加管理员操作!");
        return false;
    }
})