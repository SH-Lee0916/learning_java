package hello.core.singleton;

public class SingletonService {
    
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance; // return always same object
    }

    private SingletonService() {} // Prohibit new

    public void logic() {
        System.out.println("Singleton Object");
    }
}
