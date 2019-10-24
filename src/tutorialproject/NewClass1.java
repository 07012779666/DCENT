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
public class NewClass1 {

    public static int[] subArray(int[] array, int start, int length) {
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = array[i + start];
        }

        return result;
    }

}
