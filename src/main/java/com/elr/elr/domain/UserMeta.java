package com.elr.elr.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "wp_usermeta")
public class UserMeta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "umeta_id")
    private Long id;
    private Long userId;

    @Size(max = 255)
    @Column(columnDefinition = "longtext")
    private String metaKey;

    /*
    * en la base de datos es longtest Collate utf8mb4_unicode...
    * cuando lo cambio TINYTEXT en la base de datos si funciona.
    * */
    @Lob
    @Column(name = "meta_value")
    private String metaValue;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

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