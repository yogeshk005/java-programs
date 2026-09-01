class AbstractDemo{
    public static void main(String[]kij){
        //X x = new X();
        Y y = new Y();
        y.concreteMethod();
        System.out.println("Done");
    }
}

abstract class X{
    X(){
        System.out.println("Abs class X");
    }
    abstract public void abstractMethod();
    public void concreteMethod(){
            System.out.println("concraete");
    }
    
} 
class Y extends X{
    public void abstractMethod(){}
}