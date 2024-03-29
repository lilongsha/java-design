package cn.lsuper.chanin;

/**
 * @author ALGiii
 */
public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    protected AbstractLogger nextLogger;

    public AbstractLogger getNextLogger() {
        return nextLogger;
    }

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if(this.level <= level){
            write(message);
        }
        if(nextLogger !=null){
            nextLogger.logMessage(level, message);
        }
    }

    /**
     * 打印日志
     * @param message 日志信息
     */
    abstract protected void write(String message);
}
