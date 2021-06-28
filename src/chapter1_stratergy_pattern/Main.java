package chapter1_stratergy_pattern;

import chapter1_stratergy_pattern.Fly.FlyRocketPowered;

public class Main {
    public static void main(String[] args) {
        /*
        The Strategy Pattern defines a family of algorithms,
         encapsulates each one, and makes them interchangeable.
          Strategy lets the algorithm vary independently from clients that use it.
         */

        // In this example fly and quak can have different algorithms to perform, so we encpsulate them
        // and with this process we can add more effectively and interchange them on runtime
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuak();

        Duck model = new ModelDuck();

        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered()); // here  we change the fly algorithm !!
        model.performFly();

    }
}
