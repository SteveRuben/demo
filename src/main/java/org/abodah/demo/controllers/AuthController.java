package org.abodah.demo.controllers;

//@RestController
//@RequestMapping("/auth")
public class AuthController {

//	@Autowired
//	AuthenticationManager authenticationManager;
//
//	@Autowired
//	JwtTokenProvider jwtTokenProvider;
//
//	@Autowired
//	UserRepository users;
//
//	@PostMapping("/signin")
//	public ResponseEntity signin(@RequestBody AuthenticationRequest data) {
//
//		try {
//			String username = data.getUsername();
//			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, data.getPassword()));
//			String token = jwtTokenProvider.createToken(username, this.users.findByUsername(username)
//					.orElseThrow(() -> new UsernameNotFoundException("Username " + username + "not found")).getRoles());
//
//			Map<Object, Object> model = new HashMap<>();
//			model.put("username", username);
//			model.put("token", token);
//			return ok(model);
//		} catch (AuthenticationException e) {
//			throw new BadCredentialsException("Invalid username/password supplied");
//		}
//	}
	
	
}
