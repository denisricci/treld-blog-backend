package br.com.treld.services;

import br.com.treld.model.Post;

import java.util.List;

/**
 * Created by rsouza on 29/06/16.
 */
public interface PostService {

    Post save(Post post);
    Post findById(String id);
    Post findByUrl(String url);
    List<Post> findByTag(String tag, int page);
    List<Post> findByTag(String tag, int page, int pageSize);
    List<Post> findByTags(List<String> tags, int page, int pageSize);
    List<Post> getPage(int page);
    List<Post> getPage(int pageIndex, int pageSize);
    void delete(String id);
    void update(Post post);

}
