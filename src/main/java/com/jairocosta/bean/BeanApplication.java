package com.jairocosta.bean;

//import com.jairocosta.config.AppConfig;
import com.jairocosta.model.HelloBean;
import com.jairocosta.model.HelloName;
import com.jairocosta.model.HelloTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class BeanApplication {

    public static void main(String[] args) {
        //SpringApplication.run(BeanApplication.class, args);
        //ApplicationContext cntx = new AnnotationConfigApplicationContext(AppConfig.class);
        ApplicationContext cntx = new ClassPathXmlApplicationContext("Beans.xml");
        HelloBean helloBean = (HelloBean) cntx.getBean("HelloBean");
        HelloTime helloTime = (HelloTime) cntx.getBean("HelloTime");
        HelloName helloName = (HelloName) cntx.getBean("HelloName");
        helloBean.setMsg("Beans are cool!!");
        helloBean.printHelloBean();
        helloTime.getTime();
        helloName.getName();
    }
}
