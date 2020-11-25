package com.example.dao;
// Generated 25 Nov, 2020 6:58:17 PM by Hibernate Tools 5.2.12.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Customers.
 * @see com.example.dao.Customers
 * @author Hibernate Tools
 */
@Stateless
public class CustomersHome {

	private static final Log log = LogFactory.getLog(CustomersHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Customers transientInstance) {
		log.debug("persisting Customers instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Customers persistentInstance) {
		log.debug("removing Customers instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Customers merge(Customers detachedInstance) {
		log.debug("merging Customers instance");
		try {
			Customers result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Customers findById(int id) {
		log.debug("getting Customers instance with id: " + id);
		try {
			Customers instance = entityManager.find(Customers.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
