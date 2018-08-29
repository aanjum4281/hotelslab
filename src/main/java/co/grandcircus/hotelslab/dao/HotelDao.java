package co.grandcircus.hotelslab.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.grandcircus.hotelslab.entity.Hotel;


@Repository
@Transactional
public class HotelDao {

	@PersistenceContext
	private EntityManager em;
	
	public List<Hotel> findAll() {
		return em.createQuery("from Hotel", Hotel.class).getResultList();
	}
	
	public Hotel findById(Long id) {
		return em.find(Hotel.class, id);
	}
	public List<Hotel> findByName(String name) {
		// TODO Auto-generated method stub
		return em.createQuery("from Hotel where name like :n", Hotel.class)
				.setParameter("n" , "%" + name + "%")
				.getResultList();
	}
	
	public List<Hotel> findbyCity(String city) {
		return em.createQuery("from Hotel where city like :c", Hotel.class)
				.setParameter("c", "%" + city + "%")
				.getResultList();
	}
}
