class Inh2{
    public static void main(String[]aaa){
        C c = new C();
        c.show();

    }
}

class A{
    A(){
        System.out.println("Inide constructor A");
    }
    public void show(){
        System.out.println("Class A show");
    }
}

class B extends A{
    B(){
        super();
        System.out.println("Inside Constructor B");

    }
    public void show(){
        System.out.println("Class B show");
        super.show();
    }

}

class C extends B{
    C(){
        super();
        System.out.println("Inside C class");

    }
    public void show(){
        System.out.println("Class C show");
        super.show();
    }
}