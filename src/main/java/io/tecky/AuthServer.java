package io.tecky;

//Embedded Keycloak Server References:
//https://www.baeldung.com/sso-spring-security-oauth2
//https://www.baeldung.com/keycloak-embedded-in-spring-boot-app
//https://www.baeldung.com/spring-boot-keycloak
//https://github.com/suchorski/springboot-keycloak-server

//https://keycloakthemes.com/blog/how-to-setup-sign-in-with-google-using-keycloak
//https://ultimatesecurity.pro/post/2fa/

//https://stackoverflow.com/questions/33323837/database-application-yml-for-spring-boot-from-applications-properties
//https://github.com/suchorski/springboot-keycloak-server
//https://github.com/europeana/keycloak-server
//https://github.com/thomasdarimont/embedded-spring-boot-keycloak-server
//https://github.com/shinyay/spring-keycloak-authz-server

import io.tecky.server.keycloak.ServerProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
@SpringBootApplication(exclude = LiquibaseAutoConfiguration.class)
@EnableConfigurationProperties(ServerProperties.class)
public class AuthServer {
    public static void main(String[] args){
        SpringApplication.run(AuthServer.class,args);
    }

}
