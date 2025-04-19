package com.greetingApp.greetingApp.repository;

import com.greetingApp.greetingApp.Entity.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends JpaRepository<Greeting , Long> {

}
