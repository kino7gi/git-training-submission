package ch13.java;
//13_13setterメソッドで値の妥当性をチェックする
public class Setter{
	private String name;
	public void setName(String name) {

	if(name == null) {
		 throw new IllegalArgumentException("名前がnullである。処理を中断");
	 }
	 if(name.length()<=1) {
		 throw new IllegalArgumentException("名前が短すぎる。処理を中断");
	 }
	 if(name.length()>=8) {
		 throw new IllegalArgumentException("名前が長すぎる。処理を中断");
	 }//エラーを出してプログラムを終了させる命令
	 this.name = name; 
}
}
