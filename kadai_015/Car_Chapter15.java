package kadai_015;

public class Car_Chapter15 {
		//フィールドの定義
		private int gear = 1;
		private int speed = 10; 
		
	
		//メソッド	
		public void changeGear (int afterGear) {
			 int beforeGear = this.gear;
			 this.gear = afterGear;
			 if (gear == 1) {
				 speed = 10;
			 } else if (gear == 2) {
				 speed = 20;
			 } else if (gear == 3) {
				 speed = 30;
			 } else if (gear == 4) {
				 speed = 40;
			 } else if (gear == 5) {
				 speed = 50;
			 } else {
				 speed = 10; // それ以外の場合は10km
			 }
			 
			 System.out.println("ギア" + beforeGear + "から" + afterGear + "に切り替えました");
		 }
		 public void run () {
			 System.out.println("速度は時速" + speed + "kmです");
		 }	
}
