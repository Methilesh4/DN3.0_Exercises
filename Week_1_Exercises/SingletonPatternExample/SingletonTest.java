public class SingletonTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("First log message");
        logger2.log("Second log message");

        // Check if both references point to the same instance
        System.out.println("logger1 and logger2 are the same instance: " + (logger1 == logger2));
    }
}
