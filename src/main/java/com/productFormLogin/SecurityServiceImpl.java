package com.productFormLogin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class SecurityServiceImpl implements SecurityService {

	@Autowired
	private UserDetailsServiceImpl uds;
	
	@Autowired
	AuthenticationManager am;
	
	@Override
	public boolean login(String email, String password) {
		UserDetails user = uds.loadUserByUsername(email);
		UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(user.getUsername(),password,user.getAuthorities());
		am.authenticate(token);
		boolean rs = token.isAuthenticated();
		if(rs) {
			SecurityContextHolder sch = new SecurityContextHolder();
			return true;
		}
		
		return rs;
	}

}
