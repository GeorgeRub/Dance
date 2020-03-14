package com.kindergarten.dance.model;

import javax.persistence.*;

@Entity
@Table(name = "index_page")
public class IndexPage {

    @Id
    @Column(name = "ip_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "head_photo")
    public String headPhoto;

    @Column(name = "first_field_name")
    public String fisrtFieldName;

    @Column(name = "first_field")
    @Lob
    public String firstField;

    @Column(name = "description")
    private String description;

    @Column(name = "test_lesson")
    public boolean testLesson;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHeadPhoto() {
        return headPhoto;
    }

    public void setHeadPhoto(String headPhoto) {
        this.headPhoto = headPhoto;
    }

    public String getFirstField() {
        return firstField;
    }

    public void setFirstField(String firstField) {
        this.firstField = firstField;
    }


    public boolean isTestLesson() {
        return testLesson;
    }

    public void setTestLesson(boolean testLesson) {
        this.testLesson = testLesson;
    }

    public String getFisrtFieldName() {
        return fisrtFieldName;
    }

    public void setFisrtFieldName(String fisrtFieldName) {
        this.fisrtFieldName = fisrtFieldName;
    }
}