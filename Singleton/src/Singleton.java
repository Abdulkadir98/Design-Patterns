
public class Singleton{

    public static Singleton mUniqueInstance;

    private Singleton(){}

    public static Singleton getInstance(){
        if(mUniqueInstance == null)
            mUniqueInstance = new Singleton();

        return mUniqueInstance;
    }
}
