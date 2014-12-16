package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Autowired
    // test 가 config2 에 test() 에 의해 autowired 됨
    private String test;

    @Bean
    public String hello(){
        return "hello " + test;
    }

    @Bean
    public String hello2(){
        return "hello " + test2;
    }

    @Bean
    public String hello3(){
        return "hello " + test3;
    }

    private String test2;
    @Autowired
    public void setTest2(String test2){
        this.test2 = test2;
    }

    private String test3;
    @Autowired
    public void setTest3(@Qualifier("test3") String test3){
        this.test3 = test3;
    }

    @Bean
    public TestFactoryBean testFactoryBean(){
        TestFactoryBean testFactoryBean = new TestFactoryBean();
        testFactoryBean.setName("jaeyoung");
        return testFactoryBean;

    }
}
