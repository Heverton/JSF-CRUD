package br.com.thiaguten.jsf.dao;


import br.com.thiaguten.jsf.model.Usuario;
import br.com.thiaguten.persistence.dao.BaseDAO;

import java.util.List;

public interface UsuarioDAO extends BaseDAO<Usuario, Long> {

    List<Usuario> pesquisar(Usuario u);

    Long contarPorEmail(Usuario u);

}
