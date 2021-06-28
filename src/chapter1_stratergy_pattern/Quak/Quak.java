package chapter1_stratergy_pattern.Quak;

public class Quak implements QuakBehavior {

    @Override
    public void quak() {
        System.out.println("This is one quak behaivior : Quak Quak");
    }
}
