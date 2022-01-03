package cn.lsuper.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ALGiii
 */
public class CriteriaSingle implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<>();
        for (Person person : persons) {
            if("SINGLE".equalsIgnoreCase(person.getMaritalStatus())){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
