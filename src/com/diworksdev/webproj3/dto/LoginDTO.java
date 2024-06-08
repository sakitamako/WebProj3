package com.diworksdev.webproj3.dto;

public class LoginDTO {

	//テーブルから取得するデータに対応したフィールド変数を宣言
	private String username;
	private String password;

	//フィールド変数に対応したgetterとsetterを定義
	//Actionクラスから呼び出され、nameフィールドの値をActionに渡す
	public String getUsername() {
		return username;

	}

	//フィールド変数に対応したgetterとsetterを定義
	//DAOクラスから呼び出され、引数として受け取ったテーブルの値を自身のnameフィールドに格納
	public void setUsername(String username) {
		this.username = username;

	}

	//Actionクラスから呼び出され、nameフィールドの値をActionに渡す
	public String getPassword() {
		return password;

	}

	//DAOクラスから呼び出され、引数として受け取ったテーブルの値を自身のnameフィールドに格納
	public void setPassword(String password) {
		this.password = password;

	}

}
