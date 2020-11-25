package com.example.dao;
// Generated 25 Nov, 2020 6:58:17 PM by Hibernate Tools 5.2.12.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Staffs.
 * @see com.example.dao.Staffs
 * @author Hibernate Tools
 */
@Stateless
public class StaffsHome {

	private static final Log log = LogFactory.getLog(StaffsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Staffs transientInstance) {
		log.debug("persisting Staffs instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Staffs persistentInstance) {
		log.debug("removing Staffs instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Staffs merge(Staffs detachedInstance) {
		log.debug("merging Staffs instance");
		try {
			Staffs result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Staffs findById(int id) {
		log.debug("getting Staffs instance with id: " + id);
		try {
			Staffs instance = entityManager.find(Staffs.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
