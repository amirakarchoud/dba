import javax.xml.ws.Endpoint;

public class Application {
    public static void main(String[] args) {
        System.out.println("debut de deploiement de service");
        String url ="http://localhost:8888/";
        Endpoint.publish(url,new MonServiceWeb());
        System.out.println("fin de deploiement de service");

    }
}
