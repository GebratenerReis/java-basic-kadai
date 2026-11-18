package kadai_018;

public abstract class Kato_Chapter18 {

    //フィールド定義
    public String familyName = "加藤";
    public String givenName = ""; //各名前が入る？
    public String address = "東京都中野区〇×";

    //メソッド
    public void commonIntroduce() {
        System.out.println("名前は" + familyName + givenName + "です");
        System.out.println("住所は" + address + "です");
    }
    
    abstract public void eachIntroduce();
    
    public void execIntroduce() {
    	commonIntroduce(); //共通の紹介呼び出す
    	eachIntroduce(); //個別の紹介呼び出す
    }
}
