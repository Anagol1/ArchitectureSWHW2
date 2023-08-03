////Классы TurnOnLightCommand и TurnOffLightCommand реализуют интерфейс Command и будут принимать
//// в конструкторе объект класса Light. И каждый из них будет выполнять только одно действие.
//// Один будет вызывать метод turnOn(), а другой turnOff()

package ArchitectureSWHW2.Command;

public class TurnOnLightCommand implements Command {
    private Light theLight;

    public TurnOnLightCommand(Light light) {
        this.theLight = light;
    }

    public void execute() {
        theLight.turnOn();
    }
}
