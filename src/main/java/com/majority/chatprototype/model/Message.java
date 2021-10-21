package com.majority.chatprototype.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    private LocalDateTime sendDate;

    @ManyToOne
    private User originUser;

    @ManyToOne
    private User destinyUser;

    public void setId(Long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setSendDate(LocalDateTime sendDate) {
        this.sendDate = sendDate;
    }

    public void setOriginUser(User originUser) {
        this.originUser = originUser;
    }

    public void setDestinyUser(User destinyUser) {
        this.destinyUser = destinyUser;
    }

    public Long getId() {
        return this.id;
    }

    public String getContent() {
        return this.content;
    }

    public LocalDateTime getSendDate() {
        return this.sendDate;
    }

    public User getOriginUser() {
        return this.originUser;
    }

    public User getDestinyUser() {
        return this.destinyUser;
    }
}
