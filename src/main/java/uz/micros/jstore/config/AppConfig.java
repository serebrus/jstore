package uz.micros.jstore.config;

<<<<<<< HEAD

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
=======
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * Created by java on 12.05.14.
 */
>>>>>>> 529754b0b24cfe5fcc85f6d877b2c1cfe9154805

@Configuration
@ComponentScan(basePackages = "uz.micros.jstore")
public class AppConfig {
<<<<<<< HEAD
}

=======

    /*@Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver res = new InternalResourceViewResolver();
        res.setViewClass(JstlView.class);
        res.setPrefix("/WEB-INF/pages/");
        res.setSuffix(".jsp");
        return res;
    }*/
}
>>>>>>> 529754b0b24cfe5fcc85f6d877b2c1cfe9154805
