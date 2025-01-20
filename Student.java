package oops;

public class Student {
	  int x;
	  String y;
	  void Info(int rollno,String name)
	  {
		   y=name; 
		   x=rollno;
	  }
	  void display()
	  {
		  System.out.println(x);
		  System.out.println(y);
	  }
       public static void main(String args[])
       {
    	   Student obj=new Student();
    	   obj.Info(234,"akhila");
    	   obj.display();
       }
}
