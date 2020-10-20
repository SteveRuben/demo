package org.abodah.demo.config;

import java.util.Collection;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

public class JwtAuthenticationToken extends AbstractAuthenticationToken {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final Object principal;
	private final Object credential;
	
	public JwtAuthenticationToken(Object credential,  Object principal, Collection<? extends GrantedAuthority> authorities) {
		super(authorities);
		this.credential = credential;
		this.principal = principal;
		super.setAuthenticated(true);
	}

	public JwtAuthenticationToken(Object credential,  Object principal) {
		super(null);
		this.credential = credential;
		this.principal = principal;
		super.setAuthenticated(false);
	}
	
	@Override
	public Object getCredentials() {
		return this.credential;
	}

	@Override
	public Object getPrincipal() {
		return this.principal;
	}
	
	

}
