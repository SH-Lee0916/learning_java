package hello.core;

// import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

// import hello.core.member.MemberRepository;
// import hello.core.member.MemoryMemberRepository;

@Configuration
@ComponentScan( // To preserve example code, added exclude filter.
    // basePackages = "hello.core.member", // component scan package 지정 // default -> @ComponentScan이 붙은 설정 정보 클래스의 위치
    basePackageClasses = AutoAppConfig.class,
    excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class) // @Configuration annotation 제외
)
public class AutoAppConfig {
    
    // overiding -> 수동이 우선, 자동 등록 overide
    // @Bean
    // MemberRepository memberRepository() {
    //     return new MemoryMemberRepository();
    // }
}