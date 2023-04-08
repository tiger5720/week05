package Observer;

public class KoreanSubscriber implements Subscriber{
    private String name;
    private int value;
    //aggregation 관계
    //private LandCh landCh;   //has a 관게
    private Subject landCh;

    public KoreanSubscriber(String name, LandCh landCh) {
        this.name = name;
        this.landCh = landCh;
        landCh.registerSubscriber(this);
    }

    @Override
    /*public void update(int value) {
        this.value = value;
        System.out.println(name + "님 가격이 " + value + "원으로 변경되었습니다.");
    }*/

      public void update() {
        this.value = landCh.getPrice();  //pull
        System.out.println(name + "님 가격이 " + value + "원으로 변경되었습니다.");
    }
}
