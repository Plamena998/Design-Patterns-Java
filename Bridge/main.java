// Интерфейсът за всички устройства
interface Device {
    void setPower(boolean on);
    void setVolume(int volume);
}

// Конкретно устройство 1
class TV implements Device {
    public void setPower(boolean on) { System.out.println("TV is " + (on ? "ON" : "OFF")); }
    public void setVolume(int v) { System.out.println("TV volume: " + v); }
}

// Конкретно устройство 2
class Radio implements Device {
    public void setPower(boolean on) { System.out.println("Radio is " + (on ? "ON" : "OFF")); }
    public void setVolume(int v) { System.out.println("Radio volume: " + v); }
}

// Базов клас за всички дистанционни
abstract class Remote {
    protected Device device; // Ето го МОСТА към интерфейса

    protected Remote(Device device) { this.device = device; }

    public void togglePower() { device.setPower(true); }
}

// Разширено дистанционно (Refined Abstraction)
class AdvancedRemote extends Remote {
    public AdvancedRemote(Device device) { super(device); }

    public void mute() {
        System.out.println("Remote: Muting device");
        device.setVolume(0);
    }
}

public class Main {
    public static void main(String[] args) {
        // Свързваме напреднало дистанционно с TV
        AdvancedRemote remoteControl = new AdvancedRemote(new TV());
        remoteControl.togglePower();
        remoteControl.mute();

        // Същото дистанционно може да работи и с Radio без промяна в кода му
        AdvancedRemote radioRemote = new AdvancedRemote(new Radio());
        radioRemote.togglePower();
    }
}