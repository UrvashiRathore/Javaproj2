class Exp5_Prog1{
		
	public static void main(String[] args) {
		Arithmetic c = new Arithmetic();
		System.out.println(c.square());
}
}
class Arithmetic implements Test
{
	int b;
	public int square()
	{
		b = 15;
		return(b*b);
	}
}
interface Test
{
int square();
}
