package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class BaseController {

    @RequestMapping(value="/*", method = RequestMethod.GET)
    public String welcome(ModelMap model) {

        model.addAttribute("message", "Ejemplo de proyecto maven con integracion en CLOUD ");

        //Spring uses InternalResourceViewResolver and return back index.jsp
        return "index";

    }

    @RequestMapping(value="/welcome/{name}", method = RequestMethod.GET)
    public String welcomeName(@PathVariable String name, ModelMap model) {

        model.addAttribute("message", "Maven Project for " + name);
        return "index";

    }

	//TODO commit and push
	@RequestMapping(value="/test/*", method = RequestMethod.GET)
	public String test(@PathVariable String name, ModelMap model) {

		model.addAttribute("message", "Test method in CLOUD");
		return "index";

	}
}