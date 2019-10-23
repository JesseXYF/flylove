package com.jesse.flylove.dto;

/**
 * @program: CloudEnglish
 * @description:
 * @author: Jesse
 * @create: 11:28 2019/10/23
 **/
public class PhotoTexts {
    private int id;
    private String texts;

    public PhotoTexts() {
    }

    private PhotoTexts(Builder builder) {
        setId(builder.id);
        setTexts(builder.texts);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTexts() {
        return texts;
    }

    public void setTexts(String texts) {
        this.texts = texts;
    }

    @Override
    public String toString() {
        return "PhotoTexts{" +
                "id=" + id +
                ", texts='" + texts + '\'' +
                '}';
    }

    public static final class Builder {
        private int id;
        private String texts;

        public Builder() {
        }

        public Builder id(int val) {
            id = val;
            return this;
        }

        public Builder texts(String val) {
            texts = val;
            return this;
        }

        public PhotoTexts build() {
            return new PhotoTexts(this);
        }
    }
}
