package ch10.SuperHero;

//戦うと逃げるしかできないHeroクラス
//Heroの情報
public class Hero {
	  String name = "ミナト";
	  int hp = 100;
	  // 戦う
	  public void attack(Matango m) {
	    System.out.println(this.name + "の攻撃！");
	    m.hp -= 5;
	    System.out.println("5ポイントのダメージをあたえた！");
	  }
	  //10_7 オーバーライドできないHeroクラス
	  //SuperHeroも同じ効果になる
	  public final void slip() {
		  this.hp -= 5;
		  System.out.println(this.name + "は転んだ！");
		  System.out.println("5のダメージ");
	  }
	  // 逃げる
	  public void run() {
	    System.out.println(this.name + "は逃げ出した！");
	  }
	  //10_10コンストラクタの動作を確認する
	  public Hero() {
		  System.out.println("Heroのコンストラクタが発動");
	  }
	}
