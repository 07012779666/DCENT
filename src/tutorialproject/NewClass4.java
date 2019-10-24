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
public class NewClass4 {

    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 0; i < 101; i++) {
//            if (i % 2 == 0) {
//                sum = sum + i;
//            }
//        }
//        System.out.println("sum" + sum);
//    }
//        int a = 5;
//        for (int b = 4; b >= 1; b--) {
//            a = a * b;
//        }
//        System.out.println(a);
        int[] array = new int[]{1, 2, 6, 7, 9, 6, 2, 1};
        int x = max(array);
        int y = mini(array);
        int a = sum(array);
        System.out.println(x);
        System.out.println(y);
        System.out.println(a);

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

    public static int mini(int[] array) {
        int mini = 1;
        for (int b = 0; b < array.length; b++) {
            if (array[b] < mini) {
                mini = array[b];
            }
        }
        return mini;

    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int z = 0; z < array.length; z++) {
            sum += array[z];
        }
        return sum / array.length;

    }
}
