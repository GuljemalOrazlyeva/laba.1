package bsu.rfct.orazlyeva;


public class Cheese extends Food {
    public Cheese() {
        super("Cheese");
    }

    public void consume() {
        System.out.println(this + " is eaten");
    }
}
