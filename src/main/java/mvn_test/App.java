package mvn_test;


import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
public class App 
{
    private static final Logger logger = org.apache.logging.log4j.LogManager.getLogger(App.class.getName());
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );

        logger.error("Everything is good");
        System.out.println("gg");
    }
}
