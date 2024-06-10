<!-- このファイルが通常のHTMLファイルではなく、JSPであることを示している -->
<!-- strutsタグ（下の補足参照）を使用する際に記述します。ここでは”s”としてタグを使用 -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>TEST</title>
    </head>
    <body>
    <!-- testActionファイルの中身をstrutsファイルでシンプルにして各画面にシンプルに表示する、strutsファイルの処理結果が表示される -->
        <br>
        <h1>以下の新規ユーザーが登録されました。</h1>
        <s:property value="username"/>
        <br>
        <s:property value="password"/>
    </body>
</html>