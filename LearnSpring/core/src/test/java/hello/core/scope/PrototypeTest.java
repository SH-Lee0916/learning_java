package hello.core.scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;

public class PrototypeTest {
    @Test
    void prototypeBeanFind() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(PrototypeBean.class);

        System.out.println("bean1");
        PrototypeBean prototypeBean1 = ac.getBean(PrototypeBean.class);
        System.out.println("bean2");
        PrototypeBean prototypeBean2 = ac.getBean(PrototypeBean.class);        

        System.out.println("prototypeBean1: " + prototypeBean1);
        System.out.println("prototypeBean2: " + prototypeBean2);
        Assertions.assertThat(prototypeBean1).isNotSameAs(prototypeBean2);

        // 직접 호출 필요
        prototypeBean1.destroy();
        prototypeBean2.destroy();

        ac.close();
    }

    @Scope("prototype")
    static class PrototypeBean {
        @PostConstruct
        public void init() {
            System.out.println("SingletonTest.SingletonBean.init()");
        }

        @PreDestroy
        public void destroy() {
            System.out.println("SingletonTest.SingletonBean.destroy()");
        }
    }
}
