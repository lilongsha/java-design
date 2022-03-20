/**
 * @author ALGiii
 */
public class StartState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "StartState{ start state }";
    }
}
