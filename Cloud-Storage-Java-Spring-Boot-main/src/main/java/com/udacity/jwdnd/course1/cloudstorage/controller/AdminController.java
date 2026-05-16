package com.udacity.jwdnd.course1.cloudstorage.controller;

import com.udacity.jwdnd.course1.cloudstorage.services.CredentialService;
import com.udacity.jwdnd.course1.cloudstorage.services.FileService;
import com.udacity.jwdnd.course1.cloudstorage.services.NoteService;
import com.udacity.jwdnd.course1.cloudstorage.services.SupportService;
import com.udacity.jwdnd.course1.cloudstorage.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class AdminController {

    @Autowired
    private UserService userService;

    @Autowired
    private FileService fileService;

    @Autowired
    private NoteService noteService;

    @Autowired
    private CredentialService credentialService;

    @Autowired
    private SupportService supportService;

    @GetMapping("/adminlogin")
    public String adminLoginPage() {
        return "adminlogin";
    }

    @PostMapping("/adminlogin")
    public String adminLogin(@RequestParam String username,
                             @RequestParam String password,
                             Model model) {

        if (username.equals("admin") && password.equals("admin123")) {
            return "redirect:/admin";
        }

        model.addAttribute("error", "Invalid Credentials");
        return "adminlogin";
    }

    @GetMapping("/admin")
    public String adminPage(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        model.addAttribute("files", fileService.getAllFiles());
        model.addAttribute("notes", noteService.getNotes());
        model.addAttribute("credentials", credentialService.getCredentials());
        model.addAttribute("reports", supportService.getAllReports());
        return "admin";
    }

    @PostMapping("/admin/delete-user/{userId}")
    public String deleteUser(@PathVariable Integer userId, RedirectAttributes redirectAttributes) {
        supportService.deleteReportsByUserId(userId);
        credentialService.deleteCredentialsByUserId(userId);
        noteService.deleteNotesByUserId(userId);
        fileService.deleteFilesByUserId(userId);
        userService.deleteUserById(userId);
        redirectAttributes.addFlashAttribute("adminMessage", "User and related data deleted.");
        return "redirect:/admin";
    }

    @PostMapping("/admin/delete-report/{id}")
    public String deleteReport(@PathVariable Integer id, RedirectAttributes redirectAttributes) {
        supportService.deleteReport(id);
        redirectAttributes.addFlashAttribute("adminMessage", "Support report resolved.");
        return "redirect:/admin";
    }

    @PostMapping("/admin/delete-file/{id}")
    public String deleteFile(@PathVariable Integer id, RedirectAttributes redirectAttributes) {
        fileService.deleteFile(id);
        redirectAttributes.addFlashAttribute("adminMessage", "File deleted.");
        return "redirect:/admin";
    }

    @PostMapping("/admin/delete-note/{id}")
    public String deleteNote(@PathVariable Integer id, RedirectAttributes redirectAttributes) {
        noteService.deleteNote(id);
        redirectAttributes.addFlashAttribute("adminMessage", "Note deleted.");
        return "redirect:/admin";
    }

    @PostMapping("/admin/delete-credential/{id}")
    public String deleteCredential(@PathVariable Integer id, RedirectAttributes redirectAttributes) {
        credentialService.deleteCredential(id);
        redirectAttributes.addFlashAttribute("adminMessage", "Credential deleted.");
        return "redirect:/admin";
    }
}
