package singleton;

public class Run {
    public static void main(String[] args) {
        EagerInitialization.getInstance().singletonTest();
        StaticBlockSingleton.getStaticBlockSingleton().singletonTest();
        LazySingleton.getLazySingleton().singletonTest();
        ThreadSafeSingleton.getThreadSafeSingleton().singletonTest();
    }
}
