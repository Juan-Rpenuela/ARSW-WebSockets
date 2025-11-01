package co.edu.escuelaing.websocketprimer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class WSStartApp {
   public static void main(String[] args){
       SpringApplication.run(WSStartApp.class, args);
   }
}
