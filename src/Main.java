public class Main {
    public static void main(String[] args) throws InterruptedException {
        SubThread sub = new SubThread();
        Thread thread = new Thread(sub);
        ThreadExtend extend = new ThreadExtend();
        thread.start();
        extend.start();
        for(int i=0;i<50;i++){
            System.out.println("Main Thread: "+i);
            Thread.sleep(500);
        }
    }
}
