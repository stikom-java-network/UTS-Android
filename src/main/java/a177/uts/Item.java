package a177.uts;

/**
 * Created by mhs on 20/11/2019.
 */

public class Item {

    private String Title;
    private double Price, subTotal;
    private int Picture, Qty;


    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public int getPicture() {
        return Picture;
    }

    public void setPicture(int picture) {
        Picture = picture;
    }

    public int getQty() {
        return Qty;
    }

    public void setQty(int qty) {
        Qty = qty;
    }

    public Double subTotal(double Price, int Qty){
        double subTotal = getPrice()*getQty();
        return subTotal;
    }


}
