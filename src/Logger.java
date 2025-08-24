import java.time.LocalDateTime;

public class Logger {
    protected int num = 1;
    private static Logger instance;
    StringBuilder loggerString = new StringBuilder();

    private Logger() {
    }


    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String msg) {
        String currentLog = "[" + LocalDateTime.now() + " ^" + num++ + "] " + msg;
        //сохраняем в логгер для последующей записи в файл
        loggerString.append(currentLog).append("\n");
        //выводим на консоль по ТЗ
        System.out.println(currentLog);
    }

    public String getLoggerString () {
        return loggerString.toString();
    }
}
