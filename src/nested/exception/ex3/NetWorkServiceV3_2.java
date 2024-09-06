package nested.exception.ex3;


import nested.exception.ex3.exception.ConnectExceptionV3;
import nested.exception.ex3.exception.NetworkClientExceptionV3;

public class NetWorkServiceV3_2 {
    public void sendMessage(String data)  {
        String address ="http://example.com";
        NetWorkClientV3 client = new NetWorkClientV3(address);
        client.initError(data);// 추가

        try {
            client.connect();
            client.send(data);
        } catch (ConnectExceptionV3 e) {
            System.out.println("[연결 오류] 주소: "+e.getAddress()+", 메시지: "+ e.getMessage());
        }catch (NetworkClientExceptionV3 e){
            System.out.println("[네트워크 오류] 메시지: "+e.getMessage());
        }catch (Exception e){
            System.out.println("[알 수 없는 오류] 메시지:" +e.getMessage());
        } finally {
            client.disconnect();
        }

        
    }
}