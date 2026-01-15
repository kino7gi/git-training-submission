package ch13.java;
//王様クラスの不具合
//王様クラスで利用されるnameフィールド
public class King {
	void talk(Hero h) {
		System.out.println("ようこそ我が国へ、勇者" + h.getName() + "よ。");
		System.out.println("王様：長旅で疲れたであろう。");
		System.out.println("王様：まずは城下町を見てくるとよい。ではまた会おう。");
		h.die();//ここが原因。勇者が死ぬ
	}

}
