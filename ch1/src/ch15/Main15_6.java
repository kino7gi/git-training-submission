package ch15;
//文字列パターンを用いたプレイヤー名のチェック
public class Main15_6 {
	public boolean isValidPlayerName(String name) {
		return name.matches("[A-Z][A-Z0-9]{7}");
	}

}
