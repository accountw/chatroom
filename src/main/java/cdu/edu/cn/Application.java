package cdu.edu.cn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@MapperScan("cdu.edu.cn.repository")
@EntityScan("cdu.edu.cn.entity")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }





}