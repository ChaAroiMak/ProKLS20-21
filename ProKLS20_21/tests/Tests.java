import org.junit.Assert;
import org.junit.Test;

public class Tests {
    @Test
    public static void correctStartState(){
        AutomatImpl automat = new AutomatImpl();
        automat.start();

        Assert.assertEquals(automat.getState(), State.A);
    }

    @Test(expected = WrongStateException.class)
    public static void wrongStartState(){
        AutomatImpl automat = new AutomatImpl();
        automat.end();

        Assert.assertEquals(automat.getState(), State.A);
    }

    @Test
    public static void goodSwitch() {
        AutomatImpl automat = new AutomatImpl();
        automat.start();
        automat.change(State.B);
        Assert.assertEquals(automat.getState(), State.B);
    }

    @Test(expected = WrongStateException.class)
    public static void badSwitch() {
        AutomatImpl automat = new AutomatImpl();
        automat.start();
        automat.change(State.C);
    }

    @Test(expected = WrongStateException.class)
    public static void badSwitch2() {
        AutomatImpl automat = new AutomatImpl();
        automat.start();
        automat.change(State.D);
    }

    @Test(expected = WrongStateException.class)
    public static void badSwitch3() {
        AutomatImpl automat = new AutomatImpl();
        automat.start();
        automat.change(State.AB);
    }

    @Test
    public static void wantDeny() {
        AutomatImpl automat = new AutomatImpl();
        automat.start();
        automat.change(State.B);
        automat.change(State.D);

        Assert.assertEquals(automat.getState(), automat.deny());
    }

    





}
