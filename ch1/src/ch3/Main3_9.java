package ch3;
//for文を二重にして九九の段の表を作る
public class Main3_9 {

	public static void main(String[] args) {
		for (int i=1; i<10; i++) {
			for (int j=1; j<10; j++) {
				System.out.print(i*j);//掛け算の結果
				System.out.print(" ");//空白
			}
			System.out.println("");//改行
		}
	}

}
