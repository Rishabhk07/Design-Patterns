package chapter1_stratergy_pattern.Quak;

public class MuteQuak implements QuakBehavior{
    @Override
    public void quak() {
        System.out.println("<< silence >>");
    }
}
