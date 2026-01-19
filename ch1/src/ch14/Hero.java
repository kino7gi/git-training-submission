package ch14;
//Heroクラスの文字情報を表示する14_4
//意図する文字列表示を返すtoString()を定義14_5
public class Hero {
	String name;
	int hp;
	public String toString() {
		return "名前:" + this.name + "/HP:" + this.hp;
	}

}
