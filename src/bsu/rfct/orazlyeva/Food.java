package bsu.rfct.orazlyeva;

public abstract class Food implements Consumable {
    private String name = null;

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public boolean equals(Object arg0) {
        if (!(arg0 instanceof Food)) return false;
        if (this.name==null || ((Food)arg0).name==null) return false;
        return name.equals(((Food)arg0).name);
    }

    public String toString() {
        return this.name;
    }
}

