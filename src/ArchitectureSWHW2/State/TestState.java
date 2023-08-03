//Преимущества использования шаблона State для реализации полиморфного поведения хорошо видны,
// вероятность ошибки меньше, и очень легко добавить больше состояний для дополнительного поведения,
// что делает его более устойчивым, легко поддерживаемым и гибким.
// Также шаблон State помог избежать условной логики if-else или switch-case в этом сценарии.

package ArchitectureSWHW2.State;

public class TestState {

    public static void main(String[] args) {
        TVContext context = new TVContext();
        State tvStartState = new TVStartState();
        State tvStopState = new TVStopState();

        context.setState(tvStartState);
        context.doAction();

        context.setState(tvStopState);
        context.doAction();

    }

}
