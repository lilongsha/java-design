package cn.lsuper.prototype.copy.deep;

import java.io.*;

/**
 * @author ALGiii
 */
public class DeepProtoType implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;

    public String name;
    public DeepCloneableTarget deepCloneableTarget;

    public DeepProtoType() {
        super();
    }

    /**
     * 方式一：使用clone
     * @return 克隆的新对象
     * @throws CloneNotSupportedException 异常
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        Object deep = null;
        deep = super.clone();

        DeepProtoType deepProtoType = (DeepProtoType) deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        return deep;
    }

    public Object deepClone() {
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try (
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(bos);

                ){
            oos.writeObject(this);
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);

            return (DeepProtoType) ois.readObject();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bis != null) {
                    bis.close();
                }
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return null;
    }
}
