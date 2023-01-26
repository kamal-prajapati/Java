package MultiThreading;

public class tableThread2 extends Thread {

    classTable t;
    public tableThread2(classTable t) {
        this.t=t;
    }
    public void run() {
        t.prinTable(5);
    }
}
