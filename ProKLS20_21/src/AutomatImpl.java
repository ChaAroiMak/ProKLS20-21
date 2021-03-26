import java.awt.desktop.SystemSleepEvent;
import java.util.HashMap;

public class AutomatImpl implements Automat{
    AutomatImpl automat = new AutomatImpl();
    HashMap<AutomatImpl, State> AUTOMAT = new HashMap<>();

    @Override
    public void start() {
        setState(State.START);
        AUTOMAT.put(automat, State.START);
    }

    @Override
    public void stay() {

    }

    @Override
    public void change(State state) {

    }

    @Override
    public void documentError() {

    }

    @Override
    public String deny() {
        return null;

    }

    public String getState() {
        return AUTOMAT.toString();
    }

    public void end() {
    }

    public void setState(State state) {
        this.setState(state);
    }
}
