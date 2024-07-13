package com.ironhack.associationofnurses.repository;

import com.ironhack.associationofnurses.model.Guest;
import com.ironhack.associationofnurses.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

}


