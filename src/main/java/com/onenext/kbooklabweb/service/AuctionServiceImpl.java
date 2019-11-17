package com.onenext.kbooklabweb.service;

import com.onenext.kbooklabweb.model.Auction;
import com.onenext.kbooklabweb.repository.AuctionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuctionServiceImpl  {
    @Autowired
    AuctionRepository auctionRepository;
    
    public List<Auction> getAllAuction() {
        return (List<Auction>) auctionRepository.findAll();
    }
}
