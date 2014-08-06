package java_test;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a;
		a=new int[10];
		int sum=0;
		for(int i=0;i<10;i++){
			a[i]=i+1;
			sum+=a[i];
		}
		System.out.println(sum);
	}

}
