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
	@Deprecated
	public T disp()
	{
		System.out.println("Generic class, provides the type saftey.,");
		System.out.println(this.name);
		return  reg_No ;
	}
}
public class Generic_Ex2 extends Test1
{
	
	Generic_Ex2(Object reg_No, Object name) {
		super(reg_No, name);
		System.out.println("Child class constructor..,");
	}

	public static void main(String[] args) 
	{
		Test1<String> t = new Generic_Ex2("100","Bhaskar");
						t.disp();
						System.out.println("Reg No-" +t.reg_No);
	}

}
