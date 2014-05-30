package uz.micros.jstore.config;

import nz.net.ultraq.thymeleaf.LayoutDialect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
<<<<<<< HEAD
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;
import org.thymeleaf.templateresolver.TemplateResolver;

=======
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ITemplateResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;
import org.thymeleaf.templateresolver.TemplateResolver;

/**
 * Created by java on 14.05.14.
 */
>>>>>>> 529754b0b24cfe5fcc85f6d877b2c1cfe9154805
@Configuration
public class ViewConfig {
    @Bean
    public ViewResolver viewResolver() {
<<<<<<< HEAD
        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
        viewResolver.setTemplateEngine(templateEngine());
        viewResolver.setContentType("text/html; charset=UTF-8");
        viewResolver.setOrder(1);

        return viewResolver;
    }

    @Bean
    public SpringTemplateEngine templateEngine() {
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        templateEngine.setTemplateResolver(templateResolver());
        templateEngine.addDialect(new LayoutDialect());

        return templateEngine;
    }

    @Bean
    public TemplateResolver templateResolver() {
        ServletContextTemplateResolver templateResolver = new ServletContextTemplateResolver();
        templateResolver.setPrefix("/WEB-INF/pages/");
        templateResolver.setSuffix(".html");
        templateResolver.setTemplateMode("HTML5");
        templateResolver.setCharacterEncoding("UTF-8");

        return templateResolver;
    }
}
=======
        ThymeleafViewResolver res = new ThymeleafViewResolver();
        res.setOrder(1);
        res.setContentType("text/html; charset=utf-8");
        res.setTemplateEngine(templateEngine());
        return res;
    }

    private SpringTemplateEngine templateEngine() {
        SpringTemplateEngine res = new SpringTemplateEngine();
        res.setTemplateResolver(templateResolver());
        res.addDialect(new LayoutDialect());

        return res;
    }

    private TemplateResolver templateResolver() {
        ServletContextTemplateResolver res = new ServletContextTemplateResolver();
        res.setPrefix("/WEB-INF/pages/");
        res.setSuffix(".html");
        res.setTemplateMode("HTML5");
        res.setCharacterEncoding("utf-8");
        return res;
    }
}
>>>>>>> 529754b0b24cfe5fcc85f6d877b2c1cfe9154805
