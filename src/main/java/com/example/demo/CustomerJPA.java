package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository("customerJPA")
public interface CustomerJPA extends JpaRepository<CustomerEntity, Long>{
	@Query("select w from CustomerEntity w")
	public List<CustomerEntity> getCustomersByQuery(@Param("query") String query);
}
