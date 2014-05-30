package uz.micros.jstore.entity.blog;

<<<<<<< HEAD

import java.util.Date;

=======
import java.util.Date;

/**
 * Created by java on 21.05.14.
 */
>>>>>>> 529754b0b24cfe5fcc85f6d877b2c1cfe9154805
public class Comment {
    private String text;
    private Date date;
    private String author;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
