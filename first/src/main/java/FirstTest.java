public class FirstTest {

    public static void main(String[] args) {
        helloTest();
        helloTest("username");
        System.out.println(helloTest("значение1","значение2"));
    }

    /*демо методов*/
    //1 метод без параметров
    public static void helloTest() {
        System.out.println("We are here! Hello!");
    }

    //2 метод с параметром
    public static void helloTest(String value) {
        System.out.println("We are here! Hello! " + " + "+value);
    }
    //3 метод с возвратом значения
    public static String helloTest(String value1, String value2){
        return "We are here! Hello! " + value1 +" , " + value2;
    }
}

