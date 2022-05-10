package com.example.springgraphql.domain.member;

import lombok.Getter;

@Getter
public class SaveMember {
    private String name;
    private Integer age;

    public static Member toEntity(SaveMember saveMember){
        return new Member(
            saveMember.getName(),
            saveMember.getAge()
        );
    }
}
