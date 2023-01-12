package com.examples;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class DetailsController {
	



		
		@RequestMapping(value = "/")
		public String viewPage(Model model) {

			Details detail = new Details();
			model.addAttribute("detail", detail);
			
			List<String> ideNames = Arrays.asList("Eclipse", "IntelliJ", "PyCharm", "Visual Studio", "NetBeans");
			model.addAttribute("ideNames", ideNames);		
			
			return "details";
		}

		@RequestMapping(value = "/submit", method = RequestMethod.POST)
		public String submit(@ModelAttribute("detail") Details detail) {
				return "detailsSummary";
		}

		
	}



