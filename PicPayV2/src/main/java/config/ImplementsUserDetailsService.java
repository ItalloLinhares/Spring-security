package config;

import models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;
import repositories.UserRepository;

@Repository
public class ImplementsUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository ur;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException{
        User usuario = ur.findByUsername(login);

        if(usuario == null){
            throw new UsernameNotFoundException("Usuario não econtrado");
        }
        return usuario;
    }
}
