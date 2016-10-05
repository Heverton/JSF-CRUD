package br.com.thiaguten.jsf.controller;

import br.com.thiaguten.jsf.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.faces.bean.ManagedBean;
import java.text.SimpleDateFormat;
import java.util.Date;

@ManagedBean
public class OlaMundoBean {

    private final UsuarioService usuarioService;

    @Autowired
    public OlaMundoBean(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    public String getHorario() {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        return "Atualizado em " + sdf.format(new Date());
    }
}