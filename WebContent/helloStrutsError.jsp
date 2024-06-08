<!-- このファイルが通常のHTMLファイルではなく、JSPであることを示している -->
<!-- strutsタグ（下の補足参照）を使用する際に記述します。ここでは”s”としてタグを使用 -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>HelloStrutsError</title>
    </head>
    <body>
        <!-- strutsファイルのresult部分がerrorの場合に表示される -->
        <h1>エラーが発生しました！</h1>
        <br>
        <h3><s:property value="result"/></h3>
    </body>
</html>