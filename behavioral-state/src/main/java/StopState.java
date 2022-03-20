/**
 * @author ALGiii
 */
public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("stop state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "StopState{ stop state }";
    }
}
