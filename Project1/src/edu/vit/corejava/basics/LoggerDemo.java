package edu.vit.corejava.basics;
import java.util.logging.Logger;
public class LoggerDemo {
    public final static Logger logger=Logger.getLogger("global");
    public static void main(String[] a){
        logger.info("This method is only used for real time industry level projects instead of system.out.println");
        logger.warning("If you use system.out.println in projects then it becomes difficult to comment out the unnecessary things");
        logger.severe("if you use system.out.println in a company then you will be fired ");
        logger.info("here using this logger we can finally tell the logger to what to display and what not to display for end user");
        
    }
}
