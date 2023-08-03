package ArchitectureSWHW2.Command;

/*the Command for turning on the light*/

/*the Command for turning off the light*/

//Паттерн применяется в ситуации, когда нужно отделить конкретное исполнение. Чтоб использование
// каких-то функций не зависело от конкретной реализации и ее можно было изменять без ущерба для системы.
public class TestCommand{
    public static void main(String[] args){
        // создаем объект, который будет использоваться
        Light l=new Light();
        // создаем объекты для всех умений объекта Light:
        Command switchUp=new TurnOnLightCommand(l);
        Command switchDown=new TurnOffLightCommand(l);

        // Создаемтся invoker, с которым мы будем непосредственно контактировать:
        Switch s=new Switch(switchUp,switchDown);

        // вот проверка этого, используем методы:
        s.flipUp();
        s.flipDown();
    }
}