package com.urban.billingapi.model;

import org.springframework.data.domain.Example;

public interface EntityExample<T> {
    default Example<T> createExample(T entity) {
        return Example.of(entity);
    };
}
