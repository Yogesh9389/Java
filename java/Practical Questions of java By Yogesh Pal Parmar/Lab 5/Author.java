class Author 
{
	public String name;
	public String email;
	public char gender;
	Author()
	{
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	void setName(String name)
	{
		this.name = name;
	}
	String getName()
	{
		return name;
	}
	void setEmail(String email)
	{
		this.email = email;
	}
	String getEmail()
	{
		return email;
	}
	void setGender(char gender)
	{
		this.gender = gender;
	}
	char getGender()
	{
		return gender;
	}
}
class Book extends Author
{
	Book()
	{
		super();
	}
	public String nameOfBook;
	public double price;
	public double eqityInStock;
	Book(String nameOfBook, double price, double eqityInStock)
	{
		this.nameOfBook = nameOfBook;
		this.price = price;
		this.eqityInStock = eqityInStock;
	}
	void setNameOfBook(String nameOfBook)
	{
		this.nameOfBook = nameOfBook;
	}
	String getNameOfBook()
	{
		return nameOfBook;
	}
	void setPrice(double price)
	{
		this.price = price;
	}
	double getPrice()
	{
		return price;
	}
	void setEqityInStock(double eqityInStock)
	{
		this.eqityInStock = eqityInStock;
	}
	double getEqityInStock()
	{
		return eqityInStock;
	}
}

class Test
{
	public static void main(String[] args)
	{
		Author ob1 = new Author();
		Book ob2 = new Book("NCERT", 250.0, 10);
		ob2.setNameOfBook("NCERT");
		System.out.println(ob2.getNameOfBook());
		ob2.setPrice(250.0);
		System.out.println(ob2.getPrice());
		ob2.setEqityInStock(10);
		System.out.println(ob2.getEqityInStock());
		ob1.setName("Yogesh");
		System.out.println(ob1.getName());
		ob1.setEmail("parmaryogeshpal@gmail.com");
		System.out.println(ob1.getEmail());
		ob1.setGender('M');
		System.out.println(ob1.getGender());
	}
}