<!-- このファイルが通常のHTMLファイルではなく、JSPであることを示している -->
<!-- strutsタグ（下の補足参照）を使用する際に記述します。ここでは”s”としてタグを使用 -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>HelloStruts</title>
    </head>
    <body>
        <h1>HelloStruts2!</h1>
        <br>
        <!-- strutsファイルのresult部分がsuccessの場合に表示される -->
        <h3><s:property value="result"/></h3>
    </body>
</html>