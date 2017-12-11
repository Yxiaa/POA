public class MachineStateInitial implements StateMachine {
    @Override
    public void askCoffee(Machine machine) {

        machine.setState(this);
        System.out.println("impossible");
    }

    @Override
    public void askTea(Machine machine) {

        machine.setState(this);
        System.out.println("impossible");
    }

    @Override
    public void give(int i, Machine machine) {

        if((machine.getVal())>=10)
            machine.setState(new MachinesStateEnCours());
        else
            machine.setState(this);

    }
}
