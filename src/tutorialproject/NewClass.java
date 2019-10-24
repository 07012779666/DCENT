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
public class NewClass {

    public static int[] megerArry(int[] left, int[] right) {
        int size = left.length + right.length;
        int[] result = new int[size];
        for (int i = 0; i < left.length; i++) {
            result[i] = left[i];
        }
        for (int i = left.length; i < result.length; i++) {
            result[i] = right[i - left.length];
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
