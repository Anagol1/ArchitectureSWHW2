//Создается класс Light, который умеет две вещи: включить свет и выключить.
// В терминах паттерна - это "приемник команд (receiver)"

package ArchitectureSWHW2.Command;

public class Light {
    public Light() {
    }

    public void turnOn() {
        System.out.println("The light is on");
    }

    public void turnOff() {
        System.out.println("The light is off");
    }
}
