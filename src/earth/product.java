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
public class product {

    public String name;
    public int price;
    public float size;
    public String picture;
}

public class Human {

    public String name;
    protected int age;
    private int monry;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMonry() {
        return monry;
    }

    public void setMonry(int monry) {
        this.monry = monry;
    }

}
