class SealedClassDemo{
    public static void main(String[]bbb){
       D d = new D();
       d.showC();
    }
}

sealed class A permits B,C{
    A(){System.out.println("Class A");}
    public void showA(){System.out.println("Show A");}
}

final class B extends A{
    B(){System.out.println("Class B");}
    public void showB(){System.out.println("Show B");}
}

non-sealed class C extends A{
    C(){System.out.println("Class C");}
    public void showC(){System.out.println("Show C");}
}

non-sealed class D extends C{
    D(){System.out.println("Class D");}
    public void showD(){System.out.println("show D");}
}