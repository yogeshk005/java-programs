class SealedClass{
    public static void main(String[]args){
        Student s = new Student();
        UG u = new UG();
        PG p = new PG();
    }
}

sealed class Student permits UG,PG,Diploma{
    Student(){System.out.println("Students class (selaed)");}
}

non-sealed class UG extends Student{
    UG(){System.out.println("UG Students");}
}
non-sealed class PG extends Student{
    PG(){System.out.println("PG Students");}
}
non-sealed class Diploma extends Student{
    Diploma(){System.out.println("Dilpoma Students");}
}