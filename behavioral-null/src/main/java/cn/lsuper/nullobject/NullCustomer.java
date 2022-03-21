package cn.lsuper.nullobject;

/**
 * @Author lilongsha
 * @Description
 * @Date 2022/3/21 10:45
 */
public class NullCustomer extends AbstractCustomer{

    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }
}
