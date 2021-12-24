package behavioural.strategy;


interface Strategy {
   public int calculate(int a, int b);
 }
 
  class AddOperation implements Strategy{
   public int calculate(int a , int b)
   {
       return a+b;
   }
 }
 
  class Subtract implements Strategy{
   public int calculate(int a , int b)
   {
       return a-b;
   }
 }
 
   class Multiply implements Strategy{
   public int calculate(int a , int b)
   {
       return a*b;
   }
  }
    class Division implements Strategy{
   public int calculate(int a , int b)
   {
       return a/b;
   }
  }
   
   
 class Context {
 
 private Strategy strategy;
 
 
 public Context (Strategy strategy)
   {
      this.strategy=strategy;
 
   }
 
 public int executeStrategy(int a, int b)
   {
    return strategy.calculate(a, b);
 
    }
 }
 
 
 public class DPStrategy{
 
    public static void main (String args[])
    {
        Context ctx= new Context(new AddOperation());
          int val= ctx.executeStrategy(1,2);
     System.out.println("Add "+val);
     
        ctx= new Context(new Subtract());
        val= ctx.executeStrategy(3,4);
          System.out.println("Subtract "+val);
          
        ctx= new Context(new Multiply());
        val=  ctx.executeStrategy(4,5);
            System.out.println("Multiply  "+val);
        
    }
 }