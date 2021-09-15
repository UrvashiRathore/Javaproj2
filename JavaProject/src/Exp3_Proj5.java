
public class Exp3_Proj5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i =457 ; i<557 ; i++) {
		int j = i %100;
		int k = j %10;
		int a = j - k;
		int b = i-j ;
		int x = a/10;
		int y =b/100;
		int sum = x + y + k;
		 System.out.println("nu is"+i+"sum is:"+sum);
		}
		
	}

}
