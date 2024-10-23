package com.raymond.lab308.repository;
import com.raymond.lab308.model.AssociationOfNurses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssociationOfNursesRepository extends JpaRepository<AssociationOfNurses, String> {

}