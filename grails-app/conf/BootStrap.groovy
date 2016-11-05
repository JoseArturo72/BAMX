
import dominios.Recursos
import dominios.Rol
import dominios.Usuario
import dominios.UsuarioRol



class BootStrap {

    def init = { servletContext ->
        
         def rolAdmin
        rolAdmin=Rol.findByAuthority("ROLE_ADMIN")
        if(rolAdmin.is(null)){
            rolAdmin = new Rol(authority:"ROLE_ADMIN").save(flush:true, failOnError:true)
        }
      
        def usuarioAdmin
        usuarioAdmin=Usuario.findByUsername("user")
        if(usuarioAdmin.is(null)){
            usuarioAdmin = new Usuario(username:"user", password:"pass").save(flush:true, failOnError:true)      
            UsuarioRol.create usuarioAdmin, rolAdmin, true
        }
        
     
        for(String url in ['/','/**/js/**/', '/**/partials/**/', '/dbconsole/**', '/index', '/index.gsp', '/**/favicon.ico','/assets/**', '/**/css/**', '/**/images/**/', '/**/fonts/**', '/login', '/login.*', '/login/*', '/logout', '/logout.*', '/logout/*' ]){
        
            if(!Recursos.findUrl('/**/js1/**/')){
                new Recursos(url: '/**/js1/**/', configAttribute: 'permitAll').save(flush:true)
            }
            if(!Recursos.findUrl(url)){
                new Recursos(url: url, configAttribute: 'permitAll').save(flush:true)
            }
        
        
            if(!Recursos.findByUrl("/gestion/**")){
                new Recursos(url: '/gestion/**', configAttribute: 'permitAll').save(flush:true, failOnError:true)
            }
        }
    
        def destroy = {
        }
    }}
