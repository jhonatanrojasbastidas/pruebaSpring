
package com.pruebaSpring.pruebaSpring.service;

import com.pruebaSpring.pruebaSpring.entity.Usuario;
import com.pruebaSpring.pruebaSpring.repo.UsuarioRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioRepo usuariorepo;
    
    public Usuario insertar(Usuario usu){
        return usuariorepo.save(usu);
    }
    
    public Usuario actualizar(Usuario usu) {
        return usuariorepo.save(usu);
    }
    public List<Usuario> listar (){
        return usuariorepo.findAll();
    }
    public void eliminar(Usuario usu){
        usuariorepo.delete(usu);
    
    }
            
    
}
