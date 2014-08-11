package java_test;

public class checkmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int eigo =95;
		int suugaku =75;
		
		check("English",eigo);
		check("Math",suugaku);
	}

	private static void check(String kyoka, int seiseki) {
		// TODO Auto-generated method stub
		System.out.print(kyoka+"の結果は");
		if(seiseki>80)
		{
			System.out.println("合格");
		}
		else{
			System.out.println("不合格");
		}
	}

}
//checkというメソッドをまずおいて、後からcheckにはどういう働きがあるのかをprivate statics～に書く。
