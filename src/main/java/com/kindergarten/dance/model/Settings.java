package com.kindergarten.dance.model;


import com.google.gson.Gson;

import java.lang.reflect.Type;

import com.google.gson.reflect.TypeToken;
import com.kindergarten.dance.wrappers.ImageSizeWrapper;

import javax.persistence.*;
import java.util.List;

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

    @Column(name = "main_photo")
    private String mainPhoto;
    @Column(name = "text_photo")
    private String textPhoto;
    @Column(name = "index_photo")
    private String indexPhoto;


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

    public String getMainPhoto() {
        return mainPhoto;
    }

    public List<ImageSizeWrapper> getMainPhotoWrapper() {
        if (mainPhoto != null && mainPhoto.length() > 1) {
            Type itemsListType = new TypeToken<List<ImageSizeWrapper>>() {
            }.getType();
            return new Gson().fromJson(mainPhoto, itemsListType);
        }
        return null;
    }

    public void setMainPhoto(String mainPhoto) {
        this.mainPhoto = mainPhoto;
    }

    public void setMainPhoto(List<ImageSizeWrapper> mainPhoto) {
        if (mainPhoto != null) {
            this.mainPhoto = new Gson().toJson(mainPhoto);
        } else {
            this.mainPhoto = null;
        }
    }

    public String getTextPhoto() {
        return textPhoto;
    }

    public List<ImageSizeWrapper> getTextPhotoWrapper() {
        if (textPhoto != null && textPhoto.length() > 1) {
            Type itemsListType = new TypeToken<List<ImageSizeWrapper>>() {
            }.getType();
            return new Gson().fromJson(textPhoto, itemsListType);
        }
        return null;
    }

    public void setTextPhoto(String textPhoto) {
        this.textPhoto = textPhoto;
    }

    public void setTextPhoto(List<ImageSizeWrapper> textPhoto) {
        if (textPhoto != null) {
            this.textPhoto = new Gson().toJson(textPhoto);
        } else {
            this.textPhoto = null;
        }
    }

    public String getIndexPhoto() {
        return indexPhoto;
    }

    public List<ImageSizeWrapper> getIndexPhotoWrapper() {
        if (indexPhoto != null && indexPhoto.length() > 1) {
            Type itemsListType = new TypeToken<List<ImageSizeWrapper>>() {
            }.getType();
            return new Gson().fromJson(indexPhoto, itemsListType);
        }
        return null;
    }

    public void setIndexPhoto(String indexPhoto) {
        this.indexPhoto = indexPhoto;
    }

    public void setIndexPhoto(List<ImageSizeWrapper> indexPhoto) {
        if (indexPhoto != null) {
            this.indexPhoto = new Gson().toJson(indexPhoto);
        } else {
            this.indexPhoto = null;
        }
    }

    @Override
    public String toString() {
        return "Settings{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", val='" + val + '\'' +
                ", mainPhoto='" + mainPhoto + '\'' +
                ", textPhoto='" + textPhoto + '\'' +
                ", indexPhoto='" + indexPhoto + '\'' +
                '}';
    }
}
