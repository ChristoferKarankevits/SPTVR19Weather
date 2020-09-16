/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19weatherinyear;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author user
 */
class App {
    public void run(){
        System.out.println("----Projct Weather----");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int min = -50;
        int max = 50;
        //Создаём зубчатый массив
        int[][] tInYear = new int[12][];
        for (int i = 0; i < 12; i++) {
            //Инициируем количество дней, максимум и минимум температуры в месяце
            switch (i) {
                case 0: min = -25; max= -5; n = 31; break;
                case 1: min = -25; max= 5; n = 28; break;
                case 2: min = -15; max= 10; n = 31; break;
                case 3: min = -5; max= 15; n = 30; break;
                case 4: min = 0; max= 20; n = 31; break;
                case 5: min = 10; max= 25; n = 30; break;
                case 6: min = 15; max= 30; n = 31; break;
                case 7: min = 10; max= 25; n = 31; break;
                case 8: min = 5; max= 15; n = 30; break;
                case 9: min = 0; max= 10; n = 31; break;
                case 10: min = -5; max= -5; n = 30; break;
                case 11: min = -25; max= 0; n = 31; break;
                
            }
            //Создаём массив с колличесивом дней в 1-ом месяце
            tInYear[i] = new int[n];
            for (int j = 0; j < tInYear[i].length; j++) {
                //Заполняем массив месяца диапозонм температур
                tInYear[i][j] = random.nextInt(max-min+1)+min;
                //Выводим на консоль значения температур в 1-ом месяце
                System.out.printf("%4d", tInYear[i][j]);
            }
            //переходим на новую строчку (новый месяц)
            System.out.println("");
            
            
        }System.out.println("ВВедите месяц: ");
            int month = scanner.nextInt();
            System.out.println("Введите день: ");
            int day = scanner.nextInt();
            System.out.println("В этот день была температура: "+tInYear[month-1][day-1]);
    }
}
