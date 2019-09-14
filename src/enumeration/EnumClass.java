package enumeration;


/**
 * Enum holds CONSTANT values that cannot be changed.
 * For exe, can hold weekdays, dice numbers, gender.
 * enum can be used in switch cases where you switch methods etc
 *
 */
public class EnumClass {

    /** Global variables. */
    //enum variables below
    private enum WeekDays {
        //these values can be use as a Switch case.
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
    }

    private enum Dice {
        /** This is the only CONSTANT available for use */
        fjrst(1), sec(2), third(3);

        //enum var to hold the var that is inside ()
        int number;

        /** enum Constructor */
        //this is use to declare how we got those CONSTANT above
        Dice(int value){
            number = value;
        }
    }




/** This is the Constructor */
    public EnumClass(){
        System.out.println(Dice.fjrst.number);
    }
}
