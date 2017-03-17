package com.techprimers.elastic.jparepository;

import com.techprimers.elastic.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<Users, Long> {
}
