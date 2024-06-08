package com.diworksdev.webproj3.action;

import com.diworksdev.webproj3.dao.HelloStrutsDAO;
import com.diworksdev.webproj3.dto.HelloStrutsDTO;
import com.opensymphony.xwork2.ActionSupport;

//struts2が持つActionSupportというクラスを継承
//（Actionクラスは基本的にこのクラスを継承）
//LoginAciton（子クラス） extends（継承） ActionSupport（親クラス）
//すでにあるクラスとにたクラスを作る場合、元のクラスに必要な機能だけを追加する形で、新しいクラスを作ることを継承
public class HelloStrutsAction extends ActionSupport {

	private String result;

	//メソッド名は「execute」
	//管理コマンド・メッセージをコマンド・サーバーに送信し、何らかの応答メッセージを待ちます
	public String execute() {

		//メソッドの戻り値「ret」 String ret = ERROR; を定義し、初期値としてERRORを代入
		String ret = ERROR;

		//②HelloStrutsDAOとHelloStrutsDTOのインスタンス化
		HelloStrutsDAO dao = new HelloStrutsDAO();
		HelloStrutsDTO dto = new HelloStrutsDTO();

		// HelloStrutsDTOはHelloStrutsDAOクラスのselectメソッドを呼び出す
		dto = dao.select();

		//getterは値を引っ張ってくるメソッド
		//メソッド＝オブジェクトの操作を定義したもの
		System.out.println(dto.getResult());

		//dtoのgetResultを引っ張ってくる
		result = dto.getResult();

		//もし下記の場合、ret=SUCCESS
		//そうでない場合、ERROR
		if (result.equals("MySQL と接続できます。")) {

			ret = SUCCESS;

		}else{

			ret = ERROR;
		}

		//戻り値
		//処理結果を返す
		return ret;

	}

	//getterは値を引っ張ってくるメソッド
	//メソッド＝オブジェクトの操作を定義したもの
	public String getResult() {
		return result;

	}

	//setterは値を代入するメソッド
	//メソッド＝オブジェクトの操作を定義したもの
	public void setResult(String result) {
		this.result = result;
	}

}
