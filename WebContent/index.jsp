<!-- このファイルが通常のHTMLファイルではなく、JSPであることを示している -->
<!-- strutsタグ（下の補足参照）を使用する際に記述します。ここでは”s”としてタグを使用 -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>INDEX</title>
    </head>
    <body>
    <!-- "HelloStrutsAction"の部分はstruts.xmlファイルの一部分にアクションして持ってきた情報を次のページで表示する -->
        <s:form action="HelloStrutsAction">
            <s:submit value="HelloStruts"/>
        </s:form>

        <!-- "WelcomeAction"の部分はstruts.xmlファイルの一部分にアクションして持ってきた情報を次のページで表示する -->
        <s:form action="WelcomeAction">
            <s:submit value="Welcome"/>
        </s:form>
    </body>
</html>