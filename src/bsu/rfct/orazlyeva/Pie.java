package bsu.rfct.orazlyeva;

public class Pie extends Food {
    private String filling = null;

    public Pie(String filling) {
        super("Pie");
        this.filling=filling;
    }

    public String getFilling() {
        return this.filling;
    }

    public void setFilling(String filling) {
        this.filling=filling;
    }

    public String toString() {
        return super.toString() + " with '" + this.filling.toUpperCase() + "'filling";
    }

    public void consume() {
        System.out.println(this + " is eaten");
    }
}
