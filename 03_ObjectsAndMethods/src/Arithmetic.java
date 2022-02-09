import java.lang.Math;

public class Arithmetic {
    int number1;
    int number2;

    public Arithmetic(int x, int y) {
        number1 = x;
        number2 = y;
        System.out.println("Сумма равна: " + summa());
        System.out.println("Разность равна: " + difference());
        System.out.println("Произведение равно: " + productOfNumbers());
        System.out.println("Среднее значение чисел равно: " + averageOfNumbers());
        System.out.println("Максимальное из двух чисел: " + maxOfNumbers());
        System.out.println("Минимальное из двух чисел: " + minOfNumbers());
    }


    int summa() {     // метода расчета суммы двух чисел
        return number1 +number2;
    }
    int difference() {     // метода расчета разности двух чисел
        return number1 - number2;
    }
    int productOfNumbers() {     // метода расчета произведение двух чисел
        return number1 * number2;
    }
    int averageOfNumbers() {     // метода среднего значения двух чисел
        return (number1 + number2)/2;
    }

    int maxOfNumbers()  {     // метод определения из двух чисел максимального
        return Math.max(number1, number2);
    }

    int minOfNumbers()  {     // метод определения из двух чисел минимального
        return (Math.min(number1, number2));

    }

}