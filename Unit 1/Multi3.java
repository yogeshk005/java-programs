class Multi3{
    public static void main(String[]yyy){
        A a = new A();
        a.abstractX();
        a.abstractY();
        a.abstractZ();
    }
}

interface X{public void abstractX();}
interface Y{public void abstarctY();}
interface Z{public void abstarctZ();}

class A implements X,Y,Z{
    A(){
        System.out.println("Init A");
    }
    public void abstractX(){
        System.out.println("X override");
    }
    public void abstractY(){
        System.out.println("Y overide");
    }
    public void abstractX(){
        System.out.println("Z override");
    }
}