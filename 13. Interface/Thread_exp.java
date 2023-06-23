class MultiThreadDemo implements Runnable{
    public void run(){
        try {
            System.out.println("Thread is runnig ");
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }

}

public class Thread_exp {
    public static void main(String args[]){
        for(int i=0; i<5; i++){
            Thread obj = new Thread(new MultiThreadDemo());
            Thread obj1 = new Thread(new MultiThreadDemo());
            obj.start();
            obj1.start();
        }
    }
}
