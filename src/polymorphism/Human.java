package polymorphism;


/**
 * Basic Object model.
 * the constructor should be public so as to be accessed by other Objects.
 * fields and methods should be private so as to be secured and inaccesible directly outside this class,
 *
 */

//starting of the Human java file..
public class Human {

    /**
     * Global fields.
     * they can be accessed anywhere inside this class.
     *
     */
    private String mGender;
    private boolean hasLegs;
    public boolean hasHands;
    private boolean canStand;
    private boolean canEat;
    private boolean canDrink;




    /**
     * Object Constructor.
     * this is the constructor. it is the main method of the object.
     * it is used to access fields and metjods.
     * without the constructor one cant access or make the object
     *
     */
    public Human(){
        System.out.println("This is a human.");

        mGender = "man";
        hasHands = true;
        hasLegs = true;

        canStand = true;
        canEat = true;
        canDrink = true;
    }

    //Method overloading happening in construtor.
    //more on Method Overloading class
    public Human(String gendder){
        /**
         * Local Fields.
         * here "type" is a field that is it is destroyed as soon as we leave this method.
         *
         */

        System.out.println("This is a " + gendder + ".");
    }




    /**
     * Java Methods.
     * these are procedures that can be accessed by the object.
     * most methods should be access outside this class apart logic methods needed for some task in this class.
     *
     */
    public void drink(){
        System.out.println("Human is drinking.");
    }

    public void stand(){
        System.out.println("Human is standing.");
    }

    public void eat(){
        System.out.println("Human is eating.");
    }

    //Method overloading happening.
    //more on Method Overloading class
    public void eat(String eating){
        System.out.println("Human is eating " + eating);
    }




    /**
     * Getters Methods.
     * these methods are used to get the data stored in the fields.
     * the return value should match the data that you want to return.
     * these should ALWAYS be PUBLIC as they should be able to be accessed outside this class.
     *
     */
    public boolean getCanStand(){
        return canStand;
    }

    public boolean getCanEat(){
        return canEat;
    }

    public boolean getCanDrink(){
        return canDrink;
    }




    /**
     * Setters Methods.
     * these methods are used to set values to the fields by using paramters(values passed in method)
     * these should always be public as they should be accessed outside this class.
     *
     */
    public void setCanStand(boolean standing){
        canStand = standing;
    }

    public void setCanEat(boolean eating){
        canEat = eating;
    }

    public void setCanDrink(boolean drinking){
        canDrink = drinking;
    }

}
