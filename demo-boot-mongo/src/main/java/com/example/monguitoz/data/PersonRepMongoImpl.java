package com.example.monguitoz.data;

import java.math.BigInteger;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("mongodb")
public class PersonRepMongoImpl implements PersonRep {

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(BigInteger arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Person arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Iterable<? extends Person> arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		System.out.println("mongo rep person delete all has been invoked");

	}

	@Override
	public boolean exists(BigInteger arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Person> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Person> findAll(Iterable<BigInteger> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Person> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person findOne(BigInteger id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person save(Person person) {
		// TODO Auto-generated method stub
		return null;
	}

}
