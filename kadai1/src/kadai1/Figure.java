package kadai1;
/*
 * ・図形描画機能の定義 ・長さ測定機能の定義
 */
public interface Figure {//図形が必ず持つべき機能を定義
	/**
	 * 図形描画機能の定義
	 */
	void draw();

	/**
	 * 長さ測定機能の定義
	 * 
	 */
	double getPerimeter();
}
