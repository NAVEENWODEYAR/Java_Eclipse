// Java program for creating the generic class..,
package generics;

 class Test<T>
{
	T name;
	public void setName(T name)
	{
		this.name = name;
	}
	public T getName()
	{
		return name;
	}
}
 
public class Generic_Ex1 extends Test {

	public static void main(String[] args) 
	{
		Test<String> obj = new Generic_Ex1();
					obj.setName("Boss");
					System.out.println(obj.getName());

	}

}
