public class ThreadExtend extends Thread {
    @Override
    public void run() {
        for(int i=0;i<50;i++){
            System.out.println("Extend Thread : "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
