package bsu.rfct.orazlyeva;

public class Apple extends Food {
    private String size = null;

    public Apple(String size) {
        super("Apple");
        this.size = size;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }


    public String toString() {
        return super.toString() + " of '" + this.size.toUpperCase() + "' size";
    }

    public void consume() {
        System.out.println(this + " is eaten");
    }

}
