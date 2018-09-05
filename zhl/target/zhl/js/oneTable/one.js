$(function () {

    /*审核查询点击事件*/
    $("#sh-btn").click(function () {
        var ywh=$("#ywh").val();
        var qlbm=$("#qlbm").val();
        var qlbsm=$("#qlbsm").val();
        var bdcdyh=$("#bdcdyh").val();
        var zl=$("#zl").val();
        var islike=$('input[name="islike"]:checked').val();
        console.log(ywh,qlbm,qlbsm,bdcdyh,zl,islike);
        $.ajax({
            url:"shCheck",
            type:"post",
            dataType:"json",
            data:{
                "ywh":ywh,
                "qlbm":qlbm,
                "qlbsm":qlbsm,
                "bdcdyh":bdcdyh,
                "zl":zl,
                "islike":islike
            },
           success:function (data) {

           }
        })

    })



    /*审核表添加点击事件*/
    $("#sh-btn2").click(function () {
        var ywh=$("#ywh2").val();
        var qlbm=$("#qlbm2").val();
        var qlbsm=$("#qlbsm2").val();
        var bdcdyh=$("#bdcdyh2").val();
        var zl=$("#zl2").val();
        var bsm=$("#bsm2").val();
        var qlrmc=$("#qlrmc2").val();
        $.ajax({
            url:"shInsert",
            type:"post",
            dataType:"json",
            data:{
                "bsm":bsm,
                "qlrmc":qlrmc,
                "ywh":ywh,
                "qlbm":qlbm,
                "qlbsm":qlbsm,
                "bdcdyh":bdcdyh,
                "zl":zl
            },
            success : function (data) {


            }

        })

    })

    /*测试添加点击事件*/
    $("#sh-btn4").click(function () {
        var userId=$("#userId").val();
        var userNumber=$("#userNumber").val();
        var password=$("#password").val();
        var roleId=$("#roleId").val();
        var classId=$("#classId").val();
        var userName=$("#userName").val();
        $.ajax({
            url:"ceshiAdd",
            type:"post",
            dataType:"json",
            data:{
                "userId":userId,
                "userNumber":userNumber,
                "password":password,
                "roleId":roleId,
                "classId":classId,
                "userName":userName,
            },
            success : function (data) {


            }

        })
        })


    /*测试添加点击事件*/
    $("#sh-btn5").click(function () {
        var userId=$("#userId").val();
        var userName=$("#userName").val();
        var NumberId=$("#NumberId").val();
        var roler=$("#roler").val();
        var classMyId=$("#classMyId").val();
        $.ajax({
            url:"ceshiAdd2",
            type:"post",
            dataType:"json",
            data:{
                "userId":userId,
                "userName":userName,
                "NumberId":NumberId,
                "roler":roler,
                "classMyId":classMyId
            },
            success : function (data) {


            }

        })
    })


    /*审核表删除点击事件*/
    $("#sh-btn3").click(function () {
        alert(3)
        var bsm=$("#bsm3").val();

        $.ajax({
            url:"shDelete",
            type:"post",
            dataType:"json",
            data:{
                "bsm":bsm
            },
            success : function (data) {


            }

        })

    })
})