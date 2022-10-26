package me.hibiki.experiment;

/**
 * @author koukoukon
 * @date 2022/10/21 17:51
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("522207300405", "高弘昆", "男", 22);
        System.out.println("该person对象的学号：" + person.personId);
        System.out.println("该person对象的姓名：" + person.personName);
        System.out.println("该person对象的性别：" + person.personGender);
        System.out.println("该person对象的学号：" + person.getPersonAge());

    }
}

class Person {
    public String personId;
    String personName;
    protected String personGender;
    private int personAge;

    public int getPersonAge() {
        return personAge;
    }

    public Person(String personId, String personName, String personGender, int personAge) {
        this.personId = personId;
        this.personName = personName;
        this.personGender = personGender;
        this.personAge = personAge;
    }


}