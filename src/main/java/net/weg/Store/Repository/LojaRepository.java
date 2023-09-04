package net.weg.Store.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.weg.Store.domain.Loja;

@Repository
public interface LojaRepository extends JpaRepository<Loja, Long>{

}
