package generics;

class Test3<T>
{	
	T name;
	// Generic class..,
	Test3(T name)
	{
		this.name = name;
	}
	public T disp()
	{
		return name;
	}
}
public class Generic_Ex3 extends Test3
{
	Generic_Ex3(Object name)
	{
		super(name);
	}
	public static void main(String[] args) 
	{
		Test3<String> t = new Generic_Ex3("Bhaskar");
						System.out.println("Generic class variable,"+t.disp());
	}

}
