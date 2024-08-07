package com.api.cnrr.crudapispring.repository;

import com.api.cnrr.crudapispring.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<UserModel, Long> {

}
