package cn.lsuper.interator;

/**
 * @author ALGiii
 */
public class MainApplication {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        for (Iterator iterator = nameRepository.getIterator();iterator.hasNext();) {
            Object name = iterator.next();
            System.out.println(("Name :" + name));
        }
    }
}
