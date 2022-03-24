package cn.lsuper.factory.simple.pizza;

/**
 * @author ALGiii
 */
public abstract class Pizza {
    /**
     * pizza 名子
     */
    protected String name;

    /**
     * 准备制作披萨
     */
    public abstract void prepare();

    public void bake() {
        System.out.println(name + " baking;");
    }

    public void cut() {
        System.out.println(name + " cutting;");
    }

    public void box() {
        System.out.println(name + " boxing;");
    }

    public void setName(String name) {
        this.name = name;
    }
}
