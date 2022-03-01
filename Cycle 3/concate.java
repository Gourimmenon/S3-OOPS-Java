/*Java program to concatenate two numbers and strings using method
overloading concept.*/
public class concate
{ 
  public static void main(String args[])
   {
   concate Obj=new concate();
   Obj.consum(5,6);
   Obj.consum("GOURI"+" "+"M MENON");
   }
  void consum(int a,int b)
  {
      String c= Integer.toString(a);
      String d= Integer.toString(b);
   System.out.println("Concated number:" +c+d);
  }
  void consum(String a)
   {
    System.out.println("Concated String=" +a);
   }
}

