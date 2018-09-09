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
            async:true,
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
              console.log(data);
              var str="";
              for(var i=0;i<data.length;i++){
                  str+="<tr><td>"+data[i].qlrmc+"</td><td>"+data[i].bdcdyh+"</td>" +
                      "<td>"+data[i].qlbm+"</td><td>"+data[i].zl+"</td>" +
                      "<td style='color: red;font-weight: bold;margin: center;padding: center;text-decoration: underline;cursor: pointer;' class='revise'>删除</td>" +
                      "<td style='color: red;font-weight: bold;margin: center;padding:center; centertext-decoration: underline;cursor: pointer;'>修改</td></tr>>"
              }
              $("#shMessageDisplay").append(str)
               $(".revise").click(function () {
                   var index=$(this).parent().index();
                   $.ajax({
                       url:"shDelete",
                       type:"post",
                       dataType:"json",
                       data:{
                           "bsm":data[index-1].bsm
                       },
                       success:function (res) {
                        console.log(res);
                         alert("删除成功");
                       },
                       error:function (res) {
                           console.log("失败");
                           $("#shMessageCheek").load(location.href+" #shMessageCheek");
                       }
                   })

               })
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


    /*测试@RequestBody映射实体类*/
    $("#sh-btn6").click(function () {
        var userId=$("#userId2").val();
        var userName=$("#userName2").val();
        var NumberId=$("#NumberId2").val();
        var roler=$("#roler2").val();
        var classMyId=$("#classMyId2").val();
        var  message2={
            "userId":userId,
            "userName":userName,
            "NumberId":NumberId,
            "roler":roler,
            "classMyId":classMyId
        }

        $.ajax({
            url:"ceshRequestBody",
            type:"post",
            data: {
                "userId":userId,
                "userName":userName,
                "NumberId":NumberId,
                "roler":roler,
                "classMyId":classMyId
            },
            dataType:"json",
            success : function (data) {
               console.log(data);
               console.log(data[0].userId);

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