import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 5.");
        int value5 = 33;
        changeValue(value5);
        System.out.println(value5);

        System.out.println("Задание 6.");
        Integer value6 = 33;
        changeValue(value6);
        System.out.println(value6);

        System.out.println("Задание 7.");
        Integer[] value7 = {3, 4};
        changeValue7(value7);
        System.out.println(Arrays.toString(value7));

        System.out.println("Задание 8.");
        Integer[] value8 = {3, 4};
        changeValue8(value8);
        System.out.println(Arrays.toString(value8));

        System.out.println("Задание 9.");
        Person person = new Person("Lyapis", "Trubetskoy");
        changePerson(person);
        System.out.println(person);

        System.out.println("Задание 10.");
        changePerson2(person);
        System.out.println(person);

    }

    public static void changeValue(int value) {
        value = 22;
    }

    public static void changeValue(Integer value) {
        value = 22;
    }

    public static void changeValue7(Integer[] value) {
        value = new Integer[]{1, 2};
    }

    public static void changeValue8(Integer[] value) {
        value[0] = 99;
    }

    public static void changePerson(Person person) {
        person = new Person("Ilya", "Lagutenko");
    }

    public static void changePerson2(Person person) {
        person.name = "Ilya";
        person.surname = "Lagutenko";
    }

}