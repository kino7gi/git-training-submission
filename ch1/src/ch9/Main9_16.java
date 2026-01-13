package ch9;
//9_15の書き直し
public class Main9_16 {
	String name;
	int hp;
	public Main9_16(String name){//コンストラクタ１
		this.hp = 100;
		this.name = name;
	}
	public Main9_16(){//コンストラクタ２
		this("ダミー");
	}
	
}
