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
               System.out.println("Testing 12 Hour Clock Display:");
        //Implement tests for your ClockDisplay12Hour
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        ClockDisplay12Hour test1_12 = new ClockDisplay12Hour();
        System.out.println("\tEmpty Con. Test - " + test1_12.getTime());
        //      * Constructor w/ time given & read time
        ClockDisplay12Hour test2_12 = new ClockDisplay12Hour(2, 45, false);
        System.out.println("\t2 Arg Con. Test - " + test2_12.getTime());
        //      * Set time
        //      * Read time
        //      * Tick time
        // Tick test for 03:32 PM to 03:33 PM
        ClockDisplay12Hour tickTest1_12 = new ClockDisplay12Hour(3, 32, false);
        System.out.println("\tTickTest1 Before increment - " + tickTest1_12.getTime());
        tickTest1_12.timeTick();
        System.out.println("\tTickTest1 After increment - " + tickTest1_12.getTime());

        // Tick test for 11:59 PM to 12:00 AM
        ClockDisplay12Hour tickTest2_12 = new ClockDisplay12Hour(11, 59, false);
        System.out.println("\tTickTest2 Before increment - " + tickTest2_12.getTime());
        tickTest2_12.timeTick();
        System.out.println("\tTickTest2 After increment - " + tickTest2_12.getTime());

        // Tick test for 11:59 AM to 12:00 PM
        ClockDisplay12Hour tickTest3_12 = new ClockDisplay12Hour(11, 59, true);
        System.out.println("\tTickTest3 Before increment - " + tickTest3_12.getTime());
        tickTest3_12.timeTick();
        System.out.println("\tTickTest3 After increment - " + tickTest3_12.getTime());

        // Tick test for 12:59 PM to 01:00 PM
        ClockDisplay12Hour tickTest4_12 = new ClockDisplay12Hour(12, 59, false);
        System.out.println("\tTickTest4 Before increment - " + tickTest4_12.getTime());
        tickTest4_12.timeTick();
        System.out.println("\tTickTest4 After increment - " + tickTest4_12.getTime());

    }
}
