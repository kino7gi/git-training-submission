package ch9;
//別のコンストラクタを呼び出す（エラー）
public class Main9_15 {
	String name;
	int hp;
	public Hero(String name){//コンストラクタ１
		this.hp = 100;
		this.name = name;
	}
	public Hero(){
		this.Hero("ダミー");
	}

}
