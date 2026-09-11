class MultiThread1{
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1("t1");
        MyThread2 t2 = new MyThread2("t2");
        t1.start();
        t2.start();
    }
}
class MyThread1 extends Thread {
    MyThread1(String name) {super(name);}
    public void run(){
        for (int i = 0; i < 10; i++)
            System.out.println(this.getName() + ":" +i);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
    }
}
class MyThread2 extends Thread {
    MyThread2(String name) {super(name);}
    public void run(){
        for (int i = 0; i < 10; i++)
            System.out.println(this.getName() + ":" +i);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
    }
}