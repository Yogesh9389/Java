class StudentDemo
{
    public int r;
    public String name;
    void getData(int r, String name)
    {
    		this.r = r;
    		this.name = name;
    }
    void display()
     {
         System.out.println("Roll no is : "+ r);
         System.out.println("Name is  : " + name);
     }
     void show()
     {
          System.out.println("Name: "+ name +" Roll number :" + r);
     }
    StudentDemo(int rollNo, String name)
     {
		System.out.println("Name is : " + name + "Roll number is : " + rollNo);
     }
}
 class Demo
{
    public static void main(String[] args)
     {
       StudentDemo obj1 = new StudentDemo(101, "Rakesh");
       obj1.getData(101, "Rakesh");
       obj1.display();
       obj1.show();
      
       StudentDemo obj2 = new StudentDemo(102, "Dhruv");
       obj2.getData(102, "Dhruv");
       obj2.display();
       obj2.show();
       
       
            
	System.out.println(obj1);
      System.out.println(obj2);

     }
}
