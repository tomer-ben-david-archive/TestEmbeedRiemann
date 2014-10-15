import com.aphyr.riemann.client.RiemannClient;

import java.util.Random;

/**
 * @author tomerb
 * on 15/10/14.
 */
public class RiemannClientExample {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 1000; i++) {
            new RiemannClientExample().sendMessage();
            Thread.sleep(100);
        }
    }

    public void sendMessage() throws Exception {
        RiemannClient c = RiemannClient.tcp("localhost", 5555);
        c.connect();
        c.event().
                service("fridge").
                state("running").
                metric(new Random().nextDouble()).
                tags("appliance", "cold").
                send();

        c.query("tagged \"cold\" and metric > 0"); // => List<Event>;
        c.disconnect();
    }
}
