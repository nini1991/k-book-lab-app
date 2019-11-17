package com.onenext.kbooklabweb.controller;

import com.onenext.kbooklabweb.model.Auction;
import com.onenext.kbooklabweb.repository.AuctionRepository;
import com.onenext.kbooklabweb.service.AuctionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AuctionController {
    @Autowired
    AuctionServiceImpl auctionServiceImpl;

    @GetMapping("/auctions")
    public List<Auction> getAllAuctions() {
        return auctionServiceImpl.getAllAuction();
    }
}
