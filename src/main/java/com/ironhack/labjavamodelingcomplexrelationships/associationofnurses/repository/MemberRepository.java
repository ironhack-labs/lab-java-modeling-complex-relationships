package com.ironhack.labjavamodelingcomplexrelationships.associationofnurses.repository;

import com.ironhack.labjavamodelingcomplexrelationships.associationofnurses.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {
}
