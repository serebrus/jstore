package uz.micros.jstore.controller.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import uz.micros.jstore.entity.blog.Blog;

/**
 * Created by java on 21.05.14.
 */
@Controller
@RequestMapping("/blog")
public class BlogController {

    @RequestMapping
    public String blogIndex(ModelMap map) {
        Blog blog = new Blog();
        blog.setTitle("jStore corporate super Blog!");
        map.addAttribute("b", blog);
        return "blog/index";
    }
}