package com.jstore.user.jstore_android_aldinisarahmasabillah;

public class Item {
    private int id;
    public String name;
    private int price;
    private String category;
    private String status;
    private Supplier supplier;

    //constructor class item
    public Item(int id, String name, String status, int price, Supplier supplier, String category)
    {
        //constructor
        this.id=id;
        this.name=name;
        this.price=price;
        this.category=category;
        this.status=status;
        this.supplier=supplier;

    }


    public int getId()
    {
        // put your code here
        return id;
    }


    public String getName()
    {
        // put your code here
        return name;
    }

    public int getPrice()
    {
        // put your code here
        return price;
    }

    public String getCategory()
    {
        // put your code here
        return category;
    }


    public String getStatus()
    {
        // put your code here
        return status;
    }


    public Supplier getSupplier()
    {
        return supplier;
    }

    public void setId(int id)
    {
        // put your code here
        this.id=id;
    }


    public void setName(String name)
    {
        // put your code here
        this.name=name;
    }


    public void setPrice(int price)
    {
        // put your code here
        this.price=price;
    }


    public void setCategory(String category)
    {
        // put your code here
        this.category=category;
    }


    public void setStatus(String Status)
    {
        // put your code here
        this.status=status;
    }


    public void setSupplier(Supplier supplier)
    {
        this.supplier=supplier;
    }
}
