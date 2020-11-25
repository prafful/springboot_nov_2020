package com.example.dao;
// Generated 25 Nov, 2020 6:58:17 PM by Hibernate Tools 5.2.12.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class OrderItems.
 * @see com.example.dao.OrderItems
 * @author Hibernate Tools
 */
@Stateless
public class OrderItemsHome {

	private static final Log log = LogFactory.getLog(OrderItemsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(OrderItems transientInstance) {
		log.debug("persisting OrderItems instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(OrderItems persistentInstance) {
		log.debug("removing OrderItems instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public OrderItems merge(OrderItems detachedInstance) {
		log.debug("merging OrderItems instance");
		try {
			OrderItems result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public OrderItems findById(OrderItemsId id) {
		log.debug("getting OrderItems instance with id: " + id);
		try {
			OrderItems instance = entityManager.find(OrderItems.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
