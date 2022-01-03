package cn.lsuper.filter;

import java.util.List;

/**
 * @author ALGiii
 */
public class OrCriteria implements Criteria{
    private final Criteria criteria;
    private final Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> personList = criteria.meetCriteria(persons);
        List<Person> peopleList = otherCriteria.meetCriteria(persons);
        for (Person person : personList) {
            if (peopleList.contains(person)) {
                peopleList.add(person);
            }
        }
        return peopleList;
    }
}
