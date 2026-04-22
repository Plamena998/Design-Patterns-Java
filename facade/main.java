// Сложни подсистеми
class CPU { void start() { System.out.println("CPU started"); } }
class RAM { void load() { System.out.println("RAM loaded"); } }

// Фасада
class ComputerFacade {
    private CPU cpu = new CPU();
    private RAM ram = new RAM();

    public void startComputer() {
        cpu.start();
        ram.load();
        System.out.println("Computer is ready!");
    }
}

// Клиент
public class Main {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.startComputer(); // Използваме само един метод вместо два
    }
}