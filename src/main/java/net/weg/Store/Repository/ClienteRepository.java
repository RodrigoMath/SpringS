package net.weg.Store.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.weg.Store.domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
	

}
