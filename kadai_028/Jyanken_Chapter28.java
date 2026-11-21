package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	public String getMyChoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
	
		//じゃんけんの入力を取得する
		Scanner scanner = new Scanner(System.in);
		String choice = scanner.next();
		
		while (!choice.equals("r") && !choice.equals("s") && !choice.equals("p")) {
		System.out.println("正しく入力してください。");
		choice = scanner.next();
		}
		scanner.close();
		return choice;
}
	
	public String getRandom () {
		String[] cpu = {"r","s","p"};
		int index = (int) Math.floor(Math.random() * 3); // 0, 1, 2 のどれか
		return cpu[index];
	}
	
	public void playGame() {
		HashMap<String,String> result = new HashMap<String,String>();
		result.put("r","グー");
		result.put("s","チョキ");
		result.put("p","パー");
		
		String myChoice = getMyChoice();
		String cpuChoice = getRandom();
		System.out.println("自分の手は"+result.get(myChoice)+"対戦相手の手は"+result.get(cpuChoice));
			
		//じゃんけん勝敗
		if (myChoice.equals(cpuChoice)) {
			System.out.println("あいこです");
		} else if ((myChoice.equals("r") && cpuChoice.equals("s")) 
			|| (myChoice.equals("s") && cpuChoice.equals("p")) 
			|| (myChoice.equals("p") && cpuChoice.equals("r"))){
			System.out.println("自分の勝ちです");	
		} else {
			System.out.println("自分の負けです");
		}
	
		
		
		
		
	}
}