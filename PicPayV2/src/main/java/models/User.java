package models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.dom4j.tree.AbstractEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import java.util.Collection;

@Entity
public class User implements UserDetails {

//    @NotEmpty
//    @Column(unique = true)
    @Id
    public String username;

//    @NotEmpty
//    @JsonIgnore
    private String password;

    @NotEmpty
    private String name;
//
//    @NotEmpty
//    private boolean admin;


    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() { return null; }

    @Override
    public boolean isAccountNonExpired() { return true; }

    @Override
    public boolean isAccountNonLocked() { return true; }

    @Override
    public boolean isCredentialsNonExpired() { return true; }

    @Override
    public boolean isEnabled() { return true; }

//    public boolean isAdmin() {
//        return admin;
//    }
//
//    public void setAdmin(boolean admin) {
//        this.admin = admin;
//    }
}
