package com.example.springgraphql.domain.member;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class MemberMutationResolver implements GraphQLMutationResolver {

    private final MemberRepository memberRepository;

    public MemberMutationResolver(
        MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Member createMember(SaveMember saveMember){
        return memberRepository.save(SaveMember.toEntity(saveMember));
    }

}
