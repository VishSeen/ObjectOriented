package polymorphism;


public class Baby extends Human {

    private String mSize;
    private static int NUMBER_OF_BABY = 0;
    private int mId;

    public Baby(String gender, String size){
        super(gender);
        this.setSize(size);

        mId = ++NUMBER_OF_BABY;
    }



    @Override
    public void eat(String eating){
        System.out.println("Baby is eating " + eating);
    }


    public void setSize(String size){
        mSize = size;
    }

    public int getId(){
        return mId;
    }
}
