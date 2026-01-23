package rennsyuu17;

public class Main17_1 {

	public static void main(String[] args) {
		try {
		String s = null;
		System.out.println(s.length());	
		}catch(NullPointerException e){
			System.out.println("NullPointerException例外をcatchしました");
			System.out.println("___スタックトレース(ここから)＿＿");
			e.printStackTrace();
			System.out.println("___スタックトレース(ここまで)＿＿");		
		}

	}

}
