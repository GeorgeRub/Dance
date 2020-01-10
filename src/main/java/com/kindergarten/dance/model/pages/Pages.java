package com.kindergarten.dance.model.pages;

import com.kindergarten.dance.model.BaseEntity;
import com.kindergarten.dance.model.PageCategory;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import java.util.List;

@Entity
public class Pages extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "p_id")
    private Long id;

    @Column(unique = true)
    private String url;

    @Column
    @Lob
    private String text;

    @Column
    private String mainPhoto;

    @Column
    private String title;

    @Column
    private String description;

    @Column
    private String keyWords;

    @Column
    private String shortTitle;

    @Column
    private boolean hasScheduler;

    @Column
    private String category;

    @Column
    private String smallPhoto;

    @Column
    private String pre;

    @ManyToOne
    @JoinColumn(name = "sched_id")
    private Schedule schedule;

    @ManyToOne
    @JoinColumn(name = "pc_id")
    private PageCategory pageCategory;

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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSmallPhoto() {
        return smallPhoto;
    }

    public void setSmallPhoto(String smallPhoto) {
        this.smallPhoto = smallPhoto;
    }

    public String getPre() {
        return pre;
    }

    public void setPre(String pre) {
        this.pre = pre;
    }

    public PageCategory getPageCategory() {
        return pageCategory;
    }

    public void setPageCategory(PageCategory pageCategory) {
        this.pageCategory = pageCategory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    @Override
    public String toString() {
        return "Pages{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", text='" + text + '\'' +
                ", mainPhoto='" + mainPhoto + '\'' +
                ", title='" + title + '\'' +
                ", shortTitle='" + shortTitle + '\'' +
                ", hasScheduler=" + hasScheduler +
                ", schedule=" + schedule +
                ", category=" + category +
                '}';
    }
}
