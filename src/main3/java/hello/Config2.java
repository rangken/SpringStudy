package hello;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config2 {

    @Bean
    public String test() {
        return "jaeyoung";
    }
    @Bean
    public String test2(){
        return "jaeyoung2";
    }

    @Bean
    @Qualifier("test3")
    public String test3_qualifier() {
        return "jaeyoung3";
    }
}
