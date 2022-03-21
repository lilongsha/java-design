package cn.lsuper.template;

/**
 * @Author lilongsha
 * @Description
 * @Date 2022/3/21 13:15
 */
public class Football extends Game{
    public Football(String name) {
        super(name);
    }

    @Override
    void initialize() {
        System.out.println("Football init success :: " + name);
    }
}
