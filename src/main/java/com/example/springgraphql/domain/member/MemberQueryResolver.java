package com.example.springgraphql.domain.member;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional(readOnly = true)
public class MemberQueryResolver implements GraphQLQueryResolver {

    private final MemberRepository memberRepository;

    public MemberQueryResolver(
        MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Member getMemberById(Long id){
        return memberRepository.findById(id).orElse(null);
    }
}
