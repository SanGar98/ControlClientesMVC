package co.com.udemy.dao;

import co.com.udemy.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author SantiagoPC
 */
@Repository
public interface iPersonaDao extends JpaRepository<Persona, Long>{
    
}
