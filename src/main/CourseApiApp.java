package src.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import static src.main.CourseApiApp.pkg;


@EntityScan(basePackages = pkg)
@SpringBootApplication
public class CourseApiApp {

    static final String pkg = "src.main";
    public static void main(String[] args) {
        SpringApplication.run(CourseApiApp.class, args);
    }
}
