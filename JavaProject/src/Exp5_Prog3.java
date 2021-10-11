interface I1
{
	int division();
	int modulus();
}
public class Exp5_Prog3 {
	int a = 2;
	int b = 4;
	public void division()
	{
		System.out.println(a/b);
	}
	public void modulus()
	{
		System.out.println(a%b);
	}
	public static void main(String[] args)
	{
		Exp5_Prog3 t = new Exp5_Prog3();
		t.division();
		t.modulus();

}}
