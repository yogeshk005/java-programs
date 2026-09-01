class Multi4{
    public static void main(String[]duue){
        A a = new A();

    }
}

interface X{
    public void absX();
}
interface Y extends X {
    public void absY();
}

class A implements Y{
    public void absY(){}
    public void absX(){}
}