package cn.ecomb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class StatelessLoginDemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(StatelessLoginDemoApplication.class, args);
  }

}
