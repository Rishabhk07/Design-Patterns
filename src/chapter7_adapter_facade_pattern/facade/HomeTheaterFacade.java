package chapter7_adapter_facade_pattern.facade;

public class HomeTheaterFacade {
    Projector projector;
    Amp amp;
    DVD dvd;
    Popcorn popcorn;

    public HomeTheaterFacade(Projector projector, Amp amp, DVD dvd, Popcorn popcorn){
        this.projector = projector;
        this.amp = amp;
        this.dvd = dvd;
        this.popcorn = popcorn;
    }

    public void watchMovie(String movie){
        System.out.println("Ready for watching Movie .....");
        projector.on();
        amp.on();
        amp.surroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
        popcorn.on();
        popcorn.pop();
    }

    public void endMovie(){
        System.out.println("End Movie Watching");
        projector.off();
        amp.off();
        dvd.off();
        popcorn.off();
    }
}
