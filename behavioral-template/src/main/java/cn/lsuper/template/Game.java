package cn.lsuper.template;

/**
 * @Author lilongsha
 * @Description
 * @Date 2022/3/21 13:14
 */
public abstract class Game {
    protected String name;

    public Game(String name) {
        this.name = name;
    }

    abstract void initialize();

    final void startPlay() {
        System.out.println(name + " :: start");
    }

    final void endPlay() {
        System.out.println(name + " :: end");
    }

    final void play() {
        System.out.println(name + " :: running");
    }
}
