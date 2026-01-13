package ch11;
//newされたくなかったり、こうしてほしいという意図がある場合はコメントを残す。
//abstractを入れることによってnew出来なくなる
public abstract class Character {
	String name;
	int hp;
	//逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
	//未来の開発者様へ
	//私はCharacterクラス開発者のナギサです。
	//このクラスを開発している時点では、
	//将来このクラスを継承して作るそれぞれの職業のクラスが何ポイントのダメージを与えるか
	//を確定できないため、メソッドの中は空にしております。
	//Characterクラスを継承してクラスを作る際は
	//attack()の中身を必ずオーバーライドしてください。
	
	//抽象メソッド
	public abstract void attack(Matango m);
	}
}
