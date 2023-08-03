//Создается объект Context, который изменит свое поведение в зависимости от его
// внутреннего состояния.

package ArchitectureSWHW2.State;

public class TVContext implements State {

    private State tvState;

    public void setState(State state) {
        this.tvState = state;
    }

    public State getState() {
        return this.tvState;
    }

    @Override
    public void doAction() {
        this.tvState.doAction();
    }

}
