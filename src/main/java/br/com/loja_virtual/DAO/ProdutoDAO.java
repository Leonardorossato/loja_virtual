package br.com.loja_virtual.DAO;

import javax.persistence.EntityManager;
import br.com.loja_virtual.model.Produto;

public class ProdutoDAO {
    private EntityManager em;

    public ProdutoDAO(EntityManager em) {
        this.em = em;
    }
    public void cadastrarProduto(Produto produto){
        this.em.persist(produto);
    }
}
