/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 肖翔
 */
public class Human {

    Human(int age, String name, String[] syumiArr) {
        System.out.println("ある");
//        this.age = age;
//        this.name = name;
//        this.syumiArr = syumiArr;
        setAge(age);
        setName(name);
        setSyumiArr(syumiArr);

    }

    private String name;
    private int age;
    private String[] syumiArr;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the syumiArr
     */
    public String[] getSyumiArr() {
        return syumiArr;
    }

    /**
     * @param syumiArr the syumiArr to set
     */
    public void setSyumiArr(String[] syumiArr) {
        this.syumiArr = syumiArr;
    }
}
