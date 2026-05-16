package com.udacity.jwdnd.course1.cloudstorage.controller;

import com.udacity.jwdnd.course1.cloudstorage.model.Credential;
import com.udacity.jwdnd.course1.cloudstorage.model.User;
import com.udacity.jwdnd.course1.cloudstorage.services.CredentialService;
import com.udacity.jwdnd.course1.cloudstorage.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CredentialsController {

    @Autowired
    private CredentialService credentialService;

    @Autowired
    private UserService userService;

    @PostMapping("/credentials")
    public String postCredential(Authentication auth,
                                 Credential credential,
                                 RedirectAttributes redirectAttributes) {
        User user = userService.getUser(auth.getName());
        credential.setUserId(user.getUserId());

        String stringId = credential.getStringId();
        if (stringId == null || stringId.isEmpty()) {
            credentialService.addCredential(credential);
            redirectAttributes.addFlashAttribute("successEvent", "Credential successfully created!");
        } else {
            credential.setCredentialId(Integer.parseInt(stringId));
            credentialService.updateCredential(credential);
            redirectAttributes.addFlashAttribute("successEvent", "Credential successfully updated!");
        }

        return "redirect:/home";
    }

    @GetMapping("/credentials/delete/{id}")
    public String deleteCredential(@PathVariable("id") String id, RedirectAttributes redirectAttributes) {
        credentialService.deleteCredential(Integer.parseInt(id));
        redirectAttributes.addFlashAttribute("successEvent", "Credential successfully deleted!");
        return "redirect:/home";
    }
}
