package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import java.util.List;
import java.util.Optional;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateMemberRepository implements MemberRepository {

  private final JdbcTemplate jdbcTemplate;

  @Autowired gi// 생성자가 1개면 생략해도 된다.
  public JdbcTemplateMemberRepository(DataSource dataSource) {
    this.jdbcTemplate = new JdbcTemplate(dataSource);
  }

  @Override
  public Member save(Member member) {
    return null;
  }

  @Override
  public Optional<Member> findById(Long id) {
    return Optional.empty();
  }

  @Override
  public Optional<Member> findByName(String name) {
    return Optional.empty();
  }

  @Override
  public List<Member> findAll() {
    return null;
  }
}
