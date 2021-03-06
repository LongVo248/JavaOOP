package Inheritance;

public class Mouse extends Animal{
    private int weight;

    //default constructor
    public Mouse(){
        this(100);
    }

    public Mouse(int weight){
        //super();
        this.weight=weight;
    }

    public Mouse(String name, int weight){
        super(name);
        this.weight=weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getAnimalName(){
        return "Mouse";
    }
}
