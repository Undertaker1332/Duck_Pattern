package sample;

import sample.Flying.FlyNoWay;
import sample.Quack.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    public void display() {
        System.out.println("Im the Duckynator 3000");
    }
}