package cn.lsuper.prototype.copy.deep;

import java.io.Serializable;

/**
 * @author ALGiii
 */
public class DeepCloneableTarget implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;

    private String cloneName;
    private String cloneClass;

    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
