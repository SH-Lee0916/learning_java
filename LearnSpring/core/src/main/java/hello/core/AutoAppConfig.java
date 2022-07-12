package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan( // To preserve example code, added exclude filter.
    // basePackages = "hello.core.member", // component scan package 지정 // default -> @ComponentScan이 붙은 설정 정보 클래스의 위치
    basePackageClasses = AutoAppConfig.class,
    excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class) // @Configuration annotation 제외
)
public class AutoAppConfig {
    
}