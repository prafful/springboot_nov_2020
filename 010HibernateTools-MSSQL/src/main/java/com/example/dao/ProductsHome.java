package com.example.dao;
// Generated 25 Nov, 2020 6:58:17 PM by Hibernate Tools 5.2.12.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Products.
 * @see com.example.dao.Products
 * @author Hibernate Tools
 */
@Stateless
public class ProductsHome {

	private static final Log log = LogFactory.getLog(ProductsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Products transientInstance) {
		log.debug("persisting Products instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Products persistentInstance) {
		log.debug("removing Products instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Products merge(Products detachedInstance) {
		log.debug("merging Products instance");
		try {
			Products result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Products findById(int id) {
		log.debug("getting Products instance with id: " + id);
		try {
			Products instance = entityManager.find(Products.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
