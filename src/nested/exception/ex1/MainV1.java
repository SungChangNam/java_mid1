package nested.exception.ex1;


import java.util.Scanner;

public class MainV1 {
    public static void main(String[] args) {
        //NetWorkServiceV1_1 networkService = new NetWorkServiceV1_1();
        //NetWorkServiceV1_2 networkService = new NetWorkServiceV1_2();
        NetWorkServiceV1_3 networkService = new NetWorkServiceV1_3();

        Scanner scanner =new Scanner(System.in);
        while (true){
            System.out.print("전송할 문자:");
            String input = scanner.nextLine();
            if (input.equals("exit")){
                break;
            }
            networkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");


    }
}
