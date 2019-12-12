package com.kindergarten.dance.model.pages;

import com.kindergarten.dance.model.BaseEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "pages")
public class Pages extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "p_id")
    private Long id;

    @Column
    private String url;

    @Column
    @Lob
    private String text;

    @Column
    private String mainPhoto;

    @OneToMany(mappedBy = "pages", fetch = FetchType.LAZY)
    private List<InnerPagesPhoto> innerPagesPhotos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMainPhoto() {
        return mainPhoto;
    }

    public void setMainPhoto(String mainPhoto) {
        this.mainPhoto = mainPhoto;
    }

    public List<InnerPagesPhoto> getInnerPagesPhotos() {
        return innerPagesPhotos;
    }

    public void setInnerPagesPhotos(List<InnerPagesPhoto> innerPagesPhotos) {
        this.innerPagesPhotos = innerPagesPhotos;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
