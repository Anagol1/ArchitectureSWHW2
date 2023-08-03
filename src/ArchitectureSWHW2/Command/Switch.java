//Создается объект, который принимает инкапсулированные методы объекта Light.
// Он принимает в конструкторе переменные Command, которые будут использоваться
// в созданных методах flipUp() и flipDown().

package ArchitectureSWHW2.Command;

public class Switch {
    private Command flipUpCommand;
    private Command flipDownCommand;

    public Switch(Command flipUpCommand, Command flipDownCommand) {
        this.flipUpCommand = flipUpCommand;
        this.flipDownCommand = flipDownCommand;
    }

    public void flipUp() {
        flipUpCommand.execute();
    }

    public void flipDown() {
        flipDownCommand.execute();
    }
}
