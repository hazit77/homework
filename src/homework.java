import java.util.Scanner;
import java.util.Arrays;

public class homework {
    public static void main(String[] args) {
        //System.out.println("");
        Scanner input = new Scanner(System.in); // Обяввляю Scanner
        System.out.println("Введіть розмір мвсива: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int array[] = new int[size]; // Создаём массив int размером в size
        System.out.println("Введіть елементи масива: ");
    /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        Scanner input1 = new Scanner(System.in);
        System.out.println ("Щоб відсортовати масив введіть 0 або 1 щоб не сортувати");
        int tf = input.nextInt();
        for (int i = 0; i < size; i++) {
            if ( tf <=0) {
                Arrays.sort(array);
                System.out.println(" " + array[i]);  // Выводим на экран відсортований массив
            }
            else{
                System.out.println(" " + array[i]);

            }


        }
        System.out.println();
    }
}
