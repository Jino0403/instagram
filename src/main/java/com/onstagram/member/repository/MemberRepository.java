package com.onstagram.member.repository;

import com.onstagram.member.entity.MemberEntity;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository {
    public void save(MemberEntity memberEntity);
}