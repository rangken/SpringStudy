package hello;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class, Config2.class);
        //ctx.scan("hello");
        //ctx.refresh();
        String str = ctx.getBean("hello", String.class);
        System.out.println(str);
        String str2 = ctx.getBean("hello2", String.class);
        System.out.println(str2);
        String str3 = ctx.getBean("hello3", String.class);
        System.out.println(str3);
        ctx.close();
        //SpringApplication.run(Application.class, args);
    }
}
