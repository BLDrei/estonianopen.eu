package eu.estonianopen.rubikscube.controllers;

import eu.estonianopen.rubikscube.models.Article;
import eu.estonianopen.rubikscube.repo.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewsController {

    @Autowired
    private ArticleRepository articleRepository;

    @GetMapping("/news")
    public String newsMain(Model model) {
        Iterable<Article> articles = articleRepository.findAll();
        model.addAttribute("articles", articles);
        return "news-main";
    }
}
