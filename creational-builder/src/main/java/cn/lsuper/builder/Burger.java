package cn.lsuper.builder;

/**
 * @author ALGiii
 */
public abstract class Burger implements Item{
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    /**
     * 返回汉堡价格
     * @return 汉堡价格
     */
    @Override
    public abstract float price() ;
}
