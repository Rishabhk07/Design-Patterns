package chapter1.Quak;

public class MuteQuak implements QuakBehavior{
    @Override
    public void quak() {
        System.out.println("<< silence >>");
    }
}
