package cn.lsuper.prototype;

/**
 * @author ALGiii
 */
public abstract class Shape implements Cloneable{
    private String id;
    protected String type;

    /**
     * 输出当前图形
     */
    abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public Shape clone() {
        try {
            Shape clone = (Shape) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            clone.setId(clone.getType() + "__" + clone.getId() +"__");
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
