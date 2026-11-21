package kadai_028;

public class JyankenExec_Chapter28 {
	public static void main (String[] args) {
		//インスタンスを作成
		Jyanken_Chapter28 Jyanken = new Jyanken_Chapter28();
		//自分のじゃんけん
		Jyanken.getMyChoice();
		//相手のじゃんけん
		Jyanken.getRandom();
		//じゃんけん結果
		Jyanken.playGame();
	}

}
