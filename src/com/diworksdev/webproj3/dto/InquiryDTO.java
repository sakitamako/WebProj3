package com.diworksdev.webproj3.dto;

//DTOクラスは、DAOがDBから取得した値をActionへ戻す時、値を格納するのに利用されるファイル
public class InquiryDTO {

	//テーブルから取得するデータに対応したフィールド変数を宣言
	private String name;
	private String qtype;
	private String body;

	//フィールド変数に対応したgetterとsetterを定義
	//Actionクラスから呼び出され、nameフィールドの値をActionに渡す
	public String getName() {
		return name;

	}

	//フィールド変数に対応したgetterとsetterを定義
	//DAOクラスから呼び出され、引数として受け取ったテーブルの値を自身のDTO nameフィールドに格納
	public void setName(String name) {
		this.name = name;
	}

	//Actionクラスから呼び出され、qtypeフィールドの値をActionに渡す
	public String getQtype() {
		return qtype;

	}

	//DAOクラスから呼び出され、引数として受け取ったテーブルの値を自身のDTO qtypeフィールドに格納
	public void setQtype(String qtype) {
		this.qtype = qtype;

	}

	//Actionクラスから呼び出され、bodyフィールドの値をActionに渡す
	public String getBody() {
		return body;

	}

	//DAOクラスから呼び出され、引数として受け取ったテーブルの値を自身のDTO bodyフィールドに格納
	public void setBody(String body) {
		this.body = body;

	}

}
