package com.huseyin.repository;

import com.huseyin.model.Result;
import com.huseyin.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface ResultRepo extends JpaRepository<Result, Long> {
    Result findByEmail(String email);
}
