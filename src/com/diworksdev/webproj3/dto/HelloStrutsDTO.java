package com.diworksdev.webproj3.dto;

//DTOクラスは、DAOがDBから取得した値をActionへ戻す時、値を格納するのに利用されるファイル
public class HelloStrutsDTO {

	//テーブルから取得するデータに対応したフィールド変数を宣言
	private String result;

	//フィールド変数に対応したgetterとsetterを定義
	//Actionクラスから呼び出され、resultフィールドの値をActionに渡す
	public String getResult() {
		return result;

	}

	//フィールド変数に対応したgetterとsetterを定義
	//DAOクラスから呼び出され、引数として受け取ったテーブルの値を自身のDTO resultフィールドに格納
	public void setResult(String result) {
		this.result = result;

	}

}
