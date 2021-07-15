package self.robin.examples.springboot.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * admin:
 * https://codecentric.github.io/spring-boot-admin/2.3.1/#securing-spring-boot-admin
 *
 * security:
 * https://docs.spring.io/spring-security/site/docs/5.3.5.RELEASE/reference/html5/#samples
 *
 * @author mrli
 */
@EnableAdminServer
@SpringBootApplication
public class AdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }

}
