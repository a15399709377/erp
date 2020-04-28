layui.use(['form','layer','table','laytpl'],function(){
    var form = layui.form,
        layer = parent.layer === undefined ? layui.layer : top.layer,
        $ = layui.jquery,
        laytpl = layui.laytpl,
        table = layui.table;

    //用户列表
    var tableIns = table.render({
        elem: '#userList',
        height : "118",
        id : "userListTable",
        cols : [[
            {field: 'GName', title: '工序名称', Width:10, align:"center"},
            {field: 'GId', title: '工序编号', Width:10, align:"center"},
            {field: 'GM', title: '描述',Width:50,align:'center'},
            {field: 'GTime', title: '工时数',Width:50,align:'center'},
            {field: 'GD', title: '工时单位',Width:50,align:'center'},
            {field: 'GTM', title: '单位工时成本',Width:50,align:'center'},
            {field: 'GX', title: '工时成本小计(时)',Width:50,align:'center'},
            {title: '点选', Width:75, templet:'#userListBar',align:"center"}
        ]]
    });
    var tableIns2 = table.render({
        elem: '#gxList',
        height : "118",
        id : "gxListTable",
        cols : [[
            {field: 'GXName', title: '工序编号', Width:10, align:"center"},
            {field: 'GId', title: '工序名称', Width:10, align:"center"},
            {field: 'GM', title: '工序描述',Width:50,align:'center'},
            {field: 'tj', title: '添加',Width:50,align:'center'}
        ]]
    });
})
