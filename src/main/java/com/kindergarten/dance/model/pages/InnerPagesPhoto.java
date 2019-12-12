package com.kindergarten.dance.model.pages;

import com.kindergarten.dance.model.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "inner_pages_photo")
public class InnerPagesPhoto extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ipp_id")
    private Long id;

    @Column
    private String photoName;

    @ManyToOne(targetEntity = Pages.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "p_id")
    private Pages pages;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhotoName() {
        return photoName;
    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName;
    }

    public Pages getPages() {
        return pages;
    }

    public void setPages(Pages pages) {
        this.pages = pages;
    }
}
