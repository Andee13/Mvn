package mvn_test;

import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class Hobby {
    private byte timeStartHours;
    private short timeEndHours;
    private int dayOfTheWeek;
    private long timesYouDidIT;
    private float interval;
    private double salary;
    private String  name;
    private boolean isActive;
    Logger logger;
        //Constructors
    public Hobby() {
    }

    public Hobby(long timesYouDidIT, String name, boolean isActive, Logger logger) {
        this.logger = logger;
        logger.info("Object hobby has been created");
        logger.debug("Object hobby has been created");
        logger.error("Object hobby has been created");
        this.timesYouDidIT = timesYouDidIT;
        this.name = name;
        this.isActive = isActive;

    }

    public Hobby(byte timeStartHours, short timeEndHours, int dayOfTheWeek, long timesYouDidIT, float interval, double salary, String name, boolean isActive, Logger logger) {
        this.timeStartHours = timeStartHours;
        this.timeEndHours = timeEndHours;
        this.dayOfTheWeek = dayOfTheWeek;
        this.timesYouDidIT = timesYouDidIT;
        this.interval = interval;
        this.salary = salary;
        this.name = name;
        this.isActive = isActive;
        this.logger = logger;
        this.logger = logger;
        logger.info("Object hobby has been created");
        logger.debug("Object hobby has been created");
        logger.error("Object hobby has been created");
    }

    public Hobby(byte timeStartHours, short timeEndHours, double salary, String name, boolean isActive, Logger logger) {
        this.timeStartHours = timeStartHours;
        this.timeEndHours = timeEndHours;
        this.salary = salary;
        this.name = name;
        this.isActive = isActive;
        this.logger = logger;
        logger.info("Object hobby has been created with name " + this.name);
        logger.debug("Object hobby has been created with name " + this.name);
        logger.error("Object hobby has been created with name " + this.name);
    }
        //Getters Setters
    public byte getTimeStartHours() {
        return timeStartHours;
    }

    public void setTimeStartHours(byte timeStartHours) {
        this.timeStartHours = timeStartHours;
    }

    public short getTimeEndHours() {
        return timeEndHours;
    }

    public void setTimeEndHours(short timeEndHours) {
        this.timeEndHours = timeEndHours;
    }

    public int getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    public void setDayOfTheWeek(int dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }

    public long getTimesYouDidIT() {
        return timesYouDidIT;
    }

    public void setTimesYouDidIT(long timesYouDidIT) {
        this.timesYouDidIT = timesYouDidIT;
    }

    public float getInterval() {
        return interval;
    }

    public void setInterval(float interval) {
        this.interval = interval;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void tellAboutHobby(){
        System.out.println("Hobby{" +
                "timeStartHours=" + timeStartHours +
                ", timeEndHours=" + timeEndHours +
                ", dayOfTheWeek=" + dayOfTheWeek +
                ", timesYouDidIT=" + timesYouDidIT +
                ", interval=" + interval +
                ", salary=" + salary +
                ", name=" + name +
                ", isActive=" + isActive +
                '}');
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "timeStartHours=" + timeStartHours +
                ", timeEndHours=" + timeEndHours +
                ", dayOfTheWeek=" + dayOfTheWeek +
                ", timesYouDidIT=" + timesYouDidIT +
                ", interval=" + interval +
                ", salary=" + salary +
                ", name=" +name +
                ", isActive=" + isActive +
                '}';
    }
    public void logMethod  (String parameter){
        if(logger.isDebugEnabled())
            logger.debug("Debug mode: " + parameter);

        if(logger.isInfoEnabled())
            logger.info("Info mode: " + parameter);

        logger.error("Error mode: " + parameter);

    }
}
