class ThreadSync{
    public static void main(String[]qqq){
        Counter c = new Counter();
        //c.increment("T1");
        Thread t1 = new Thread("T1"){
            public void run(){
                for(int i = 0;i<1000;i++)
                    c.increment(this.getName());
                    try{
                        Thread.sleep(5);
                    }
                    catch(InterruptedException ie){}
            }
        };

        Thread t2 = new Thread("T2"){
            public void run(){
                for(int i = 0;i<1000;i++)
                    c.increment(this.getName());
                    try{
                        Thread.sleep(1);
                    }
                    catch(InterruptedException ie){}
            }
        };
        t1.start();
        t2.start();

    }
}

class Counter{
    int count = 0;
    void increment(String threadName){
        //count++;
        System.out.println(threadName+" incr to :"+(++count));
    }
}