package com.example.threading;

public class App 
{
   
    public static void anotherImplementor(AnotherInterFace n, String implementation){
        System.out.println(n.toBoot(implementation));
    }

    public static void doubleImplementation(FunctionalInterfaces n, String a, String b){
        System.out.println(n.doSomething(a, b));
    }

    public static FunctionalInterfaces getInterface(){
        return (a, b) -> a+b;
    }
   
    public static void main( String[] args )
    {
        /*FunctionalInterfaces functionalInterfaces = (haand, ur) ->  haand.toUpperCase();
        System.out.println(functionalInterfaces.doSomething("handu man", " jabele beay"));
*/
        //implementation
      //  AnotherInterFace s = n -> n+" hey there";

       // System.out.println(s.toBoot("toboot"));

      /*  anotherImplementor(n -> n.toUpperCase(), "Alonso Churtch");

        anotherImplementor(n -> n.substring(0, 1)+ "100", "1001");

        anotherImplementor(s, "to boot");
*/
      //  doubleImplementation((a,b) -> a+b, "Sum", "mer");

      //  getInterface().doSomething("a", "p");

      TestInterface op = a -> System.out.println(a);
      op.accept("sdknvsl");

      TestInterface a = System.out::println;

      a.accept("some thing");
    }
}
