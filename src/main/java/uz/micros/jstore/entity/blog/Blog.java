package uz.micros.jstore.entity.blog;

import java.util.List;

/**
 * Created by java on 21.05.14.
 */
public class Blog {
    private String title;
    private List<Post> posts;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
}