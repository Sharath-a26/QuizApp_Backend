package com.example.demo1.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "studentData")
public class Post {

    private String studEmail;
    private String password;

    public Post() {
    }

    @Override
    public String toString() {
        return "Post{" +
                "studEmail='" + studEmail + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getStudEmail() {
        return studEmail;
    }


    public void setStudEmail(String studEmail) {
        this.studEmail = studEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
