package uz.micros.jstore.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

<<<<<<< HEAD
// BOTH METHODS WORK!

/*
public class WebInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext container) throws ServletException {
        // Create the 'root' Spring application context
        AnnotationConfigWebApplicationContext rootCtx =
                new AnnotationConfigWebApplicationContext();
        rootCtx.register(AppConfig.class);
        //context.setConfigLocation("uz.micros.jstore.config");

        // Manage the lifecycle of the root application context
        container.addListener(new ContextLoaderListener(rootCtx));

        // Register and map the dispatcher servlet
        ServletRegistration.Dynamic dispatcher =
                container.addServlet("dispatcher", new DispatcherServlet(rootCtx));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/*");
    }
}
*/
=======
/**
 * Created by java on 12.05.14.
 */
/*public class WebInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext container) throws ServletException {
        AnnotationConfigWebApplicationContext rootCtx = new AnnotationConfigWebApplicationContext();
        rootCtx.register(AppConfig.class);
        container.addListener(new ContextLoaderListener(rootCtx));
        ServletRegistration.Dynamic dispatcher = container.addServlet("dispatcher", new DispatcherServlet(rootCtx));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/*");
    }
}*/

>>>>>>> 529754b0b24cfe5fcc85f6d877b2c1cfe9154805
public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{AppConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebMvcConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 529754b0b24cfe5fcc85f6d877b2c1cfe9154805
