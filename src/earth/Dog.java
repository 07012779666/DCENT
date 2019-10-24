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
public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("ワン");

    }
}
