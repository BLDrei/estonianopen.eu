package eu.estonianopen.rubikscube.repo;

import eu.estonianopen.rubikscube.models.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long> {
}
