package uz.micros.jstore.controller;

<<<<<<< HEAD
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import uz.micros.jstore.entity.store.Author;
=======
import com.sun.tracing.dtrace.ModuleAttributes;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import uz.micros.jstore.entity.Author;
>>>>>>> 529754b0b24cfe5fcc85f6d877b2c1cfe9154805

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD
@Controller
public class IndexController {

    @RequestMapping("/")
    public ModelAndView home(HttpSession session) {
        Author a = new Author();
        a.setName("Akbar");

        List<Author> list;
        if (session.getAttribute("authors") == null) {
            list = new ArrayList<>();
            list.add(a);
            list.add(a);
            list.add(a);
            session.setAttribute("authors", list);
        } else
            list = (List<Author>) session.getAttribute("authors");

        return new ModelAndView("home")
                .addObject("name", "John")
=======
/**
 * Created by java on 12.05.14.
 */
@Controller
public class IndexController {
    @ResponseBody
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showIndex() {
        return "<a href=\"fefe\">Login</a>";
    }

    @RequestMapping(value = "/fefe", method = RequestMethod.GET)
    public ModelAndView showIndex1(HttpSession session) {
        Author a = new Author();
        a.setName("Ipak");

        List<Author> list;
        if (session.getAttribute("authors") ==null) {
            list = new ArrayList<Author>();
            list.add(a);
            session.setAttribute("authors", list);
        } else {
            list = (List<Author>)session.getAttribute("authors");
        }

        return new ModelAndView("home")
                .addObject("name", "Hasan")
>>>>>>> 529754b0b24cfe5fcc85f6d877b2c1cfe9154805
                .addObject("author", a)
                .addObject("authors", list)
                .addObject("newAuthor", new Author());
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
<<<<<<< HEAD
    public String save(@RequestParam String title, HttpSession session) {
        List<Author> list = (List<Author>) session.getAttribute("authors");
=======
     public String save(@RequestParam String title, HttpSession session) {
        List<Author> list = (List<Author>)session.getAttribute("authors");
>>>>>>> 529754b0b24cfe5fcc85f6d877b2c1cfe9154805

        Author a = new Author();
        a.setName(title);

        list.add(a);

<<<<<<< HEAD
        return "redirect:/";
    }

    @RequestMapping(value = "/save2", method = RequestMethod.POST)
    public String save2(@ModelAttribute("newAuthor") Author newAuthor, HttpSession session) {
        List<Author> list = (List<Author>) session.getAttribute("authors");

        list.add(newAuthor);

        return "redirect:/";
=======
        return "redirect:/fefe";
    }

    @RequestMapping(value = "/save2", method = RequestMethod.POST)
    public String save2(@ModelAttribute Author newAuthor, HttpSession session) {
        List<Author> list = (List<Author>)session.getAttribute("authors");

        list.add(newAuthor);

        return "redirect:/fefe";
>>>>>>> 529754b0b24cfe5fcc85f6d877b2c1cfe9154805
    }
}