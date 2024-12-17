import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author 31074
 */
@SuppressWarnings("SpringBootApplicationSetup")
@SpringBootApplication
@ComponentScan(basePackages = {"controller"})
public class ApiApplication{

    public static void main(String[]args){
        SpringApplication.run(ApiApplication.class,args);
    }
}