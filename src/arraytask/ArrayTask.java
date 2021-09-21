/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraytask;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author user
 */
public class ArrayTask {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [] array = new int [20];
        
        Random random = new Random();
        
        for (int i = 0; i < 20; i++) {
            int checkFor2 = random.nextInt();
            if (checkFor2 % 2 != 0) {
                checkFor2 = checkFor2 - 1;
            }
            array[i] = checkFor2;
//            System.out.println(array[i]);
        }
        
        Arrays.sort(array);
        
        int average = 0;
        
        for (int i = 1; i < 20; i++) {
            average += array[i];
        }
        
        average = average / 18;
        System.out.println("Массив: "+Arrays.toString(array));
        System.out.println("Среднее арифметическое: "+average);
        
        
    }
    
}
