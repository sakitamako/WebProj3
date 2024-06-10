<!-- このファイルが通常のHTMLファイルではなく、JSPであることを示している -->
<!-- strutsタグ（下の補足参照）を使用する際に記述します。ここでは”s”としてタグを使用 -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>お問合せ受付完了</title>
    </head>
    <body>
    <!-- struts.xmlfileにアクションし、入力した処理結果を登録ボタンを押した先のinquiryComplete.jspで表示する -->
        <br>
        <s:property value="name" />さん、お問合せありがとうございました。
        <br>
        <br>
        お問い合わせの種類:<br>
        <s:if test='qtype=="company"'>会社について</s:if>
        <s:if test='qtype=="product"'>製品について</s:if>
        <s:if test='qtype=="support"'>アフターサポートについて</s:if>
        <br>
        <br>
        お問い合わせ内容:<br>
        <s:property value="body" />
    </body>
</html>