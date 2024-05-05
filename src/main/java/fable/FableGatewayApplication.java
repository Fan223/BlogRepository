package fable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Gateway startup class
 *
 * @author Fable
 * @since 2024/5/5 9:12
 */
@SpringBootApplication
@EnableDiscoveryClient
public class FableGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(FableGatewayApplication.class, args);
    }
}