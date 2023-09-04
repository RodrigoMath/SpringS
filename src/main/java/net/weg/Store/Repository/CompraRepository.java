package net.weg.Store.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.weg.Store.domain.Compra;

@Repository
public interface CompraRepository extends JpaRepository<Compra, Long>{

}
