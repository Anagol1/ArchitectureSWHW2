//В нашем примере у нас может быть два состояния — одно для включения телевизора и
// другое для его выключения. Состояние для включения телевизора:

package ArchitectureSWHW2.State;

public class TVStartState implements State {

    @Override
    public void doAction() {
        System.out.println("TV is turned ON");
    }

}
