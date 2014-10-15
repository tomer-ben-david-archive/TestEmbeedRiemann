import java.lang.management.ManagementFactory;

/**
 * @author tomerb
 * on 15/10/14.
 */
public class RunMeEmbeedRiemannMain {
    public static void main(String[] args) throws Exception {
        riemann.bin.main(new String[]{"riemann.config"});
    }
}
