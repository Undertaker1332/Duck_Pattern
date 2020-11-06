package sample.Quack;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println(" . . . ");
        //В этом классе утки всегда полчат (пустая реализация)
    }
}
