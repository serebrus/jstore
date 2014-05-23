package uz.micros.jstore.service.blog;

import org.springframework.stereotype.Service;
import uz.micros.jstore.entity.blog.Blog;
import uz.micros.jstore.entity.blog.Post;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by java on 23.05.14.
 */
@Service
public class BlogService {
    public Blog getBlog() {
        Blog blog = new Blog();
        blog.setTitle("jStore corporate super Blog!");

        List<Post> posts = new ArrayList<Post>();
        for(int k=0; k <77; k++) {
            Post post = new Post();
            post.setSubject("Post "+(k+1));
            posts.add(post);
        }
        blog.setPosts(posts);
        return blog;
    }
}
