package net.weg.Store.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.weg.Store.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
