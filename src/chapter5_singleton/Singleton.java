package chapter5_singleton;

public class Singleton {
    // Another method to singleton thread safe os that we initialize it on the class initialization.
    // private  volatile static Singleton uniqueInstance = new Singleton();

    //    Another way to make this singleton thread safe is to make it volatile,
    //    and then synchronising the new Singleton creation code
    //    which makes only the new creation of the singleton synchronised
    private  volatile static Singleton uniqueInstance;

//   private static Singleton uniqueInstance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if(uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
