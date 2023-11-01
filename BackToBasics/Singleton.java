package BackToBasics;

public class Singleton { //only one object can be created
    private Singleton(){
    }
    private static Singleton instance;
    public static Singleton getInstance(){
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }
}
