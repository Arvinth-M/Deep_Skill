public class Logger {

    private static Logger instance;

    private Logger(){
        System.out.println("Logger Intialized.");
    }

    public static Logger getInstance(){
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }

    public void logging(String msg){
        System.out.println("Log message: "+msg);
    }
}

