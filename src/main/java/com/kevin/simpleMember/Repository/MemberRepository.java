package com.kevin.simpleMember.Repository;

        import com.kevin.simpleMember.Domain.Member;
        import org.springframework.data.jpa.repository.JpaRepository;

        import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByusername(String username);
}
