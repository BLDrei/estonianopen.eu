package eu.estonianopen.rubikscube.controllers;

import eu.estonianopen.rubikscube.models.PhotosLink;
import eu.estonianopen.rubikscube.repo.PhotosLinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PhotosController {

    @Autowired
    private PhotosLinkRepository photosLinkRepository;

    @GetMapping("/photos")
    public String photosMain(Model model) {
        Iterable<PhotosLink> links = photosLinkRepository.findAll();
//        Iterable<PhotosLink> media = photosLinkRepository.findAll();
        model.addAttribute("links", links);
//        model.addAttribute("media", media);
        return "photos";
    }

    @GetMapping("/photos/add")
    public String photosAddPage(Model model) {
        return "photos-add";
    }

    @PostMapping("photos/add")
    public String photosAddToDB(@RequestParam String link, @RequestParam String eventName, @RequestParam String additionalInfo, Model model) {
        PhotosLink photosLink = new PhotosLink(link, eventName, additionalInfo);
        photosLinkRepository.save(photosLink);
        return "redirect:/photos";
    }
}
