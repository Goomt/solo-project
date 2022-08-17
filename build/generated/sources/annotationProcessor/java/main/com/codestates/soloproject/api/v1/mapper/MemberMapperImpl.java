package com.codestates.soloproject.api.v1.mapper;

import com.codestates.soloproject.api.v1.dto.MemberDto;
import com.codestates.soloproject.api.v1.entity.Member;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-17T14:45:18+0900",
    comments = "version: 1.5.1.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.jar, environment: Java 11.0.15 (Eclipse Adoptium)"
)
@Component
public class MemberMapperImpl implements MemberMapper {

    @Override
    public Member memberPostToMember(MemberDto.post requestbody) {
        if ( requestbody == null ) {
            return null;
        }

        Member member = new Member();

        return member;
    }

    @Override
    public Member memberPatchToMember(MemberDto.patch requestbody) {
        if ( requestbody == null ) {
            return null;
        }

        Member member = new Member();

        return member;
    }
}
