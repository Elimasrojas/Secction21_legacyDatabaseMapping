package com.elr.elr.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "wp_usermeta")
public class UserMeta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "umeta_id")
    private Long id;

    //182. Refactor for Bi-Directional Association
    //private Long userId;
    @ManyToOne
    private User user;

    @Size(max = 255)
    @Column(columnDefinition = "longtext")
    private String metaKey;

    /*
    * en la base de datos es longtest Collate utf8mb4_unicode...
    * cuando lo cambio TINYTEXT en la base de datos si funciona.
    * */
    @Lob
    //@Type(type = "org.hibernate.type.TextType")
    @Column(name = "meta_value")
    private String metaValue;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /*
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
    */


    public String getMetaKey() {
        return metaKey;
    }

    public void setMetaKey(String metaKey) {
        this.metaKey = metaKey;
    }

    public String getMetaValue() {
        return metaValue;
    }

    public void setMetaValue(String metaValue) {
        this.metaValue = metaValue;
    }
}