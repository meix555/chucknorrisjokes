package meix.springframework.joke.model;

import javax.persistence.*;

@Entity
@Table(name = "chucknorrisjoke")
public class ChuckNorrisJoke {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String joke;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }
}
