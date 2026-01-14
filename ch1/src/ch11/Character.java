package ch11;
//Characterクラスを作成(未完成)

/*newして欲しくないなど、伝えたいことがある際はこのようにして
 * コメントに残しておくと便利
 */
public class Character {
	String name;
	int hp;
	//逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
	/*未来の開発者様へ
	 * 私はCharacterクラス開発者のナギサです
	 *このクラスを開発している段階では、将来このクラスを継承して
	 *作るそれぞれの職業のクラスが何ポイントのダメージを与えるか
	 *を確定できないので、メソッドは空にしてあります。
	 *Characterクラスを景勝してクラスを作る際には、
	 *attack()の中身を必ずオーバーライドして使ってください
	 */
	
	//戦う
	//抽象メソッド
	public abstract void attack(Matango m);
	}

}
