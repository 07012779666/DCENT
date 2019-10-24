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
public class NewClass2 {

    public static char[] trim(char[] input) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] == ' ' && input[i + 1] != ' ') {
                start = i + i;
                break;
            }
        }
        for (int i = input.length - 1; i > 0; i--) {
            if (input[i] == ' ' && input[i - 1] != ' ') {
                end = i - 1;
                break;
            }
        }
        System.out.println("start =" + start + ";end =" + end);
        int n = end - start;
        char[] result = new char[n];
        return result;
    }

    public static void main(String[] args) {
        char[] input = new char[]{' ', ' ', 'A', 'B', ' ', ' ', ' ', 'C', ' ', ' '};

    }
}
