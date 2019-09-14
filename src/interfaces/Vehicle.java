package interfaces;

public class Vehicle implements operations{


    public Vehicle(){
        System.out.println("This is a Vehicle");
    }


    @Override
    public void accelerate() {
        System.out.println("It is accelerating");
    }

    @Override
    public void decelerate() {
        System.out.println("It is decelerating");
    }

    @Override
    public void braking() {
        System.out.println("It is braking");
    }

    @Override
    public void shift() {
        System.out.println("It is shifting");
    }
}
