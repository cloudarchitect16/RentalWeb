package com.rental.context.mapper;


import com.rental.domain.LoggedInUser;
import org.springframework.ldap.core.DirContextAdapter;
import org.springframework.ldap.core.DirContextOperations;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.ldap.userdetails.UserDetailsContextMapper;
import org.springframework.stereotype.Component;

import java.util.Collection;
@Component("loggedInUserContextMapper")
public class LoggedInUserContextMapper implements UserDetailsContextMapper {
    @Override
    public UserDetails mapUserFromContext(DirContextOperations context, String userName, Collection<? extends GrantedAuthority> authorities) {
        LoggedInUser loggedInUser = new LoggedInUser();
        loggedInUser.setFirstName(context.getStringAttribute("givenName"));
        loggedInUser.setLastName(context.getStringAttribute("sn"));
        loggedInUser.setEmail(context.getStringAttribute("mail"));
        loggedInUser.setUserName(userName);
        loggedInUser.setAuthorities(authorities);
        return loggedInUser;
    }

    @Override
    public void mapUserToContext(UserDetails user, DirContextAdapter context) {
        LoggedInUser loggedInUser = (LoggedInUser) user;
        context.setAttributeValue("givenName", loggedInUser.getFirstName());
        context.setAttributeValue("sn", loggedInUser.getLastName());
        context.setAttributeValue("mail", loggedInUser.getEmail());
        context.setAttributeValue("uid", loggedInUser.getUsername());
        context.setAttributeValue("password", loggedInUser.getPassword());
    }
}
