package Observer;

public class UtubeApp {
    public static void main(String[] args) {
        LandCh landCh = new LandCh();
        KoreanSubscriber ks1 = new KoreanSubscriber("이승재", landCh);
        KoreanSubscriber ks2 = new KoreanSubscriber("이짱구", landCh);

        landCh.setPrice(30000000);

        KoreanSubscriber ks3 = new KoreanSubscriber("이재", landCh);
        landCh.setPrice(29000000);
        landCh.removeSubscriber(ks2);

        Subscriber es1 = new EnglishSubscriber("LSJ", landCh);
        landCh.setPrice(20000000);

    }
}
