

public class Machine {

    StateMachine sm;
    public int val;

    public void Machine() {
        sm = null;
        val = 0;
    }

    public void setState(StateMachine sm) {
        this.sm = sm;
    }

    public StateMachine getState() {
        return sm;
    }

    public void askCoffee() {
        sm.askCoffee(this);
        val = 0;
    }

    public void askTea() {
        sm.askTea(this);
        val = 0;
    }

    public void give(int i) {
        val = val + i;
        sm.give(val, this);
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
