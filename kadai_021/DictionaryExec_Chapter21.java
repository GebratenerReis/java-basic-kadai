package kadai_021;

public class DictionaryExec_Chapter21 {
	public static void main(String[] args) {
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();  // 辞書を作る

		// 調べたい4つの英単語
		String[] words = { "apple", "banana", "grape", "orange" };

		for (String word : words) {
			dictionary.search(word);  // 1つずつ辞書で調べる
		}
	}
}