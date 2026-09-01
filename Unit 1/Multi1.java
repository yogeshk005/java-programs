class Multi1{
    public static void main(String[]ttd){
        A a = new A();
        a.dispX();
        a.dispY();
        a.dispZ();
    }
}

class X {
    X(){
        System.out.println("Init X");
    }
    public void dispX(){
        System.out.println("Inside X");
    }
}

interface Y{
    public void dispY();
}
final interface Z{
    public void dispZ();
}
class A extends X implements Y,Z{
    A(){
        System.out.println("Init A");
    }
    //override
    public void dispY(){System.out.println("Overriding DispY");}
    public void dispZ(){System.out.println("Overriding DispZ");}
}