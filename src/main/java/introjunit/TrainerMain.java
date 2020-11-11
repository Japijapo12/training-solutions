package introjunit;

public class TrainerMain {

    public static void main(String[] args) {
        Trainer trainer = new Trainer("Jack Doe");

        System.out.println(trainer.getName());

        System.out.println(trainer.getNameUpperCase());
    }
}
