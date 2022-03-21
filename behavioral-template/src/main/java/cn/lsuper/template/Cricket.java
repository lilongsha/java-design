package cn.lsuper.template;

/**
 * @Author lilongsha
 * @Description
 * @Date 2022/3/21 13:15
 */
public class Cricket extends Game{
    public Cricket(String name) {
        super(name);
    }

    @Override
    void initialize() {
        System.out.println("Cricket init success :: " + name);
    }
}
