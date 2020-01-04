package com.kindergarten.dance.model.pages;

import com.kindergarten.dance.model.BaseEntity;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import java.util.List;

@Entity
public class Pages extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "p_id")
    private Long id;

    @Column
    @UniqueElements
    private String url;

    @Column
    @Lob
    private String text;

    @Column
    private String mainPhoto;

    @Column
    private String title;

    @Column
    private String shortTitle;

    @Column
    private boolean hasScheduler;

    @ManyToOne
    @JoinColumn(name = "sched_id")
    private Schedule schedule;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShortTitle() {
        return shortTitle;
    }

    public void setShortTitle(String shortTitle) {
        this.shortTitle = shortTitle;
    }

    public boolean isHasScheduler() {
        return hasScheduler;
    }

    public void setHasScheduler(boolean hasScheduler) {
        this.hasScheduler = hasScheduler;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
}
