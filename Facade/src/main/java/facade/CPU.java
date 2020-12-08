package facade;

public class CPU {

    public void Freeze() {
        System.out.println("CPU jäätyi");
    }

    public void Jump(long position) {
        System.out.println("Moving to" + position);
    }

    public void Execute() {
        System.out.println("Executing");
    }

}
