package week08d04;

public class MainTrainer {

    public static void main(String[] args) {
        Trainer goodTrainer = new Trainer(new GoodMood());

        BadMood badMood = new BadMood();
        Trainer badTrainer = new Trainer(badMood);

        System.out.println(goodTrainer.giveMark());
        System.out.println(badTrainer.giveMark());


        goodTrainer.setMood(new BadMood());
        System.out.println(goodTrainer.giveMark());
    }
}
