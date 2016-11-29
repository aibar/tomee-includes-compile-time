import org.apache.tomee.embedded.Configuration;
import org.apache.tomee.embedded.Container;

public class Test {
    public static void main(String[] args) throws Exception {
        try (Container container = new Container(new Configuration()).deployClasspathAsWebApp()) {
            container.await();
        }
    }
}