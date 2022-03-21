package cn.lsuper.nullobject;

/**
 * @Author lilongsha
 * @Description
 * @Date 2022/3/21 10:45
 */
public class RealCustomer extends AbstractCustomer{
    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
