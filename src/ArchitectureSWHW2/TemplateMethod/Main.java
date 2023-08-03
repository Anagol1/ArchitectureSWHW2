/*   Паттерн  «Шаблонный метод» (Template Method), позволяет избавиться от дублирования кода,
 а так же повысить его универсальность и переиспользуемость.
 */
//Пример испольхзования на основе приложения, которое рисует флаги

package ArchitectureSWHW2.TemplateMethod;

class Colors {

    static void paintWhiteColor() {
        System.out.println("Полоса белого цвета нарисована");
    }

    static void paintBlueColor() {
        System.out.println("Полоса синего цвета нарисована");
    }

    static void paintRedColor() {
        System.out.println("Полоса красного цвета нарисована");
    }
}
abstract class AbstractThreeRowsFlag {

    abstract void drawUpperLevel();
    abstract void drawMiddleLevel();
    abstract void drawBottomLevel();

    /**
     * Метод drawFlag(), содержащий алгоритм рисования флага, является шаблонным методом.
     * Он так называется потому, что задает скелет в виде последовательности шагов,
     * которые будут переопределять (реализовывать), каждый по своему, наследники AbstractThreeRowsFlag.
     * Его подклассы не смогут изменить последовательность шагов, т.к. шаблонный метод помечен,
     * как final и не наследуется.
     *
     */

    final void drawFlag() {
        drawFlagpole();
        drawUpperLevel();
        drawMiddleLevel();
        drawBottomLevel();
    }

    private void drawFlagpole() {
        System.out.println("Флагшток нарисован");
    }
}

//Классы для рисования Российского и флага Нидерландов:

class RussianFlag extends AbstractThreeRowsFlag {

    @Override
    void drawUpperLevel() {
        Colors.paintWhiteColor();
    }

    @Override
    void drawMiddleLevel() {
        Colors.paintBlueColor();
    }

    @Override
    void drawBottomLevel() {
        Colors.paintRedColor();
    }
}
class NetherlandsFlag extends AbstractThreeRowsFlag {

    @Override
    void drawUpperLevel() {
        Colors.paintRedColor();
    }

    @Override
    void drawMiddleLevel() {
        Colors.paintWhiteColor();
    }

    @Override
    void drawBottomLevel() {
        Colors.paintBlueColor();
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Рисуем флаг России:");
        AbstractThreeRowsFlag russianFlag = new RussianFlag();
        russianFlag.drawFlag();

        System.out.println("\nРисуем флаг Нидерландов:");
        AbstractThreeRowsFlag netherlandsFlag = new NetherlandsFlag();
        netherlandsFlag.drawFlag();
    }
}

// Добавив к набору цветов другие цвета, можно рисовать любые другие подобные трехцветные флаги