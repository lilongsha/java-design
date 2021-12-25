package cn.lsuper.builder;

/**
 * @author ALGiii
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    /**
     * 返回饮料价格
     * @return 饮料价格
     */
    @Override
    public abstract float price() ;
}
