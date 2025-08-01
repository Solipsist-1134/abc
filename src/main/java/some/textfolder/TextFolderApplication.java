package some.textfolder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@SpringBootApplication
public class TextFolderApplication {

    public static void main(String[] args) {
        SpringApplication.run(TextFolderApplication.class, args);

        System.out.println(URLEncoder.encode("C:\\Users\\Solipsism\\Desktop\\Новаяпапка", StandardCharsets.UTF_8));

    }

}
