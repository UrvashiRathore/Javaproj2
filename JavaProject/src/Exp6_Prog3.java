import java.sql.*;
class Exp6_Prog3 {
 
    public static void main(String args[])
    {
        try {
 
            int a[] = { 1, 2, 3, 4, 5 };
  
            System.out.println(a[7]);
            try {
            	int j = 0 ;
                int i = 10;
 
              int c = i/j;
            }
   
            	catch(Exception e){
        			e.printStackTrace();
        			
        		}
        		System.out.println("division by zero not allowed ");
        }
        catch (Exception e1) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }

	private static double divide(int i, int j) {
	
		return (i/j);
	}
}