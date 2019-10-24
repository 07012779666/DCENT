/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package earth;

/**
 *
 * @author 肖翔
 */
public class Kicker1 {

    public static class Cat implements Ipet1 {

        @Override
        public void hello() {
            System.out.println("ニヤ");
        }
    }

    public static void main(String... args) {
        Ipet1 cat = new Cat();
        cat.hello();

    }
}
