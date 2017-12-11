public class MachinesStateEnCours implements StateMachine {
    @Override
    public void askCoffee(Machine machine) {

        //machine.setState(this);
        System.out.println("tiens ton café");
        machine.setState(new MachineStateInitial());
        machine.setVal(0);
    }


    @Override
    public void askTea(Machine machine) {

        //machine.setState(this);
        System.out.println("tiens ton thé");
        machine.setState(new MachineStateInitial());
        machine.setVal(0);
    }

    @Override
    public void give(int i, Machine machine) {
        if(i>=10)
            machine.setState(this);
    }
}
