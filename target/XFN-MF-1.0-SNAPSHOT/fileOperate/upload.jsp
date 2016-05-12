<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>upload</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <style type="text/css">
        .input {
            width: 80px;
            height: 20px;
            line-height: 20px;
            background: #0088ff;
            text-align: center;
            display: inline-block;
            overflow: hidden;
            position: relative;
            text-decoration: none;
            top: 5px;
        }

        .input:hover {
            background: #ff8800;
        }

        .file {
            opacity: 0;
            filter: alpha(opacity =     0);
            font-size: 50px;
            position: absolute;
            top: 0;
            right: 0;
        }

        a:link {
            text-decoration: none;
        }
        a:visited {
            text-decoration: none;
        }
        a:hover {
            color: #999999;
            text-decoration: underline;
        }
    </style>
</head>
<body>
<%--action="<%=basePath %>fileOperate/upload"--%>
<form action="<%=basePath %>test/upload"
      enctype="multipart/form-data" method="post">
    <div>
        <input type="text" readonly="readonly" /> <a
            href="javascript:void(0);" class="input"> 浏览 <input type="file"
                                                                class="file" name="filename1"> </a>
    </div>
    <div>
        <input type="text" readonly="readonly" /> <a
            href="javascript:void(0);" class="input"> 浏览 <input type="file"
                                                                class="file" name="filename2"> </a>
    </div>
    <div>
        <input type="text" readonly="readonly" /> <a
            href="javascript:void(0);" class="input"> 浏览 <input type="file"
                                                                class="file" name="filename3"> </a>
    </div>
    <input type="submit" value="上传">
</form>
<br />
<a href="<%=basePath %>fileOperate/list">下载文件</a>
<script type="text/javascript">
    var nodes = document.getElementsByTagName("input");
    for ( var i = 0; i < nodes.length; i++) {
        if("file" == nodes[i].type){
            nodes[i].onchange = function(){
                var textObj = this.parentNode.parentNode.getElementsByTagName("input")[0];
                var textvalue = this.value;
                textvalue = textvalue.substring(textvalue.lastIndexOf("\\")+1, textvalue.length);
                textObj.value = textvalue;
            };
        }
    }
</script>
</body>
</html>