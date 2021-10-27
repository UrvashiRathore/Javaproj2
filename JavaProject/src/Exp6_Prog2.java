import java.sql.*;
public class Exp6_Prog2 {
	public static void main(String[] args)
	{
		int i=3 ;
		int j = 0;
		try
		{
			double c = divide(i,j);
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		System.out.println("division by zero not allowed ");
	}
	static double divide(int i,int j)
	{
		return(i/j);
	}
	

}
