package src.main.java;


public class ClockDisplay12Hour
{
    
    //Extend ClockDisplay for a 12 hour clock. This means you need to track AM/PM
        //Implement 2 private NumberDisplay objects. 
    //  One for hours and one for minutes
    //Implement a private String for the display
    private NumberDisplay hours;
    private NumberDisplay min;
    private NumberDisplay sec;
    private NumberDisplay AMPM;
    private String display;
    String dispAMPM = "";
    
    //Implement a constructor that takes no parameters
    //The constructor should set hours as a NumberDisplay object with 24 as the limit
    //The constructor should set minutes as a NumberDisplay object with 60 as the limit
    //The constructor should call the method updateDisplay before finishing
    public ClockDisplay12Hour(){
        hours = new NumberDisplay(24);
        min = new NumberDisplay(60);
        sec = new NumberDisplay(60);
        AMPM = new NumberDisplay(2);
        updateDisplay();
        
    }
    //Implement a constructor that takes 2 parameters, hour and minute
    //The constructor should set hours as a NumberDisplay object with 24 as the limit
    //The constructor should set minutes as a NumberDisplay object with 60 as the limit
    //The constructor should call the method setTime with the parameters passed in
    public ClockDisplay12Hour(int ampm, int hour, int minute, int second){
        hours = new NumberDisplay(24);
        min = new NumberDisplay(60);
        sec= new NumberDisplay(60);
        AMPM = new NumberDisplay(2);
        setTime(ampm, hour, minute, second);
    }
    //Implement a method timeTick that takes no parameters and returns nothing
    //The method should increase the minute value by one each run
    //The hours should increase when the minutes roll over
    //The updateDisplay method should be called before finishing
    public void timeTick(){
        min.increment();
        //check to see if value rolled to 0
        if(hours.getValue()==0){
            AMPM.increment();
        }
        
        if(min.getValue()==0){
            hours.increment();
        }
        
        sec.increment();
        if(sec.getValue()==0){
            min.increment();
        }
        updateDisplay();
    }
    //Implement a method setTime that takes in 2 parameters, hour and minute
    //The method should set the hours value and minutes value
    //The updateDisplay method should be called before finishing
    public void setTime(int ampm, int hour, int minute, int second){
        hours.setValue(hour);
        min.setValue(minute);
        sec.setValue(second);
        AMPM.setValue(ampm);
        updateDisplay();
    }
    //Implement a method getTime that takes no parameter and returns a String
    //The return String should be formatted as HH:MM and report out the current time
public String getTime(){
    return display;
}
    //Implement a method updateDisplay that takes no parameters and returns nothing
    //The method should update the displayString with the current time in a format
    //  HH:MM
    public void updateDisplay(){
    String output = "";
    String newDisplay = "";
    

    if(AMPM.equals(1))
    {
        dispAMPM = "AM";
    }
    else
    {
        dispAMPM = "PM";
    }
    
    newDisplay += hours.getDisplayValue();
    newDisplay += ":";
    newDisplay += min.getDisplayValue();
    newDisplay += ":";
    newDisplay += sec.getDisplayValue();
    newDisplay += " " + dispAMPM;
    display = newDisplay;

    
    }
    //Update all methods and parameters to accomodate this change
}
