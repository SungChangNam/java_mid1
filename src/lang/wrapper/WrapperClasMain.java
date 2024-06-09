package lang.wrapper;

import java.time.Duration;

public class WrapperClasMain {
    public static void main(String[] args) {
        Integer newInteger =new Integer(10); //미래에 삭제 예정, 대신에 valueOf()를 사용
        Integer interOjb =Integer.valueOf(10);//-128 ~127  자주 사용하는 숫자 값 재사용, 불변
        Long longObj= Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);
        
        System.out.println("doubleObj = " + doubleObj);
        System.out.println("longObj = " + longObj);
        System.out.println("interOjb = " + interOjb);
        System.out.println("newInteger = " + newInteger);


        System.out.println("내부 값 읽기");
        int intValue = interOjb.intValue();
        System.out.println("intvalue = " + intValue);
        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);

        System.out.println("비교");
        System.out.println("==: "+ (newInteger==interOjb));
        System.out.println("==: "+ (newInteger.equals(interOjb)));
    }
}
