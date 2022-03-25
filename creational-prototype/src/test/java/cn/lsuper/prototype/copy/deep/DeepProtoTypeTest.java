package cn.lsuper.prototype.copy.deep;

import org.junit.jupiter.api.Test;

public class DeepProtoTypeTest {
    @Test
    public void deepProtoTypeTest() throws CloneNotSupportedException {
        DeepProtoType protoType = new DeepProtoType();
        protoType.name = "宋江";
        protoType.deepCloneableTarget = new DeepCloneableTarget("大牛", "大牛的类");

        DeepProtoType clone = (DeepProtoType) protoType.clone();
        System.out.println(clone.hashCode());
        System.out.println(clone.deepCloneableTarget.hashCode());

        DeepProtoType clone1 = (DeepProtoType) protoType.clone();
        System.out.println(clone1.hashCode());
        System.out.println(clone1.deepCloneableTarget.hashCode());
    }

    @Test
    public void deepProtoTypeSerializable() {
        DeepProtoType protoType = new DeepProtoType();
        protoType.name = "宋江";
        protoType.deepCloneableTarget = new DeepCloneableTarget("大牛", "大牛的类");

        DeepProtoType clone = (DeepProtoType) protoType.deepClone();
        System.out.println(clone.hashCode());
        System.out.println(clone.deepCloneableTarget.hashCode());

        DeepProtoType clone1 = (DeepProtoType) protoType.deepClone();
        System.out.println(clone1.hashCode());
        System.out.println(clone1.deepCloneableTarget.hashCode());
    }
}
