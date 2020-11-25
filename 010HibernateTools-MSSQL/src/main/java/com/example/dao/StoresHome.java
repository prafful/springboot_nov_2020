package com.example.dao;
// Generated 25 Nov, 2020 6:58:17 PM by Hibernate Tools 5.2.12.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Stores.
 * @see com.example.dao.Stores
 * @author Hibernate Tools
 */
@Stateless
public class StoresHome {

	private static final Log log = LogFactory.getLog(StoresHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Stores transientInstance) {
		log.debug("persisting Stores instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Stores persistentInstance) {
		log.debug("removing Stores instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Stores merge(Stores detachedInstance) {
		log.debug("merging Stores instance");
		try {
			Stores result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Stores findById(int id) {
		log.debug("getting Stores instance with id: " + id);
		try {
			Stores instance = entityManager.find(Stores.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
