public class test_logger {
    public static void main(String[] args) {
        logger logger1 = logger.getInstance();
        logger logger2 = logger.getInstance();
        logger1.log("Hello from logger1");
        logger2.log("Logger2 saying hi");
        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same! Singleton works.");
        } else {
            System.out.println("Different instances! Singleton failed.");
        }
    }
}
