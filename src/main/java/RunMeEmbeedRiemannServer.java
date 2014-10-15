import java.lang.management.ManagementFactory;

/**
 * @author tomerb
 * on 15/10/14.
 */
public class RunMeEmbeedRiemannServer {
    public static void main(String[] args) throws Exception {
        startEmbeededRiemannServer();
        sendExampleEventToRiemann();
    }

    private static void startEmbeededRiemannServer() {
        System.out.println("Starting up embeeded riemann server...");
        riemann.bin.main(new String[]{"riemann.config"});
        System.out.println("Embeeded riemann server started up...");
    }

    private static void sendExampleEventToRiemann() throws Exception {
        System.out.println("Sending example event to riemann...");
        new RiemannClientExample().sendMessage();
        System.out.println("Sent example event to riemann...");
    }
}
