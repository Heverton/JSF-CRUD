package br.com.thiaguten.jsf.service;

import br.com.thiaguten.jsf.model.Usuario;

import java.util.List;

public interface UsuarioService {

    boolean emailJaExiste(Usuario usuario);

    boolean salvarOuAtualizar(Usuario usuario);

    void deletar(Long id);

    Usuario recuperar(Long id);

    List<Usuario> pesquisar(Usuario usuario);

    List<Usuario> listar();

}
