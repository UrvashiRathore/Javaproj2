
public class Exp3_Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = new int[10];
		for(int i = 0 ;i<10 ;i++)
		{
			num[i] = Integer.parseInt(args[i]);
		}
		int square[] = new int[10];
		for(int i = 0 ;i<10 ;i++)
		{ 
			
			 square[i] = num[i]*num[i];
		     System.out.println("Square of number"+num[i]+"is"+square[i]+".");
			
		}
		int i,j ,sum ;
		i = Integer.parseInt(args[10]);
		j = Integer.parseInt(args[11]);
		
		if( i < 10 )
		{
			if( j < 10 )
			{
				sum = square[i]+square[j];
				System.out.println("Sum of square of numbers "+num[i]+"and"+num[j]+"is"+sum+".");
			}
		}
	}

}
