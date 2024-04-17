public class SingletonClass {

    private static SingletonClass instance = null;

    private SingletonClass(){}

    public static SingletonClass getInstance(){
        if (instance == null)
            instance = new SingletonClass();
        return instance;
    }


}
