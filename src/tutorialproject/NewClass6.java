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
public class NewClass6 {

    public static void main(String... args) {
        int[] array = new int[]{1, 2, 6, 7, 9, 6, 2, 1};
    }

    public static void xx(int[] array) {
        int a = 0;
        for (int b = 0; b < array.length; b++) {
            for (int j = 0; j < array.length; j++) {
                if (array[b] == array[j] && b != j) {
                    System.out.println();
                }
            }

        }

    }
}
