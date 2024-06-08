package com.mailsender.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.mailsender.entity.Mail;

@Repository
public interface MailRepo extends JpaRepository<Mail,Long>{
	
	@Query("SELECT 'COUNT',COUNT(m) FROM Mail m")
	public String prodReport();

}
