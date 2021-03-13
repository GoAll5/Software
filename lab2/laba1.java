/** 
 * @brief Калькулятор
 * @author Rinat
 * @version 1.0
 * @date Февраль 2021 года
 * Калькулятор рабоатет с двумя переменными и можешь выводить на консоль либо возвращать результат
*/
/*
Fork check1234567
*/

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

import java.util.Scanner;

public class laba1 {
    
    private static class Calc {
        private static double _value1;
        private static  double _value2;
        private static double _result;

        /**
         * Метод для консольного общения с пользователям
         * @param in Scanner для ввода переменных
         */
        public static void Start(Scanner in) throws InterruptedException
        {
            int key;
            do{
                System.out.println("1 - Сумма двух чисел");
                System.out.println("2 - Разность двух чисел");
                System.out.println("3 - Произведение двух чисел");
                System.out.println("4 - Частное двух чисел");
                System.out.println("5 - Показать ответ");
                System.out.println("0 - Выход");
                key = in.nextInt();
                switch (key) {
                    case 1:
                    System.out.println("Введите 1 слагаемое");
                    _value1 = in.nextDouble();
                    System.out.println("Введите 2 слагаемое");
                    _value2 = in.nextDouble();
                    _result = _value1 + _value2;
                    break;

                    case 2:
                    System.out.println("Введите уменьшаемое");
                    _value1 = in.nextDouble();
                    System.out.println("Введите вычитаемое");
                    _value2 = in.nextDouble();
                    _result = _value1 - _value2;
                    break;

                    case 3:
                    System.out.println("Введите 1 множитель");
                    _value1 = in.nextDouble();
                    System.out.println("Введите 2 множитель");
                    _value2 = in.nextDouble();
                    _result = _value1 * _value2;
                    break;

                    case 4:
                    System.out.println("Введите делимое");
                    _value1 = in.nextDouble();
                    System.out.println("Введите делитель");
                    _value2 = in.nextDouble();
                    _result = _value1 / _value2;
                    break;

                    case 5:
                    System.out.println("Ответ: " + _result);
                    TimeUnit.SECONDS.sleep(2);
                    break;

                    case 0:
                    System.out.println("Происходит выход...");
                    TimeUnit.SECONDS.sleep(1);
                    break;

                    default:
                    System.out.println("Введите корректное число(1-5, 0), Ваше число: " + key);

                }
                TimeUnit.MILLISECONDS.sleep(500);
                
            } while(key != 0);
        }

        /**
         * Находит сумму двух чисел
         * @param value1,value2 Складываемые числа
         * @return Сумму двух чисел, переданных в качестве аргументов
         */
        public static double Sum(double value1, double value2){
            _value1 = value1;
            _value2 = value2;
            _result = _value1 + _value2;
            return _result;
        }

        /**
         * Находит разность двух чисел
         * @param value1,value2 из value1 вычитаем value2
         * @return Разность чисел
         */
        public static double Difference(double value1, double value2){
            _value1 = value1;
            _value2 = value2;
            _result = _value1 - _value2;
            return _result;
        }

        /**
         * Находит произведение двух чисел
         * @param value1,value2 Умножаем числа
         * @return Произведение двух чисел, переданных в качестве аргументов
         */
        public static double Multiplication(double value1, double value2){
            _value1 = value1;
            _value2 = value2;
            _result = _value1 * _value2;
            return _result;
        }

        /**
         * Находит разность двух чисел
         * @param value1,value2 value1 делим на value2
         * @return Частное двух чисел
         */
        public static double Segmentation(double value1, double value2){
            _value1 = value1;
            _value2 = value2;
            _result = _value1 / _value2;
            return _result;
        }
            
    }

    public static void main(String[] args) throws InterruptedException 
    {
        Scanner in = new Scanner(System.in);
        Calc.Start(in);
        in.close();
    }


    @Test
    public void testSum(){
        assertEquals(112, Calc.Sum(101, 11));
        assertEquals(31, Calc.Sum(16, 15));
        assertEquals(48, Calc.Sum(36, 12));
    }

    @Test
    public void testDifference(){
        assertEquals(90, Calc.Difference(101, 11));
        assertEquals(1, Calc.Difference(16, 15));
        assertEquals(24, Calc.Difference(36, 12));
        assertEquals(-1, Calc.Difference(36, 37));
    }

    

    @Test
    public void testMultiplication(){
        assertEquals(1111, Calc.Multiplication(101, 11));
        assertEquals(240, Calc.Multiplication(16, 15));
        assertEquals(432, Calc.Multiplication(36, 12));
        assertEquals(-1332, Calc.Multiplication(36, -37));
    }

    @Test
    public void testSegmentation(){
        assertEquals(10, Calc.Segmentation(100, 10));
        assertEquals(2, Calc.Segmentation(30, 15));
        assertEquals(3, Calc.Segmentation(36, 12));
        assertEquals(1.5, Calc.Segmentation(3, 2));
    }
}



