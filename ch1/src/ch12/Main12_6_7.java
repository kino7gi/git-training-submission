package ch12;
//パーティが宿屋に泊まってHPを回復する
//多態性と配列を組み合わせて宿屋に泊まる

import rennsyuu9.Thief;

public class Main12_6_7 {

	public static void main(String[] args) {
		Character[] c = new Character[5];//12-6に付け足す
		c [0] = new Hero();
		c [1] = new Hero();
		c [2] = new Thief();
		c [3] = new Wizard();
		c [4] = new Wizard();
		//冒険開始！
		//まずは宿屋に泊まる
		for(Character ch : c) {//1名ずつ取り出す作業
			ch.hp += 50;
		}
	}

}
