package interfaces;


/**
 * This is and interface.
 * Interfaces are implemented by another class.
 * They can be extended in other Interfaces.
 */
public interface operations {


    /**
     * Default methods are used to update an interface if it has new features.
     * They can contain implementation and cannot be overriden
     */
    default void fly(){
        System.out.println("This is a default method Fly .");
    }

    default void swim(){
        System.out.println("This is a default method Swim.");
    }

    static void engineStart(){
        System.out.println("All start engines before running.");
    }

    void accelerate();
    void decelerate();
    void braking();
    void shift();

}
