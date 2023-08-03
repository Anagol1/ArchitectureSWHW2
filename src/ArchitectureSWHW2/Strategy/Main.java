//Паттерн «Стратегия» — это шаблон в программировании, при котором происходит
// объединение нескольких возможных алгоритмов поведения объекта в единый класс.
// Каждый алгоритм взаимозаменяем и выбирается прямо во время выполнения программы.

package ArchitectureSWHW2.Strategy;

interface Strategy {

    int execute(int x, int y);

}

class ConcreteStrategicAdd implements Strategy {

    public int execute(int x, int y) {

        System.out.println("Вызывается ConcreteStrategic Add's execute()");

        return x + y;

    }

}


class ConcreteStrategicSubtract implements Strategy {


    public int execute(int x, int y) {

        System.out.println("Вызывается ConcreteStrategic Subtract's execute()");

        return x - y;
    }
}

class ConcreteStrategicMultiply implements Strategy {

    public int execute(int x, int y) {

        System.out.println("Вызывается ConcreteStrategic Multiply's execute()");

        return x * y;
    }
}

class Contextual {

    private Strategy strategic;

    public Contextual() {

    }

    public void setStrategic(Strategy strategic) {

        this.strategic = strategic;
    }

    public int executeStrategic(int x, int y) {

        return strategic.execute(x, y);
    }
}

class StrategicExample {

    public static void main(String[] args) {

        Contextual contextual = new Contextual();

        contextual.setStrategic(new ConcreteStrategicAdd());
        int outcomeA = contextual.executeStrategic(5, 6);
        contextual.setStrategic(new ConcreteStrategicSubtract());
        int outcomeB = contextual.executeStrategic(5, 6);

        contextual.setStrategic(new ConcreteStrategicMultiply());
        int outcomeC = contextual.executeStrategic(5, 6);


        System.out.println("Результат A : " + outcomeA);

        System.out.println("Результат B : " + outcomeB);

        System.out.println("Результат C : " + outcomeC);

    }

}