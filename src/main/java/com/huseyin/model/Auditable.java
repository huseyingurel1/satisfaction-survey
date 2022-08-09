package com.huseyin.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class Auditable {

    //Sadece Databasede Görünecek Bölüm

    //kim ekledi
    @CreatedBy
    protected String createdBy;
    //Ne zaman ekledi
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    protected Date createdDate;
    //kim güncelledi
    @LastModifiedBy
    protected String lastModifiedBy;
    //Ne zaman güncelledi
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    protected Date lastModifiedDate;
}
