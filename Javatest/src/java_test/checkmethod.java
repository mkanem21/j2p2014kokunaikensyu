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
		System.out.print(kyoka+"�̌��ʂ�");
		if(seiseki>80)
		{
			System.out.println("���i");
		}
		else{
			System.out.println("�s���i");
		}
	}

}
//check�Ƃ������\�b�h���܂������āA�ォ��check�ɂ͂ǂ���������������̂���private statics�`�ɏ����B
