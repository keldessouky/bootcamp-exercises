package com.techelevator.auctions.controller;

import com.techelevator.auctions.DAO.AuctionDAO;
import com.techelevator.auctions.DAO.MemoryAuctionDAO;
import com.techelevator.auctions.model.Auction;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class AuctionController {

	private AuctionDAO dao;

	public AuctionController() {
		this.dao = new MemoryAuctionDAO();
	}

	@RequestMapping(path = "/auctions", method = RequestMethod.GET)
	public List<Auction> list(@RequestParam(defaultValue = "") String title_like,
			@RequestParam(defaultValue = "0") double currentBid_lte) {

		if (!title_like.equals("") && currentBid_lte > 0) {
			return dao.searchByTitleAndPrice(title_like, currentBid_lte);
		}

		if (!title_like.equals("")) {
			return dao.searchByTitle(title_like);
		}

		if (currentBid_lte > 0) {
			return dao.searchByPrice(currentBid_lte);
		}

		return dao.list();
	}

	@RequestMapping(path = "/auctions/{id}", method = RequestMethod.GET)
	public Auction get(@PathVariable int id) {

		return dao.get(id);

	}

	@RequestMapping(path = "/auctions", method = RequestMethod.POST)
	public Auction create(@RequestBody Auction auction) {

		return dao.create(auction);

	}

}
