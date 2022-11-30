package additional.computer;

public class Computer {

    private boolean turnedOn = false;

    private Gpu gpu;
    private Processor processor;
    private HardDisk hardDisk;
    private Power power;
    private Ram ram;



    public Computer(Processor processor, HardDisk hardDisk, Power power, Ram ram) {
        this.processor = processor;
        this.hardDisk = hardDisk;
        this.power = power;
        this.ram = ram;
    }

    public Computer(Gpu gpu, Processor processor, HardDisk hardDisk, Power power, Ram ram) {
        this.gpu = gpu;
        this.processor = processor;
        this.hardDisk = hardDisk;
        this.power = power;
        this.ram = ram;
    }

    /**
     * Включает компьютер, если все на месте
     */
    public void turnOn(){

        if (this.gpu == null || this.processor == null || this.hardDisk == null ||
                this.power == null || this.ram == null) {
            return;
        }
        this.turnedOn = true;

    }

    /**
     * Возвращает, включен ли компьютер
     * @return
     */
    public boolean checkStatus() {
        return turnedOn;
    }




}
