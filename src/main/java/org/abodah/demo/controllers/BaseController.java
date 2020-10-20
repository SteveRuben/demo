package org.abodah.demo.controllers;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.hateoas.Link;

public class BaseController {

	/**
	 * Adjust the {@link Link} such that it starts at {@literal basePath}.
	 *
	 * @param link     - link presumably supplied via Spring HATEOAS
	 * @param basePath - base path provided by Spring Data REST
	 * @return new {@link Link} with these two values melded together
	 */
	@SuppressWarnings("unused")
	private static Link applyBasePath(Link link, String basePath) {

		URI uri = link.toUri();

		URI newUri = null;
		try {
			newUri = new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), //
					uri.getPort(), basePath + uri.getPath(), uri.getQuery(), uri.getFragment());
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}

		return new Link(newUri.toString(), link.getRel());
	}
}
