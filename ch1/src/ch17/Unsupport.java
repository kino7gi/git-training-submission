package ch17;
//オリジナル例外を定義する
public class Unsupport extends Exception{
	public UnsupportedMusicFileException(String msg) {
		super(msg);
	}

}
