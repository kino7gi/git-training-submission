package kadai1;
/*
 *・中心座標と半径を指定することで、円を描画するクラス
　　　　・円描画メソッド
　　　　・円周の長さを取得するメソッド
 */
public class Circle extends Shape{
	private Point center;
	private int radius;
	/*
	 * ・引数なしコンストラクタの定義
　center(x,y座標)、半径全て0で初期化する
	 */
	public void Circle() {
		center x = 0;
		center y = 0;
		
	}
	/**
	 * 引数x,yで受け取ったデータを用いて、1つのPointオブジェクトを生成し、centerフィールドに代入する。
　　　　引数rもradiusフィールドに代入する。
	 */
	public void Circle(Point x, Point y, int r) {
		center = new center(x,y);
		radius = r;
		
		
		
	}

}
