package check;
import constants.Constants;

//課題①【Check.java】にてフィールド変数firstNameとlastNameを宣言し、firstName →　自分の名字　lastName →　自分の名前で初期化しなさい。
//なお、変数のアクセス修飾子は「private」とする。

public class Check {
	private static String firstName ="ota";
	private static String lastName ="yuto";
	
	//課題②【Check.java】にてfirstNameとlastNameを引数で受け取って、連結して表示させるメソッド「printName」を作成しなさい。
	//作成した関数のアクセス修飾子は「private」とする。
	
private static void printName(String firstName,String lastName) {
	System.out.println("printNameメソッド" + "→" + firstName + lastName);
}
	//課題③【Check.java】にてPetクラスとRobotPetクラスをインスタンス化して、下記の完成イメージを出力させなさい。

	public static void main(String[] args) {
		Check.printName(firstName,lastName);
		
		Pet p = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		p.introduce();
		
		RobotPet rp = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		rp.introduce();
		
		
		
		
		
		

		

	}

}
