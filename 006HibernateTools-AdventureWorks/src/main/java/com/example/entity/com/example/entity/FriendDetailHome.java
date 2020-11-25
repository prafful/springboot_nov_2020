package com.example.entity;
// Generated 24 Nov, 2020 7:51:42 PM by Hibernate Tools 5.4.18.Final

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class FriendDetail.
 * @see com.example.entity.FriendDetail
 * @author Hibernate Tools
 */
public class FriendDetailHome {

	private static final Logger logger = Logger.getLogger(FriendDetailHome.class.getName());

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(FriendDetail transientInstance) {
		logger.log(Level.INFO, "persisting FriendDetail instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			logger.log(Level.INFO, "persist successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "persist failed", re);
			throw re;
		}
	}

	public void attachDirty(FriendDetail instance) {
		logger.log(Level.INFO, "attaching dirty FriendDetail instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			logger.log(Level.INFO, "attach successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "attach failed", re);
			throw re;
		}
	}

	public void attachClean(FriendDetail instance) {
		logger.log(Level.INFO, "attaching clean FriendDetail instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			logger.log(Level.INFO, "attach successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "attach failed", re);
			throw re;
		}
	}

	public void delete(FriendDetail persistentInstance) {
		logger.log(Level.INFO, "deleting FriendDetail instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			logger.log(Level.INFO, "delete successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "delete failed", re);
			throw re;
		}
	}

	public FriendDetail merge(FriendDetail detachedInstance) {
		logger.log(Level.INFO, "merging FriendDetail instance");
		try {
			FriendDetail result = (FriendDetail) sessionFactory.getCurrentSession().merge(detachedInstance);
			logger.log(Level.INFO, "merge successful");
			return result;
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "merge failed", re);
			throw re;
		}
	}

	public FriendDetail findById(java.lang.Integer id) {
		logger.log(Level.INFO, "getting FriendDetail instance with id: " + id);
		try {
			FriendDetail instance = (FriendDetail) sessionFactory.getCurrentSession()
					.get("com.example.entity.FriendDetail", id);
			if (instance == null) {
				logger.log(Level.INFO, "get successful, no instance found");
			} else {
				logger.log(Level.INFO, "get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "get failed", re);
			throw re;
		}
	}

	public List findByExample(FriendDetail instance) {
		logger.log(Level.INFO, "finding FriendDetail instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("com.example.entity.FriendDetail")
					.add(Example.create(instance)).list();
			logger.log(Level.INFO, "find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "find by example failed", re);
			throw re;
		}
	}
}
