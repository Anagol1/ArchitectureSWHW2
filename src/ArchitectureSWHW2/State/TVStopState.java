package ArchitectureSWHW2.State;

// Создаем две конкретные реализации состояний для этого поведения. Состояние для выключения телевизора:
public class TVStopState implements State {

    @Override
    public void doAction() {
        System.out.println("TV is turned OFF");
    }

}
