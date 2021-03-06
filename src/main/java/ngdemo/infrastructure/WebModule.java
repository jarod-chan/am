package ngdemo.infrastructure;

import org.codehaus.jackson.jaxrs.JacksonJsonProvider;

import com.google.inject.Scopes;
import com.google.inject.servlet.ServletModule;
import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.jersey.api.core.ResourceConfig;
import com.sun.jersey.guice.spi.container.servlet.GuiceContainer;

public class WebModule extends ServletModule {

	@Override
	protected void configureServlets() {
		
		super.configureServlets();

		// Configuring Jersey via Guice:
		ResourceConfig resourceConfig = new PackagesResourceConfig("ngdemo/web");
		for (Class<?> resource : resourceConfig.getClasses()) {
			bind(resource);
		}

		// hook Jackson into Jersey as the POJO <-> JSON mapper
		bind(JacksonJsonProvider.class).in(Scopes.SINGLETON);

		serve("/web/*").with(GuiceContainer.class);
	}

}
