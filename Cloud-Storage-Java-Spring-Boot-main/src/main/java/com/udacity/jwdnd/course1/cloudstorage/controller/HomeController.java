package com.udacity.jwdnd.course1.cloudstorage.controller;

import com.udacity.jwdnd.course1.cloudstorage.model.Note;
import com.udacity.jwdnd.course1.cloudstorage.model.User;
import com.udacity.jwdnd.course1.cloudstorage.services.CredentialService;
import com.udacity.jwdnd.course1.cloudstorage.services.EncryptionService;
import com.udacity.jwdnd.course1.cloudstorage.services.FileService;
import com.udacity.jwdnd.course1.cloudstorage.services.NoteService;
import com.udacity.jwdnd.course1.cloudstorage.services.SupportService;
import com.udacity.jwdnd.course1.cloudstorage.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {

	@Autowired
	private NoteService noteService;

	@Autowired
	private CredentialService credentialService;

	@Autowired
	private FileService fileService;

	@Autowired
	private UserService userService;

	@Autowired
	private EncryptionService encryptionService;

	@Autowired
	private SupportService supportService;

	@GetMapping("/home")
	public ModelAndView getHome(Authentication auth, Note note) {
		User user = userService.getUser(auth.getName());

		if (user == null) {
			return new ModelAndView("login");
		}

		ModelAndView modelAndView = new ModelAndView("home");
		modelAndView.addObject("notes", noteService.getAllNotes(user.getUserId()));
		modelAndView.addObject("credentials", credentialService.getAllCredentials(user.getUserId()));
		modelAndView.addObject("files", fileService.getAllFiles(user.getUserId()));
		modelAndView.addObject("encryptionService", encryptionService);

		return modelAndView;
	}

	@PostMapping("/support")
	public String submitSupportReport(Authentication auth,
	                                  @RequestParam String subject,
	                                  @RequestParam String message,
	                                  RedirectAttributes redirectAttributes) {
		User user = userService.getUser(auth.getName());

		if (user == null) {
			return "redirect:/login";
		}

		supportService.createReport(subject, message, user.getUserId());
		redirectAttributes.addFlashAttribute("supportSuccess", "Support report submitted successfully.");
		return "redirect:/home";
	}
}
