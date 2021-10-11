interface A
{
void meth1();
void meth2();
}

class MyClass implements A
{
public void meth1 ( )
{
System.out.println("meth1");
}
public void meth2()
{
	System.out.println("meth2");
}
public static void main(String[] args) {
	MyClass c = new MyClass();
	c.meth1();
	c.meth2();
}
}
