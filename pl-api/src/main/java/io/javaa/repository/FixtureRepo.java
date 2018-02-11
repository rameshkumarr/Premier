package io.javaa.repository;

import org.springframework.data.repository.CrudRepository;

import io.javaa.model.Fixture;

public interface FixtureRepo extends CrudRepository<Fixture , String> {

}
