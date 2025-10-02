package exception.ex1;

public class NetworkServiceV1_3 {

    public void sendMessage(String data) {
        NetworkClientV1 client = new NetworkClientV1("http://example.com");
        client.initError(data);

        String connetResult = client.connect();
        if (isError(connetResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드 : " + connetResult);
        } else {
            String sendResult = client.send(data);
            if (isError(sendResult)) {
                System.out.println("[네트워크 오류 발생] 오류 코드 : " + sendResult);
            }
        }
        client.disconnect();
    }

    private static boolean isError(String resultCode) {
        return !resultCode.equals("success");
    }
}
