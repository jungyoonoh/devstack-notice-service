package com.example.devstacknoticeservice.model.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @Column(name = "userNo", nullable = false)
    private Long userNo;

    @Column(length = 10, nullable = false)
    private String nickName;
}
