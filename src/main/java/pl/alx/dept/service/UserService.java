package pl.alx.dept.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pl.alx.dept.Dao.UserDao;
import pl.alx.dept.model.User;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserService implements UserDetailsService {
    @Autowired
    private UserDao userDao;
        @Override
        public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {


        User user = userDao.findByEmail(email);

        if (user == null) {
            throw new UsernameNotFoundException("User with emial "+ email + " not found");
        }

            List<GrantedAuthority> authorities = new ArrayList<>();
            authorities.add(new SimpleGrantedAuthority("USER"));

        return new org.springframework.security.core.userdetails.User(
                user.getEmail(), user.getPassword(),authorities
        );
    }
}
