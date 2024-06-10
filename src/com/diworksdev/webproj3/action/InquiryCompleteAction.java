package com.diworksdev.webproj3.action;

import com.diworksdev.webproj3.dao.InquiryCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

//struts2が持つActionSupportというクラスを継承
//（Actionクラスは基本的にこのクラスを継承）
//LoginAciton（子クラス） extends（継承） ActionSupport（親クラス）
//すでにあるクラスとにたクラスを作る場合、元のクラスに必要な機能だけを追加する形で、新しいクラスを作ることを継承
public class InquiryCompleteAction extends ActionSupport {

	private String name;
	private String qtype;
	private String body;

	//管理コマンド・メッセージをコマンド・サーバーに送信し、何らかの応答メッセージを待ちます
	public String execute() {
		String ret = ERROR;

		//②インスタンス化
		//DAOと会話するためのコード
		InquiryCompleteDAO dao = new InquiryCompleteDAO();

		//①クラス、メソッドの定義
		int count = dao.insert(name, qtype, body);

		//もしcountが0より大きい場合ret=SUCCESS
		if (count > 0) {
			ret = SUCCESS;
		}

		//戻り値
		//処理結果を返す
		return ret;

	}

	//getterは値を引っ張ってくるメソッド
	//メソッド＝オブジェクトの操作を定義したもの
	public String getName() {
		return name;

	}

	//setterは値を代入するメソッド
		//メソッド＝オブジェクトの操作を定義したもの
	public void setName(String name) {
		this.name = name;
	}

	//getterは値を引っ張ってくるメソッド
	//メソッド＝オブジェクトの操作を定義したもの
	public String getQtype() {
		return qtype;
	}

	//setterは値を代入するメソッド
		//メソッド＝オブジェクトの操作を定義したもの
	public void setQtype(String qtype) {
		this.qtype = qtype;
	}

	//getterは値を引っ張ってくるメソッド
	//メソッド＝オブジェクトの操作を定義したもの
	public String getBody() {
		return body;
	}

	//setterは値を代入するメソッド
		//メソッド＝オブジェクトの操作を定義したもの
	public void setBody(String body) {
		this.body = body;
	}

}
