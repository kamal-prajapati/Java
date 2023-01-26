package MultiThreading;

public class tableThread1 extends Thread {

    classTable t;

    public tableThread1(classTable t) {
        this.t=t;
    }

    public void run() {
        t.prinTable(5);
    }

}
