class Animal
{
	public void eat()
	{
		System.out.println("Animals love eating : ");
	}
	public void sleep()
	{
		System.out.println("After eating they love to sleep : ");
	}

}
class Bird extends Animal
{
	public void eat()
	{
		System.out.println("Birds eat less than Others : ");
	}
	public void sleep()
	{
		System.out.println("Birds sleep less than others : ");
	}
	public void fly()
	{
		System.out.println("Birds are the only species that fly : ");
	}
}

class Test
{
	public static void main(String[] args)
	{
		Animal obj1 = new Animal();
		Bird obj2 = new Bird();
		obj1.eat();
		obj1.sleep();
		obj2.eat();
		obj2.sleep();
		obj2.fly();
	}
}