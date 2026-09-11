class MultiThread2{
    public static void main(String[]aaa){
        Thread t1 = new Thread("T1"){
            public void run(){
                for(int i = 0;i<10;i++){
                    System.out.println(this.getName()+";"+i);
                    try{
                        Thread.sleep(5000);
                    }
                    catch(InterruptedException ie){}
                }
            }
        };
         Thread t2 = new Thread("T2"){
            public void run(){
                for(int i = 0;i<10;i++){
                    System.out.println(this.getName()+";"+i);
                    try{
                        Thread.sleep(5000);
                    }
                    catch(InterruptedException ie){}
                }
            }
        };
         Thread t3 = new Thread("T3"){
            public void run(){
                for(int i = 0;i<10;i++){
                    System.out.println(this.getName()+":"+i);
                    try{
                        Thread.sleep(5000);
                    }
                    catch(InterruptedException ie){}
                }
            }
        };
        t1.start();
        t2.start();
        t3.start();
    }
}

