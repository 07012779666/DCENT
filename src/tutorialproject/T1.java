/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialproject;

/**
 *
 * @author 肖翔
 */
public class T1 {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4};
        int y = mini(array);
        int i = max(array);
        int a = sum(array);
        System.out.println(y);
        System.out.println(i);
        System.out.println(a);
    }

    public static int mini(int[] array) {
        int mini = 1;
        for (int b = 0; b < array.length; b++) {
            if (array[b] < mini) {
                mini = array[b];
            }
        }
        return mini;
    }

    public static int max(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;

    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; ++i) {
            sum = sum + array[i];
        }

        return sum;
    }

}
