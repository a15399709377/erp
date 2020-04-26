<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<meta charset="utf-8">
	<title>管理用户列表</title>
	<meta name="renderer" content="webkit">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<meta name="apple-mobile-web-app-status-bar-style" content="black">
	<meta name="apple-mobile-web-app-capable" content="yes">
	<meta name="format-detection" content="telephone=no">

	<script type="text/javascript" src="../../layui/layui.js"></script>
	<link rel="stylesheet" href="../../layui/css/layui.css" media="all" />
	<link rel="stylesheet" href="../../css/public.css" media="all" />
</head>
<body class="childrenBody">
<form class="layui-form">
	<blockquote class="layui-elem-quote quoteBox">
		<form class="layui-form">
			<div class="layui-inline">
				账号（模糊查询）：
				<div class="layui-input-inline">
					<input type="text" class="layui-input unumber" placeholder="请输入搜索的内容" />
				</div>
				<input type="hidden" name="userinfo_id" id="userinfo_id" value="0">
				
				<a class="layui-btn search_btn" data-type="reload">快速检索</a>
			</div>
			<div class="layui-inline">
				<a class="layui-btn layui-btn-danger layui-btn-normal delAll_btn">批量删除</a>
			</div>
		</form>
	</blockquote>
	
	<table id="newsList" lay-filter="newsList"></table>

	<!--操作-->
	<script type="text/html" id="newsListBar">
		<a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
		<a class="layui-btn layui-btn-xs layui-btn-danger" lay-event="del">删除</a>
	</script>
</form>


<script type="text/javascript">

layui.use(['form','layer','laydate','table','laytpl'],function(){
    var form = layui.form,
        layer = parent.layer === undefined ? layui.layer : top.layer,
        $ = layui.jquery,
        laydate = layui.laydate,
        laytpl = layui.laytpl,
        table = layui.table;
    
  //用户列表
    var tableIns = table.render({
        elem: '#newsList',
        url : 'getUserList.do',
        cellMinWidth : 95,
        page : true,
        height : "full-125",
        limit : 3,
        limits : [10,15,20,25],
        id : "UserListTable",
        cols : [[
            {type: "checkbox", fixed:"left", width:50},
            {field: 'uid', title: '编号', width:150,align:"center",sort:true},
            {field: 'unumber', title: '账户', width:150,align:"center",sort:true},
            {field: 'uname', title: '姓名', width:180, align:"center",sort: true},
            {field: 'uphone', title: '电话', width:180,align:"center",sort:true},
            {field: 'uhome', title: '地址', width:180,align:"center",sort:true},
            {field: 'well', title: '备注', width:180,align:"center",sort:true},
          	
            {title: '操作', width:170, templet:'#newsListBar',fixed:"right",align:"center"}
        ]]
    }); 
  
  //检索
    $(".search_btn").on("click",function(){
            table.reload("UserListTable",{
                page: {
                    curr: 1 //重新从第 1 页开始
                },
                where: {
                	unumber: $(".unumber").val()  //搜索的关键字
                }
            })
    });
  
  //添加用户
  	$(".addUser_btn").click(function(){
  		addUser();
  	});
  
  //批量删除
    $(".delAll_btn").click(function(){
        var checkStatus = table.checkStatus('UserListTable'),
            data = checkStatus.data,
            ids = [];
        if(data.length > 0) {
            for (var i in data) {
            	ids.push(data[i].uid);
            }
            //alert(ids);
            layer.confirm('确定删除选中的所有内容？', {icon: 3, title: '提示信息'}, function (index) {
                 $.get("deleteUserAll.do",{
                     ids : ids  //将需要删除的newsId作为参数传入
                 },function(data){
                	layer.msg("删除成功");
                        table.reload("UserListTable",{
                        	 page: {
                                 curr: 1 //重新从第 1 页开始
                             }
                        })
	                layer.close(index);
                 })
            })
        }else{
            layer.msg("请选择需要删除的用户");
        }
    })
    
  //列表操作    
    //删除操作 
    table.on('tool(newsList)', function(obj){
        var layEvent = obj.event,
            data = obj.data;
        if(layEvent === 'edit'){ //编辑
        	addUser(data);
        } else if(layEvent === 'del'){ //删除
            layer.confirm('确定删除？',{icon:3, title:'提示信息'},function(index){
            	 //alert(data.user_id);
                 $.get("deleteUser.do",{
                     id : data.uid  //将需要删除的newsId作为参数传入
                 },function(data){
                	layer.msg("操作成功！");
                	 table.reload("UserListTable",{
                    	 page: {
                             curr: 1 //重新从第 1 页开始
                         }
                    })
                    layer.close(index);
                 })
            });
        } else if(layEvent === 'look'){ //预览
            layer.alert("此功能需要前台展示，实际开发中传入对应的必要参数进行文章内容页面访问")
        }
    });
  	//编辑操作 
    function addUser(edit){
	    title = typeof(edit)=="object"?"编辑用户":"添加用户";
        var index = layui.layer.open({
            title : title,
            type : 2,
            content : "UserAdd.jsp",
            area: ['590px', '560px'],
            success : function(layero, index){
            	var body = layui.layer.getChildFrame('body', index);
            	
                if(edit){
                	body.find(".uid").val(edit.uid);
                	body.find(".unumber").val(edit.unumber);
                    body.find(".password").val(edit.password);
                    body.find(".uname").val(edit.uname);
                    body.find(".uphone").val(edit.uphone);
                    body.find(".uhome").val(edit.uhome);
                    body.find(".well").val(edit.well);
                    
                    form.render();
                }
            }
        })
    }
    
})
</script>
</body>
</html>