package uz.micros.jstore.controller.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import uz.micros.jstore.entity.blog.Blog;
import uz.micros.jstore.service.blog.BlogService;

<<<<<<< HEAD
=======
/**
 * Created by java on 21.05.14.
 */
>>>>>>> 529754b0b24cfe5fcc85f6d877b2c1cfe9154805
@Controller
@RequestMapping("/blog")
public class BlogController {

    @Autowired
<<<<<<< HEAD
    private BlogService service;

    @RequestMapping
    public String blogIndex(ModelMap map){

        Blog blog = service.getBlog();

        map.addAttribute("blog", blog);

=======
    private BlogService srv;

    @RequestMapping
    public String blogIndex(ModelMap map) {
        Blog blog = srv.getBlog();
        map.addAttribute("b", blog);
>>>>>>> 529754b0b24cfe5fcc85f6d877b2c1cfe9154805
        return "blog/index";
    }
}
