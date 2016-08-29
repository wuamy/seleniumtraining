package utility;
import org.apache.log4j.Logger;
/**
 * Created by amy on 8/29/2016.
 */
public class Log {
    //Initialize log4j logs
    private static Logger Log = Logger.getLogger(Log.class.getName());
    //This is to print log for the beginning of the test case, as we usually run so many
    //test cases as a test suite
    public static void startTestCase(String sTestCaseName){
        Log.info("*************************************************");
        Log.info("*************************************************");
        Log.info("$$$$$$$$$$$$       "+sTestCaseName+ "     $$$$$$$");
        Log.info("*************************************************");
        Log.info("*************************************************");
    }
    //This is to print log at the end
    public static void endTestCase(String sTestCaseName){
        Log.info("XXXXXXXXXXXX  "+"--E--N----D-" + "   XXXXXXXXXXXXX");
        Log.info("X");
        Log.info("X");
        Log.info("X");
        Log.info("X");
    }
    // Need to create these method, os that they can be called
    public static void info(String message){
        Log.info(message);
    }
    public static void error(String message) {
       Log.error(message);
    }
    public static void fatal(String message) {
        Log.fatal(message);
    }
    public static void debug(String message) {
        Log.debug(message);
    }

}
