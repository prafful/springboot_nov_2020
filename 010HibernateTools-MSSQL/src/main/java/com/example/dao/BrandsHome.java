package com.example.dao;
// Generated 25 Nov, 2020 6:58:17 PM by Hibernate Tools 5.2.12.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Brands.
 * @see com.example.dao.Brands
 * @author Hibernate Tools
 */
@Stateless
public class BrandsHome {

	private static final Log log = LogFactory.getLog(BrandsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Brands transientInstance) {
		log.debug("persisting Brands instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Brands persistentInstance) {
		log.debug("removing Brands instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Brands merge(Brands detachedInstance) {
		log.debug("merging Brands instance");
		try {
			Brands result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Brands findById(int id) {
		log.debug("getting Brands instance with id: " + id);
		try {
			Brands instance = entityManager.find(Brands.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
