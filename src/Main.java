import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            System.out.println("Input a number, please");

            String s = reader.readLine();
            if (s.isEmpty()) break; //проверка на окончание ввода массива
            int x;
            boolean isCorrectInput = false;

            while (isCorrectInput == false) { //проверка s на int
                try {
                    x = parseInt(s); //пробуем преобразовать строку в число
                    isCorrectInput = true;
                    if (x % 2 == 0)  //проверяем, что остаток от деления на два равен нулю
                        list.add(x);          //добавление в конец
                    else
                        list.add(0, x);      //вставка в начало
                } catch (Exception e) //ошибка "это не число"
                {
                    System.out.println("Your input: \"" + s + "\". It is NOT a number. \nPlease, input a number");
                    s = reader.readLine();
                }
            }

        }
        System.out.println("Result array is:");
        System.out.println(list);
    }
}