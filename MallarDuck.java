package sample;

import sample.Flying.FlyWithWings;
import sample.Quack.Quack;

public class MallarDuck extends Duck {
    public MallarDuck () {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display () {
        System.out.println("I'm real Mak Duck maaaan");
    }
}
