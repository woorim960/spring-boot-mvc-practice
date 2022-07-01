package hello.hellospring;

import hello.hellospring.aop.TimeTraceAop;
import hello.hellospring.repository.JpaMemberRepository;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

//  private DataSource dataSource;
//
//  @Autowired
//  public SpringConfig(DataSource dataSource) {
//    this.dataSource = dataSource;
//  }

//  @PersistenceContext // 없어도 알아서 스프링 부트가 의존성 주입을 해주지만, 적는것이 표준이다.
//  private EntityManager em;
//
//  @Autowired
//  public SpringConfig(EntityManager em) {
//    this.em = em;
//  }

  private final MemberRepository memberRepository;

  @Autowired
  public SpringConfig(MemberRepository memberRepository) {
    this.memberRepository = memberRepository;
  }

  @Bean
  public MemberService memberService() {
    return new MemberService(memberRepository);
  }

// 원래는 아래처럼 등록해주는 것이 좋으나 해당 프로젝트에서는 TimeTraceAop 클래스에 직접 @Component를 달아주었다.
//  @Bean
//  public TimeTraceAop timeTraceAop() {
//    return new TimeTraceAop();
//  }

//  @Bean
//  public MemberRepository memberRepository() {
//    return new MemoryMemberRepository();
//    return new JdbcMemberRepository(dataSource);
//      return new JdbcTemplateMemberRepository(dataSource);
//    return new JpaMemberRepository(em);
//  }
}
