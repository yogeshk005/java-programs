class Thread1{
    public static void main(String[]sss){
        MyThread t1 = new MyThread("t1");
        t1.start();
    }
}

class MyThread extends Thread{
    MyThread(String name){
        super(name);
    }
    public void run(){
        for(int i=0;i<5;i++)
            System.out.println("Running :"+ i);
            try{
                System.out.println("Before Sleep :"+this.getState());
                Thread.sleep(5000)
                System.out.println("After Sleep :"+this.getState());
            }
            catch(InterruptedException ie){}
            
    }
}