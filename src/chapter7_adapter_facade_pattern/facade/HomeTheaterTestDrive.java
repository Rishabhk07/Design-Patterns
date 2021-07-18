package chapter7_adapter_facade_pattern.facade;

public class HomeTheaterTestDrive {
    public static void main(String[] args) throws InterruptedException {
        Projector projector = new Projector();
        DVD dvd = new DVD();
        Amp amp = new Amp();
        Popcorn popcorn = new Popcorn();
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(projector, amp, dvd, popcorn);
        homeTheaterFacade.watchMovie("Iron Man");
        Thread.sleep(1000);
        homeTheaterFacade.endMovie();
    }
}
