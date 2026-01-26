package ch18;
//ファイルに1文字ずつ書き込む
import java.io.FileWriter;
public class Main18_2 {

	public static void main(String[] args) throws Exception{
		FileWriter fw = new FileWriter("data.txt");
		fw.write('そ');
		fw.write('れ');
		fw.write('で');
		fw.write('は');
		fw.close();
	}

}
