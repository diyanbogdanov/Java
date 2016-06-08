package weekfifteen;

public abstract class HeavyElement {
    private double weight;

    public HeavyElement(double weight) {
        setWeight(weight);
    }
    
    public HeavyElement() {
        this(0);
    }
    
    public HeavyElement(HeavyElement obj) {
        this(obj.getWeight());
    }
    
    public void setWeight(double weight) {
        if (weight < 0) {
            this.weight = 0;
        } else {
            this.weight = weight;
        }
    }

    public double getWeight() {
        return weight;
    }
    
    public abstract double calcWeight();
}