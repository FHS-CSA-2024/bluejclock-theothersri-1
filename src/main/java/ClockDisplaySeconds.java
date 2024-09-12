package src.main.java;


public class ClockDisplaySeconds
{
    //Implement 2 private NumberDisplay objects. 
    //  One for hours and one for minutes
    //Implement a private String for the display
    private NumberDisplay hours;
    private NumberDisplay min;
    private NumberDisplay sec;
    private String display;
    
    //Implement a constructor that takes no parameters
    //The constructor should set hours as a NumberDisplay object with 24 as the limit
    //The constructor should set minutes as a NumberDisplay object with 60 as the limit
    //The constructor should call the method updateDisplay before finishing
    public ClockDisplaySeconds(){
        hours = new NumberDisplay(24);
        min = new NumberDisplay(60);
        sec = new NumberDisplay(60);
        updateDisplay();
        
    }
    //Implement a constructor that takes 2 parameters, hour and minute
    //The constructor should set hours as a NumberDisplay object with 24 as the limit
    //The constructor should set minutes as a NumberDisplay object with 60 as the limit
    //The constructor should call the method setTime with the parameters passed in
    public ClockDisplaySeconds(int hour, int minute, int second){
        hours = new NumberDisplay(24);
        min = new NumberDisplay(60);
        sec= new NumberDisplay(60);
        setTime(hour, minute, second);
    }
    //Implement a method timeTick that takes no parameters and returns nothing
    //The method should increase the minute value by one each run
    //The hours should increase when the minutes roll over
    //The updateDisplay method should be called before finishing
    public void timeTick(){
        min.increment();
        //check to see if value rolled to 0
        
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
    public void setTime(int hour, int minute, int second){
        hours.setValue(hour);
        min.setValue(minute);
        sec.setValue(second);
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
    newDisplay += hours.getDisplayValue();
    newDisplay += ":";
    newDisplay += min.getDisplayValue();
    newDisplay += ":";
    newDisplay += sec.getDisplayValue();

    display = newDisplay;

    
    }
}
