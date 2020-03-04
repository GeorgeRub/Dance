package com.kindergarten.dance.model;


import javax.persistence.*;

@Entity
@Table(name = "sett")
public class Settings extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "set_id")
    private Long id;
    @Column(name = "name")
    private String name;

    @Column(name = "val")
    private String val;

    @Column(name = "width")
    private Integer width;
    @Column(name = "height")
    private Integer height;

    public Settings() {
    }

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

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Settings{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", val='" + val + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
