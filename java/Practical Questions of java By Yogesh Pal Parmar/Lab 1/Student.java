class Student
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
         System.out.println("Roll no is : "+r);
         System.out.println("Name is  : " +name);
     }
     void show()
     {
          System.out.println("Name: "+name+" Roll number :"+r);
     }
     public String toString()
     {
           return "Name is :"+name+" Roll no is : "+r;
     }
}
 class DemoStudent
{
    public static void main(String[] args)
     {
       Student obj1 = new Student();
       obj1.getData(101, "Rakesh");
       obj1.display();
       obj1.show();
      
       Student obj2 = new Student();
       obj2.getData(102, "Dhruv");
       obj2.display();
       obj2.show();
       
       
            
	System.out.println(obj1);
      System.out.println(obj2);

     }
}
/*
Convert this program from toString function to paramarterised constructor

*/

/* 
Object class toString method:-
 public String toString()
{
return getClass().getName()+"@"+Integer.toHexString(hashCode());
}

*/