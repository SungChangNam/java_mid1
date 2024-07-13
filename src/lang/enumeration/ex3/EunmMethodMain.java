package lang.enumeration.ex3;


import java.util.Arrays;

public class EunmMethodMain {
    public static void main(String[] args) {
        Grade[] values= Grade.values();
        System.out.println("Arrays.toString(values) = " + Arrays.toString(values));
        for (Grade value : values) {
            System.out.println("name= " +value.name()+ "ordinal=" +value.ordinal());
        }

        //String ->Enum 변환, 잘못된  문자면 IllegalArgumentException 발생
        String input ="GOLD";
        Grade gold =Grade.valueOf(input);
        System.out.println("gold ="+gold);  // toString() 오버라이딩 기능
    }
}