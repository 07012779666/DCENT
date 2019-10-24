/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author 肖翔
 */
public class Kicker {

//    public static void print(Parent v) {
//        v.hello();
//    }
//
//    public static void main(String... args) {
//        print(new Parent());
//        print(new Child());
//
//    }
    public static class InnerClassA {

        public String name;

        public InnerClassA(String name) {
            this.name = name;
        }
    }

    public static class InnerClassB {

        public String name;

        public InnerClassB(String name) {
            this.name = name;
        }

        public String toString() {
            return "クラス名称=" + name;
        }

    }

    public static void main(String... args) {
        System.out.println(new InnerClassA("innerClassA"));
        System.out.println(new InnerClassB("innerClassB"));
    }
}
