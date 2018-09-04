<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no"/>
    <meta http-equiv="Cache-Control" content="no-siteapp"/>
    <script src="js/jquery-3.2.1.js"></script>
    <script src="./js/bootstrap.js"></script>
    <script src="js/oneTable/one.js"></script>
    <link rel="stylesheet" href="./css/bootstrap.css">
    <title>222</title>
</head>


<body>
<h2>第二个页面</h2>
<div class="container-fluid">
    <div class="row">

        <div class="col-md-4"></div>
        <div class="col-md-4">审核表信息查询</div>
        <div class="col-md-4"></div>
    </div>

    <%--查询--%>
    <form class="form-inline">
        <div class="row">
            <div class="form-group" class="col-lg-4">
                <label for="ywh" >业务号</label>
                <input type="text" class="form-control" id="ywh" placeholder="" >
            </div>
            <div class="form-group" class="col-lg-4">
                <label for="qlbm">权利表名</label>
                <input type="text" class="form-control" id="qlbm" placeholder="">
            </div>

        </div>
        <div class="row">
            <div class="form-group">
                <label for="qlbsm">权利标识码</label>
                <input type="text" class="form-control" id="qlbsm" placeholder="">
            </div>
            <div class="form-group">
                <label for="bdcdyh">不动产单元号</label>
                <input type="text" class="form-control" id="bdcdyh" placeholder="">
            </div>

        </div>
        <div class="row">
            <div class="form-group">
                <label for="zl">坐落</label>
                <input type="text" class="form-control" id="zl" placeholder="">
            </div>
        </div>
        <div class="row">

            <div class="row">
                <div class="col-md-1"></div>
                <input type="radio" name="islike"  value="1" checked="true">非模糊
                <input type="radio" name="islike" value="0">模糊
            </div>
        </div>

        <div class="row">
           <button type="button" class="btn btn-primary"  id="sh-btn">查询</button>
       </div>

    </form>

    <%--测试插入--%>
    <form class= "form-inline">
        <div class="row">
            <div class="form-group" class="col-lg-4">
                <label for="bsm3" >用户ID：</label>
                <input type="text" class="form-control" id="userId" pl4aceholder="请输入userID" >
            </div>
            <div class="form-group" class="col-lg-4">
                <label for="bsm3" >学号</label>
                <input type="text" class="form-control" id="userNumber" pl4aceholder="请输入userNumber" >
            </div>
        </div>
        <div class="row">
            <div class="form-group" class="col-lg-4">
                <label for="bsm3" >密码：</label>
                <input type="text" class="form-control" id="password" pl4aceholder="请输入password" >
            </div>
            <div class="form-group" class="col-lg-4">
                <label for="bsm3" >角色</label>
                <input type="text" class="form-control" id="roleId" pl4aceholder="请输入roleId" >
            </div>
        </div>
        <div class="row">
            <div class="form-group" class="col-lg-4">
                <label for="bsm3" >班级：</label>
                <input type="text" class="form-control" id="classId" pl4aceholder="请输入class" >
            </div>
            <div class="form-group" class="col-lg-4">
                <label for="bsm3" >用户名</label>
                <input type="text" class="form-control" id="userName" pl4aceholder="请输入userName" >
            </div>

        </div>

        <div class="row">
            <button type="button" class="btn btn-primary"  id="sh-btn4">测试添加</button>
        </div>
    </form>
    <%--添加--%>
    <form class="form-inline">
        <div class="row">
            <div class="form-group" class="col-lg-4">
                <label for="bsm2" >标识码</label>
                <input type="text" class="form-control" id="bsm2" placeholder="" >
            </div>
            <div class="form-group" class="col-lg-4">
                <label for="qlbm">权利人名称</label>
                <input type="text" class="form-control" id="qlrmc2" placeholder="">
            </div>

        </div>
        <div class="row">
            <div class="form-group" class="col-lg-4">
                <label for="ywh" >业务号</label>
                <input type="text" class="form-control" id="ywh2" placeholder="" >
            </div>
            <div class="form-group" class="col-lg-4">
                <label for="qlbm">权利表名</label>
                <input type="text" class="form-control" id="qlbm2" placeholder="">
            </div>

        </div>
        <div class="row">
            <div class="form-group">
                <label for="qlbsm">权利标识码</label>
                <input type="text" class="form-control" id="qlbsm2" placeholder="">
            </div>
            <div class="form-group">
                <label for="bdcdyh">不动产单元号</label>
                <input type="text" class="form-control" id="bdcdyh2" placeholder="">
            </div>

        </div>
        <div class="row">
            <div class="form-group">
                <label for="zl">坐落</label>
                <input type="text" class="form-control" id="zl2" placeholder="">
            </div>
        </div>
        <div class="row">
            <button type="button" class="btn btn-primary"  id="sh-btn2">添加</button>
        </div>

    </form>



    <form class= "form-inline">
        <div class="row">
            <div class="form-group" class="col-lg-4">
                <label for="bsm3" >标识码</label>
                <input type="text" class="form-control" id="bsm3" placeholder="亲输入标识码" >
            </div>
        </div>

            <div class="row">
                <button type="button" class="btn btn-primary"  id="sh-btn3">删除</button>
            </div>
    </form>







</div>

</body>
