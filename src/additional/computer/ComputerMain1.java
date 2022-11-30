package additional.computer;

public class ComputerMain1 {

    public static void main(String[] args) {
        Computer computer1 = new Computer(new Gpu(),new Processor(), new HardDisk(),
                new Power(),new Ram());
        computer1.turnOn();
        System.out.println("Включили компьтер: "+computer1.checkStatus());


        Computer computer2 = new Computer(new Processor(), new HardDisk(),
                new Power(),new Ram());
        computer1.turnOn();
        System.out.println("Включили компьтер: "+computer2.checkStatus());

    }
}
