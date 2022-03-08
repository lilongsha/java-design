package cn.lsuper.mediator;

/**
 * @author ALGiii
 */
public class MainApplication {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert");
    }
}
