package cn.lsuper.filter;

import java.util.List;

/**
 * @author ALGiii
 */
public interface Criteria {
    /**
     * 结合过滤器返回过滤后的结果
     * @return 根据条件返回过滤后的列表
     * @param persons 待过滤数据
     */
    List<Person> meetCriteria(List<Person> persons);
}
