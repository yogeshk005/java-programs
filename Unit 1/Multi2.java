class Multi2{
    public static void main(String[]stdy){
       A a = new A();
       a.abstractMethod();
       a.abstractY();
       a.abstractZ();
        
    }
}

abstract class X{
    X(){System.out.println("Init abstract X");}
    //abstract public void abstractMethod();
    public void concrete(){
        System.out.println("In concreate in abract X");
    }
}

interface Y{
    public void abstractY();
}

interface Z{
    public void abstractZ();
    public void abstractY();
}

class A extends Z implements Y,Z {
    A(){
        System.out.println("Init concrete A");

    }
    public void abstractMethod(){
        System.out.println("Overriding abstract class");

    }
    public void abstractY(){
        System.out.println("Overriding abstarct Y");
    }
    public void abstractZ(){
        System.out.println("Overriding abstarct Z");
    }
}

