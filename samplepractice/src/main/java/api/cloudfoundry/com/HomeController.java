package api.cloudfoundry.com;

import java.util.Locale;

import javax.servlet.ServletException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/")
public class HomeController {
	
	private FormBean form;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
		
	public FormBean getForm() {
		return form;
	}

	public void setForm(FormBean form) {
		this.form = form;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome");
		form=new FormBean();
		model.addAttribute("message", "名前とメールアドレスを入力ください。" );
		model.addAttribute("command", form);
		return "home";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String home(FormBean form, BindingResult result, Model model)
	throws ServletException {
		logger.info("form: " + form.getName() + "," + form.getMail());
		String re = "name: " + form.getName() + "<br>mail: " + form.getMail();
		model.addAttribute("command",form);
		model.addAttribute("message",re);
		return "home";
	}
	}

