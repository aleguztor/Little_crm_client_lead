package com.oportunities.contacts.oportunities.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.oportunities.contacts.oportunities.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

	 
}
