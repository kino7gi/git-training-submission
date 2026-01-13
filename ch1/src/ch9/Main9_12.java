package ch9;
//コンストラクタのオーバーロード
public class Main9_12 {
	String name;
	int hp;
	public Main9_12(String name){
		this.hp = 100;
		this.name = "ミナト";
	}
	//ダミーを作ると名前を入れなくても使える
	public Main9_12(){
		this.hp = 100;
		this.name = "ダミー";
		
	}
	
}
