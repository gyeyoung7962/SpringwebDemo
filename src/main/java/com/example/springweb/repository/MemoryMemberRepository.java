package com.example.springweb.repository;

import com.example.springweb.domain.Member;

import java.util.*;

public class MemoryMemberRepository implements  MemberRepository {


    private static Map<Long, Member> store =new HashMap<>(); //임시로 데이터 저장공간
    private static long sequence = 0L;  // 번호부여

    @Override
    public Member save(Member member) {

        //회원번호를 위해 들어올때마다 증가
        member.setId(sequence++);
        store.put(member.getId(), member); //저장공간에 멤버 키값과 맴버값을 저장한다
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {

        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Optional<Member> findByName(String name) {


        //store에 저장된값에 맴버이름이 입력한 이름과 같은결과가 있으면 가져온다
        return store.values().stream().filter(member -> member.getName().equals(name)).findAny();
    }

    @Override
    public List<Member> findAll() {

        //store에 저장된 값을 뽑아낸다
        return new ArrayList<>(store.values());
    }
}
