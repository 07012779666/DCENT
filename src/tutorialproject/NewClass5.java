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
public class NewClass5 {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 6, 7, 9, 6, 2, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 7) {
                System.out.println("7のインデックス" + i);
                break;
            }

        }

    }
}
