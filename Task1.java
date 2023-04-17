// 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i.
// 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа.
// 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
// 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

import java.util.Random;
public class Task1{
    public static void main(String[] args) {
        Random random = new Random();               // 1. задание
        int i = random.nextInt(2000);       //vsc всегда вставляет bound,не знаю почему, в online JAVA IDE все норм
        System.out.println("Случайное число i =  " + i);

        int n = Integer.toBinaryString(i).length()-1;   // 2. задание
        System.out.println("Номер старшего значения бита n =  "+n);
       
              
        short count = 0;                                // 3. задание
        for (int l = i; l < Short.MAX_VALUE; l++){
            if ( l % n == 0) {
                count++;
            }
        }
        System.out.println("mas1 =  "+ count); 
        int[] mas1 = new int [count];
        count = 0;
               
        for (int l = i; l < Short.MAX_VALUE; l++){
            if (l % n == 0) {
                mas1[count++] = l;
                }
        } 

        count = 0;
        
        for (int l = Short.MIN_VALUE; l < i; l++){          // 4. задание
            if ( l % n != 0) {
                count++;
            }
        }
        System.out.println("mas2 =  "+ count); 
        int[] mas2 = new int [count];
        count = 0;
                
        for (int l = Short.MIN_VALUE; l < i; l++){
            if (l % n != 0) {
                mas2[count++] = l;
                }
        }
        
        }
}