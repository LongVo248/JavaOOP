package Polymorphism;

import Inheritance.Animal;

public class Cat extends Animal {
    private int age;
    private int height;

    public Cat(int age, int height){
        //call default constructor of parent class (Animal)
        super();
        this.age=age;
        this.height=height;
    }

    public Cat(String name, int age, int height){
        //call constructor of parent class (Animal)
        super(name);
        this.age=age;
        this.height=height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    //implement abstract method
    @Override
    public String getAnimalName(){
        return "Cat";
    }
}
