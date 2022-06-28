package br.com.loja_virtual.DAO;
import javax.persistence.EntityManager;

import br.com.loja_virtual.model.Categoria;

public class CategoriaDAO {
    private EntityManager em;

    public CategoriaDAO(EntityManager em) {
        this.em = em;
    }
    public void cadastrarCategoria(Categoria categoria){
        this.em.persist(categoria);
    }
}
