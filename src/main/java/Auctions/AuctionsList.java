package Auctions;

import java.util.ArrayList;
import java.util.List;

public class AuctionsList {


   private List<Product> auctionsList = new ArrayList<>();

    public List<Product> getAuctionsList() {
        return auctionsList;
    }



    public AuctionsList() {
        this.auctionsList = auctionsList;
    }

    public void addProduct(Product product){

        auctionsList.add(product);
    }

    public void removeProduct(){}

    @Override
    public String toString() {
        return "AuctionsList{" +
                "auctionsList=" + auctionsList +
                '}';
    }
}