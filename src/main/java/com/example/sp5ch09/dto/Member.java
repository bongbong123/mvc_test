package com.example.sp5ch09.dto;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@Setter
@Entity
@Table(name = "member")
@NoArgsConstructor
@AllArgsConstructor
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seq;

    private String mb_id;
    private String mb_pw;

//    @Builder
//    public Member(Long seq, String my_id, String my_pw){
//        this.seq = seq;
//        this.my_id = my_id;
//        this.my_pw = my_pw;
//    }
}