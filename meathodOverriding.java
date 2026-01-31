class Fan {
    void giveAir() {
        System.out.println("Fan gives us air.");
    }
    void consumeElectricity() {
        System.out.println("Fan consumes electricity.");
    }
}
class Cooler extends Fan {
    @Override
    void giveAir() {
        System.out.println("Cooler gives cool air instead of normal air.");
    }
    void swingMode() {
        System.out.println("Cooler swing mode is ON.");
    }
}
class AC extends Cooler {
    @Override
    void giveAir() {
        System.out.println("AC gives cool and filtered air.");
    }
    @Override
    void consumeElectricity() {
        System.out.println("AC consumes more electricity than a fan or cooler.");
    }
    void setTemperature(int temp) {
        System.out.println("AC temperature is set to " + temp + "°C.");
    }
}
public class meathodOverriding {
    public static void main(String[] args) {
        Fan fan = new Fan();
        Cooler cooler = new Cooler();
        AC ac = new AC();
        System.out.println("----- Fan -----");
        fan.giveAir();
        fan.consumeElectricity();
        System.out.println("\n----- Cooler -----");
        cooler.giveAir();
        cooler.consumeElectricity();
        cooler.swingMode();
        System.out.println("\n----- AC -----");
        ac.giveAir();
        ac.consumeElectricity();
        ac.swingMode();
        ac.setTemperature(22);
    }
}