package org.example.be17pickcook.common;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Getter
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass // 부모클래스의 변수가 JPA로 동작할 수 있게 해주는 어노테이션
public class BaseEntity {

    @CreatedDate        // 특정 이벤트가 발생했을 때 동작하는 어노테이션
    private Date createdAt;
    @LastModifiedDate
    private Date updatedAt;

}
