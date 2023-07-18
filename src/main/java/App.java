import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());

        Cat cat1 = applicationContext.getBean("catBean",Cat.class);
        Cat cat2 = applicationContext.getBean("catBean",Cat.class);
        System.out.println("Сравнение Объектов HelloWorld: "+ (bean1==bean2)+"\n"+bean1+"\n" +bean2);
        System.out.println("Сравнение Объектов Cat: "+ (cat1==cat2)+"\n"+cat1+"\n" +cat2);



    }
}