/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Arrays;

/**
 *
 * @author 肖翔
 */
public class OopCls {

    public static void main(String[] args) {
        Human xiao = new Human(3, "natuo", new String[]{"kenka"});

        System.out.println(xiao.getName());
        System.out.println(xiao.getAge());
        System.out.println(Arrays.toString(xiao.getSyumiArr()));
    }
}
