package com.ironhack.labweek308.repository;

import com.ironhack.labweek308.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Integer> {
}
