package uz.micros.jstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by java on 12.05.14.
 */
@Controller
public class IndexController {
    @ResponseBody
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showIndex() {
        return "<center><h2>Privet mir</h2><br /><a href='login'>Login</a></center>";
    }

    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showIndex1() {
        return "<center><form><input type='text' name='ulgn' /><br /><input type='password' name='upas' /><br /><input type='submit' value='Ok' /><a href='..'>Back</a></form></center>";
    }

    @ResponseBody
    @RequestMapping(value = "/login?*", method = RequestMethod.GET)
    public String showIndex2() {
        return "<center><form method='get'><input type='text' name='ulgn' /><br /><input type='password' name='upas' /><br /><input type='submit' value='Ok' /><a href='..'>Back</a></form><br /></center>";
    }
}