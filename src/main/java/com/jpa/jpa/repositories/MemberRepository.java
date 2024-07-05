package com.jpa.jpa.repositories;


import com.jpa.jpa.entities.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
