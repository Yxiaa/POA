public class Main {

    public static void main(String [ ] args)
    {
        Machine machine = new Machine();
        machine.setState(new MachineStateInitial());
        machine.askCoffee();
        machine.give(10);
        machine.askCoffee();
        machine.askTea();
        machine.give(5);
        machine.askTea();

    }

}
