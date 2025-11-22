package lab.facade;

public class Main {
    public static void main(String[] args) {
        IHardDrive drive = new Ssd();   // or: new Hdd()
        ComputerFacade computer = new ComputerFacade(new Cpu(), new Memory(), drive);
        computer.start();


        // pretend the computer does some work
        System.out.println("Main: doing user tasks...\n");

        
        computer.sleep();

        computer.wake();

        computer.shutdown();
    }
}
