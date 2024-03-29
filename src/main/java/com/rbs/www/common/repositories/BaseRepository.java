package com.rbs.www.common.repositories;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public abstract class BaseRepository<T extends Object> {
    @Autowired
    @Qualifier(value = "sessionFactory")
    private SessionFactory sessionFactory;

    private Class<T> modelClass;

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    protected Criteria getCriteria() {
        return getSession().createCriteria(getModelClass());
    }

    @SuppressWarnings("unchecked")
    private Class<T> getModelClass() {
        if (modelClass == null) {
            ParameterizedType thisType = (ParameterizedType) getClass().getGenericSuperclass();
            this.modelClass = (Class<T>) thisType.getActualTypeArguments()[0];
        }
        return modelClass;
    }

    private String getDomainClassName() {
        return getModelClass().getName();
    }

    public void create(T t) {
        getSession().save(t);
    }

    @SuppressWarnings("unchecked")
    public T get(Serializable id) {
        return (T) getSession().get(getModelClass(), id);
    }

    @SuppressWarnings("unchecked")
    public T load(Serializable id) {
        return (T) getSession().load(getModelClass(), id);
    }

    @SuppressWarnings("unchecked")
    public List<T> getAllActiveForms() {
        return getSession()
                .createQuery("from " + getDomainClassName() + " E where E.createdBy is not null and E.company.isActive is true")
                .list();
    }

    @SuppressWarnings("unchecked")
    public List<T> getAll() {
        return getSession()
                .createQuery("from " + getDomainClassName())
                .list();
    }

    public void update(T t) {
        getSession().update(t);
    }

    public void delete(T t) {
        getSession().delete(t);
    }

    public void deleteById(Serializable id) {
        delete(load(id));
    }

    public void deleteAll() {
        getSession()
                .createQuery("delete " + getDomainClassName())
                .executeUpdate();
    }

    public long count() {
        return (Long) getSession()
                .createQuery("select count(*) from " + getDomainClassName())
                .uniqueResult();
    }

    public boolean exists(Serializable id) {
        return (get(id) != null);
    }
}
