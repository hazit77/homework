import java.util.Scanner;
import java.util.Arrays;
/*
виконав Житомірський Андрій

Консольное приложение:
- ввод размера массива int
- ввод элементов массива
- меню с возможными операциями над ним:
- поиск чила по значению
- сортировка

*/


public class homework {
    public static void main(String[] args) {
        //System.out.println("");
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть розмір мвсива: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Введіть елементи масива: ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        Scanner input1 = new Scanner(System.in);
        System.out.println ("Щоб відсортовати масив введіть 0 або 1 щоб не сортувати");
        int tf = input.nextInt();
        for (int i = 0; i < size; i++) {
            if ( tf <=0) {
                Arrays.sort(array);
                System.out.println(" " + array[i]);
            }
            else{
                System.out.println(" " + array[i]);

            }
        }
        Scanner input2 = new Scanner(System.in);
        System.out.println("Ввдіть порядковий № елемента масива, щоб вивезти його на екран або введіть відємне число, для завершення програми ");
        int pn = input.nextInt();
        for (int i = 0; i < size; i++){
            if (pn >= 0 ){                      // не знаю як виводити елемент масиву за номером, скажіт що треба почитати
            System.out.println(" " + array[i]);

            }
            else {
                System.out.println("Кінець!");
            }
        }
        System.out.println();
    }
}
