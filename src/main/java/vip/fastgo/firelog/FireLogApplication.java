package vip.fastgo.firelog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "vip.fastgo.firelog.mapper")
@SpringBootApplication
public class FireLogApplication {
    public static void main(String[] args) {
        SpringApplication.run(FireLogApplication.class, args);
    }
}
