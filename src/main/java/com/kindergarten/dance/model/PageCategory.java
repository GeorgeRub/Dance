package com.kindergarten.dance.model;

import com.kindergarten.dance.model.pages.InnerPagesPhoto;
import com.kindergarten.dance.model.pages.Pages;
import org.hibernate.annotations.CollectionType;

import javax.persistence.*;
import java.util.List;

@Entity
public class PageCategory extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pc_id")
    private Long id;

    @Column
    private String name;

    @Column
    private String ukrName;

    @OneToMany(mappedBy = "pageCategory", fetch = FetchType.LAZY)
    private List<Pages> pagesList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUkrName() {
        return ukrName;
    }

    public void setUkrName(String ukrName) {
        this.ukrName = ukrName;
    }

    public List<Pages> getPagesList() {
        return pagesList;
    }

    public void setPagesList(List<Pages> pagesList) {
        this.pagesList = pagesList;
    }
}
