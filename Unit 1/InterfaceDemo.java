class InterfaceDemo{
    public static void main(String[]argk){
        Y y = new Y();
        y.disp();
    }
}

interface MyInterface{
    public void myInterfaceFunc();
}

class X{
    X(){System.out.println("X initialised");}
    public void disp(){
        System.out.println("In x");
    }
    abstract public void foo();
}

class Y extends X implements MyInterface{
    Y(){
        super();
        System.out.println("Y initilized");
    }
    public void myInterfaceFunc(){}
    public void foo(){System.out.println("OR foo");}
}

