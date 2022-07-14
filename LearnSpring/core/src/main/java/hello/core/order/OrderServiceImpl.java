package hello.core.order;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import hello.core.discount.DiscountPolicy;
// import hello.core.disount.FixDiscountPolicy;
// import hello.core.disount.RateDiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
// import hello.core.member.MemoryMemberRepository;
// import lombok.RequiredArgsConstructor;

@Component
// @RequiredArgsConstructor // final 붙은 args 들 생성자 생성 line 24 ~ 27
public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository;
    // private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
    // private final DiscountPolicy discountPolicy = new RateDiscountPolicy();
    private final DiscountPolicy discountPolicy;

    // @Autowired // 생성자가 한 개일 때 생략가능
    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy rateDiscountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = rateDiscountPolicy;
    }


    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
    
    //For testing
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }

}
