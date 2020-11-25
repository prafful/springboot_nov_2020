package com.example.dao;
// Generated 25 Nov, 2020 6:58:17 PM by Hibernate Tools 5.2.12.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Categories.
 * @see com.example.dao.Categories
 * @author Hibernate Tools
 */
@Stateless
public class CategoriesHome {

	private static final Log log = LogFactory.getLog(CategoriesHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Categories transientInstance) {
		log.debug("persisting Categories instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Categories persistentInstance) {
		log.debug("removing Categories instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Categories merge(Categories detachedInstance) {
		log.debug("merging Categories instance");
		try {
			Categories result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Categories findById(int id) {
		log.debug("getting Categories instance with id: " + id);
		try {
			Categories instance = entityManager.find(Categories.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
