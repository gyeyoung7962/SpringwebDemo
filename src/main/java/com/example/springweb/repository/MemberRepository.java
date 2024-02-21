package com.example.springweb.repository;

import com.example.springweb.domain.Member;
import java.util.*;


public interface MemberRepository {

    //사용할 기술 설명

    Member save(Member member); //맴버객체를 받아 회원저장

    Optional<Member> findById(Long id);  //아이디를 인자로 받아찾기

    Optional<Member> findByName(String name); //이름으로 찾기

    List<Member> findAll(); //전체 회원 조회


}
