package com.urban.billingapi.dao;

import javax.transaction.Transactional;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.urban.billingapi.model.user.User;
import com.urban.billingapi.model.vendor.City;

import io.swagger.annotations.Api;

@RepositoryRestResource(path = "users")
@Api(tags = "User Entity")
@Transactional
public interface IUserRepository extends IBillingRepository<User, Long> {
}
