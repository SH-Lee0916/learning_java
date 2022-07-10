package hello.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// import hello.core.disount.FixDiscountPolicy;
import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
// import hello.core.member.MemberServiceImpl;
// import hello.core.member.MemoryMemberRepository;
import hello.core.order.Order;
import hello.core.order.OrderService;
// import hello.core.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        // MemberService memberService = new MemberServiceImpl(new MemoryMemberRepository());
        // OrderService orderService = new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
        // AppConfig appConfig = new AppConfig();
        // MemberService memberService = appConfig.memberService();
        // OrderService orderService = appConfig.OrderService();

        // Spring container
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);
        OrderService orderService = applicationContext.getBean("OrderService", OrderService.class);

        Long memberId = 1L;
        Member member = new Member(memberId, "member1", Grade.VIP);

        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemName", 10000);
        System.out.println(order.toString());
        // System.out.println(order.calculatePrice()); // 9000
    }
}
