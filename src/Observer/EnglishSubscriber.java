package Observer;

public class EnglishSubscriber implements  Subscriber{
    private String name;
    private int value;
    //aggregation 관계
    //private LandCh landCh;   //has a 관게
    private Subject landCh;  //유연환 관계를 위함

    public EnglishSubscriber(String name, LandCh landCh) {
        this.name = name;
        this.landCh = landCh;
        landCh.registerSubscriber(this);
    }

    @Override
    /*public void update(int value) {
        this.value = value;  //push 방식
        System.out.println("Mr/Mrs. " + name +  ", the price has been changed " + value + "Won");
    }*/
    public void update() {
        this.value = landCh.getPrice();  //pull 방식
        System.out.println("Mr/Mrs. " + name +  ", the price has been changed " + value + "Won");
    }
}
