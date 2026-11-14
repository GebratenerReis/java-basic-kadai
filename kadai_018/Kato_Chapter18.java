package kadai_018;

public abstract class Kato_Chapter18 {

    // フィールド(クラスの直下に書く)
    String familyName = "加藤";
    String givenName;
    String address = "東京都中野区〇×";

    public void setGivenName(String givenName) {
    	this.givenName = givenName;
    }
    
    // メソッド(mainの外に書く)
    public void commonIntroduce() {
        System.out.println("名前は" + familyName + givenName + "です。");
        System.out.println("住所は" + address + "です。");
    }
    
    abstract void eachIntroduce();
}