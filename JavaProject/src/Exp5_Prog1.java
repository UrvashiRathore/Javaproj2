
interface Test
{
int square();
}
class Arithmetic implements Test
{
	int b;
	public int square()
	{
		b = 12;
		return(b*b);
	}
		
	public static void main(String[] args) {
		Arithmetic c = new Arithmetic();
		c.square();
}
}