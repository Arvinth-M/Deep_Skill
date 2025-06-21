public class LoggerTester {
    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        logger1.logging("First log message");

        Logger logger2 = Logger.getInstance();
        logger2.logging("Secong log message");

        System.out.println("Logger1 hashcode: " + logger1.hashCode());
        System.out.println("Logger2 hashcode: " + logger2.hashCode());

        if(logger1 == logger2){
            System.out.println("Both logger Instances are same.");
        }
        else{
            System.out.println("Both logger instance are different.");
        }
    }
}