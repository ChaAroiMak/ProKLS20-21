import org.junit.Assert;
import org.junit.Test;

public class Tests {
    @Test
    public void correctStartState(){
        //Given a new automat object
        AutomatImpl automat = new AutomatImpl();
        //when it starts at its start point
        automat.start();
        //then it should be in state START
        Assert.assertEquals(automat.getState(), State.START);
    }

    @Test(expected = WrongStateException.class)
    public void wrongStartState(){
        //Given a new automat object
        AutomatImpl automat = new AutomatImpl();
        //when the end point is called before it was in the start state
        automat.end();
        //then there should be an exception
    }

    @Test
    public void goodSwitch() {
        //Given a new automat object
        AutomatImpl automat = new AutomatImpl();
        //when it starts at its start point
        automat.start();
        //and its state gets changed to state B
        automat.change(State.B);
        //then the current state should be B
        Assert.assertEquals(automat.getState(), State.B);
    }

    @Test
    public void goodSwitch2() {
        //Given a new automat object
        AutomatImpl automat = new AutomatImpl();
        //when it starts at its start point
        automat.start();
        //and its state gets changed to state A
        automat.change(State.A);
        //then the current state should be A
        Assert.assertEquals(automat.getState(), State.A);
    }

    @Test
    public void goodSwitch3() {
        //Given a new automat object
        AutomatImpl automat = new AutomatImpl();
        //when it starts at its start point
        automat.start();
        //and its state gets changed to state A
        automat.change(State.A);
        //and it gets changed to A again
        automat.change(State.A);
        //then the current state should be A
        Assert.assertEquals(automat.getState(), State.A);
    }

    @Test
    public void goodSwitch4() {
        //Given a new automat object
        AutomatImpl automat = new AutomatImpl();
        //when it starts at its start point
        automat.start();
        //and its state gets changed to state B
        automat.change(State.B);
        //and it gets changed to AB
        automat.change(State.AB);
        //then the current state should be A
        Assert.assertEquals(automat.getState(), State.A);
    }

    @Test(expected = WrongStateException.class)
    public void badSwitch() {
        //Given a new automat object
        AutomatImpl automat = new AutomatImpl();
        //when it starts at its start point
        automat.start();
        //and the start state is correct
        automat.getState();
        //and it gets changed to state C
        automat.change(State.C);
        //then there should be an exception
    }

    @Test(expected = WrongStateException.class)
    public void badSwitch2() {
        //Given a new automat object
        AutomatImpl automat = new AutomatImpl();
        //when it starts at its start point
        automat.start();
        //and the start state is correct
        automat.getState();
        //and it gets changed to state C
        automat.change(State.D);
        //then there should be an exception
    }

    @Test(expected = WrongStateException.class)
    public void badSwitch3() {
        //Given a new automat object
        AutomatImpl automat = new AutomatImpl();
        //when it starts at its start point
        automat.start();
        //and the start state is correct
        automat.getState();
        //and it gets changed to state AB
        automat.change(State.AB);
        //then there should be an exception
    }

    @Test
    public void wantDeny() {
        //Given a new automat object
        AutomatImpl automat = new AutomatImpl();
        //when it starts at its start point
        automat.start();
        //and the start state is correct
        automat.getState();
        //and it gets changed to state B
        automat.change(State.B);
        //and it gets changed to state D
        automat.change(State.D);
        //then it should deny any further changes of state
        Assert.assertEquals(automat.getState(), automat.deny());
    }

    @Test
    public void wantDeny2() {
        //Given a new automat object
        AutomatImpl automat = new AutomatImpl();
        //when it starts at its start point
        automat.start();
        //and the start state is correct
        automat.getState();
        //and it gets changed to state A
        automat.change(State.A);
        //and it gets changed to state C
        automat.change(State.C);
        //then it should deny any further changes of state
        Assert.assertEquals(automat.getState(), automat.deny());
    }







}
