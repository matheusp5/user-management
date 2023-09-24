package br.com.mxtheuz.domain.repositories;

import java.util.List;

public interface IBaseRepository<T, L> {

    List<T> GetAll();
    T GetById(L id);
    T Save(T entity);

}
