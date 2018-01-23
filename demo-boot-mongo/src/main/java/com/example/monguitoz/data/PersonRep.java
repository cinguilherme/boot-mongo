package com.example.monguitoz.data;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;

public interface PersonRep extends CrudRepository<Person, BigInteger> {

	Person findOne(BigInteger id);

}
