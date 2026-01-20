package kadai1;

/**
 * ・2つの座標データを指定することで、線を描画するクラス
　　　　・線描画メソッド
　　　　・線の長さを取得するメソッド
 */

public class Line interface Figure {
	private Point p1;
	private Point p2;
		/**
		 * ・引数なしコンストラクタの定義
		　p1(x,y座標)、p2(x,y座標)全て0で初期化する。
		 */
		public void Line() {
			p1 = (0,0);
			p2 = (0,0);
		}

		/*
		 * 引数で受け取ったデータを用いて、2つのPointオブジェクトを生成。
		p1フィールドとp2フィールドにそれぞれを代入する。
		 */
	public void Line(double x1, double y1, double x2, double y2) {
		double p1 = new Point(x1, y1);
		double p2 = new Point(x2, y2);
	}
	/**
	 * 以下のようなメッセージを表示する。なお、始点をp1、終点をp2とする。
	 */
	public double draw(){
		System.out.println("[線を描画]始点" + p1 + "から終点" + p2 + "まで");
	}
	/**
	 * 始点データと終点データを使い、以下の計算式で算出した結果を返す。
	　　　　(( 終点のx座標 - 始点のx座標 ) ^2
	　　　　　　+ ( 終点のy座標 - 始点のy座標 ) ^2 ) の平方根
	
	　　　　累　乗...Math.powメソッド
	　　　　平方根...Math.sqrtメソッド
	 */
	public double getPerimeter(){
		double ruijyou = Math.pow((p2,x2)-(p1,x1));
		double ruijyou1 = Math.pow((p2,y2)-(p1,y1));
		double heihoukonn = Math.sqrt(ruijyou1 + ruijyou);
		return double(heihoukonn);
		}

}
