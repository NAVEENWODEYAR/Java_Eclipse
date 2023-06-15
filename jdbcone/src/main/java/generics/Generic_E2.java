package generics;

class Test1<T>
{
	T reg_No;
	T name;
	Test1(T reg_No, T name)
	{
		this.reg_No = reg_No;
		this.name = name;
	}
	public T disp()
	{
		System.out.println("Generic class, provides the type saftey.,");
		System.out.println(this.name);
		return  reg_No ;
	}
}
public class Generic_E2 
{

	public static void main(String[] args) 
	{
		

	}

}
