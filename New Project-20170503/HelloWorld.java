public class HelloWorld{
     public static void main(String []args){
        System.out.println("Hello World");
        HelloWorld a = new HelloWorld();
        a.add(1,2);
       
 }
     public void add(int a, int b)
     {
         int c=a+b;
         System.out.println("Sum:"+c);
     }
}
