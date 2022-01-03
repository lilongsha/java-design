package cn.lsuper.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 男士过滤器
 * @author ALGiii
 */
public class CriteriaMale implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<>();
        for (Person person : persons) {
            if ("MALE".equalsIgnoreCase(person.getGender())) {
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
