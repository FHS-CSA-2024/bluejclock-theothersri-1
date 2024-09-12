package src.main.java;


public class ClockDriver
{
    public static void main(String[] args){
        //Implement tests for your ClockDisplay
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32 to 03:33
        //  * Tick test for 03:09 to 03:10
        //  * Tick test for 01:59 to 02:00
        //  * Tick test for 09:59 to 10:00
        //  * Tick test for 23:59 to 00:00
        System.out.println("testing clock display:");
        ClockDisplay test1 = new ClockDisplay();
        String test1Output = test1.getTime();
        System.out.println("\tEmpty Con. Test - "+test1Output);
        
        ClockDisplay test2 = new ClockDisplay(3,32);
        String test2Output = test2.getTime();
        System.out.println("\t Arg Con. Test - "+test2Output);

        ClockDisplay test3 = new ClockDisplay(3,9);
        String test3Output = test3.getTime();
        System.out.println("\t Arg Con. Test - "+test3Output);
    
        ClockDisplay test4 = new ClockDisplay(9,59);
        String test4Output = test4.getTime();
        System.out.println("\t Arg Con. Test - "+test1Output);
        
        ClockDisplay test5 = new ClockDisplay(23,59);
        String test5Output = test5.getTime();
        System.out.println("\t Arg Con. Test - "+test2Output);

    
        
        
        
        
        //Implement tests for your ClockDisplaySeconds
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32:59 to 03:33:00
        //  * Tick test for 01:00:59 to 01:01:00
        //  * Tick test for 01:59:59 to 02:00:00
        //  * Tick test for 23:59:59 to 00:00:00
        
        System.out.println("testing clock display sec:");
        ClockDisplaySeconds tests1 = new ClockDisplaySeconds();
        String tests1Output = tests1.getTime();
        System.out.println("\tEmpty Con. Test - "+tests1Output);
        
        ClockDisplaySeconds tests2 = new ClockDisplaySeconds(3,32,59);
        String tests2Output = tests2.getTime();
        System.out.println("\t Arg Con. Test - "+tests2Output);

        ClockDisplaySeconds tests3 = new ClockDisplaySeconds(1,59,59);
        String tests3Output = tests3.getTime();
        System.out.println("\t Arg Con. Test - "+tests3Output);
        
        ClockDisplaySeconds tests4 = new ClockDisplaySeconds(23,59,59);
        String tests4Output = tests4.getTime();
        System.out.println("\t Arg Con. Test - "+tests4Output);
        /*CHALLENGE*/
        //Implement tests for your ClockDisplay12Hour
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32PM to 03:33PM
        //  * Tick test for 11:59PM to 12:00AM
        //  * Tick test for 11:59AM to 12:00PM
        //  * Tick test for 12:59PM to 01:00PM
       //*testing clock display:
	/*Empty Con. Test - 00:00
	 Arg Con. Test - 03:32
	 Arg Con. Test - 03:09
	 Arg Con. Test - 00:00
	 Arg Con. Test - 03:32
    testing clock display sec:
	Empty Con. Test - 00:00:00
	 Arg Con. Test - 03:32:59
	 Arg Con. Test - 01:59:59
	 Arg Con. Test - 23:59:59(*/
        
    }
}
