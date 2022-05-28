
package com.pruebaSpring.pruebaSpring.controller;


import com.pruebaSpring.pruebaSpring.entity.Usuario;
import com.pruebaSpring.pruebaSpring.service.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioservice;
    
    @GetMapping
    public List<Usuario> listar(){
        return usuarioservice.listar();
    }
    
    @PostMapping
    public Usuario insertar(@RequestBody Usuario usu){
        return usuarioservice.insertar(usu);
    }
    
    @PutMapping
    public Usuario actualizar(@RequestBody Usuario usu){
        return usuarioservice.actualizar(usu);
    }
    
    @DeleteMapping
    public void eliminar (@RequestBody Usuario usu){
        usuarioservice.eliminar(usu);
    }
}
