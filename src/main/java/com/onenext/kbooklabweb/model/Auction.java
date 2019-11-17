package com.onenext.kbooklabweb.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;



@Table(name="auction")
@Entity
public class Auction implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date auctionDate;
    private Date createdAt;
    private Date updatedAt;

    public Long getId() {
        return id;
    }

    public Date getAuctionDate() {
        return auctionDate;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAuctionDate(Date auctionDate) {
        this.auctionDate = auctionDate;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
