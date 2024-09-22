package logging;

public class LoggerChain {
	private static Logger getChainOfLoggers() {
        Logger errorLogger = new ErrorLogger(LogLevel.ERROR);
        Logger debugLogger = new DebugLogger(LogLevel.DEBUG);
        Logger infoLogger = new InfoLogger(LogLevel.INFO);

        infoLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(errorLogger);

        return infoLogger;
    }

    public static void main(String[] args) {
        Logger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(LogLevel.INFO, "This is an information.");
        loggerChain.logMessage(LogLevel.DEBUG, "This is a debug message.");
        loggerChain.logMessage(LogLevel.ERROR, "This is an error message.");
    }

}
