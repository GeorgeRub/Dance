package com.kindergarten.dance.model;

import javax.persistence.*;

@Entity
public class News extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "n_id")
    private Long id;
    @Column
    private String photo;
    @Column
    private String title;
    @Column
    private String pre;
    @Column
    private String url;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPre() {
        return pre;
    }

    public void setPre(String pre) {
        this.pre = pre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", photo='" + photo + '\'' +
                ", title='" + title + '\'' +
                ", pre='" + pre + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
