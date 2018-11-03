package mvn_test;

import org.apache.logging.log4j.*;
//import org.apache.logging.log4j.LogManager;

public class Main{
    private static  final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        Hobby emptyHobby = new Hobby();

        Hobby reading = new Hobby(15, "Reading", true, logger);
        System.out.println(reading.toString());
        Hobby programming = new Hobby((byte)12,(short)10 , 1,"programming", true, logger);
        programming.tellAboutHobby();
        programming.logMethod("programming is a hobby");
        Hobby math = new Hobby((byte)12,(short)17, 3, 3, (float) 3.5,677.90, "programming", true, logger);
        math.logMethod("math is hobby");

    }


}
