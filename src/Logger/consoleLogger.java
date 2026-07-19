package Logger;

public class consoleLogger implements Logger {
    public void log (String message){
        System.out.println("LOG: "+ message);
    }

}
