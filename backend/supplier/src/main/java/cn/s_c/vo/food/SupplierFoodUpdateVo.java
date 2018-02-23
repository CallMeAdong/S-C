package cn.s_c.vo.food;

import cn.s_c.entity.supplier.Supplier;

public class SupplierFoodUpdateVo {
    private int id;
    private String name;
    private double price;
    private String url;
    private boolean hasChoice;
    private String[] choice;
    private Supplier supplier;

    public SupplierFoodUpdateVo(int id, String name, double price, String url, boolean hasChoice, String[] choice, Supplier supplier) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.url = url;
        this.hasChoice = hasChoice;
        this.choice = choice;
        this.supplier = supplier;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isHasChoice() {
        return hasChoice;
    }

    public void setHasChoice(boolean hasChoice) {
        this.hasChoice = hasChoice;
    }

    public String[] getChoice() {
        return choice;
    }

    public void setChoice(String[] choice) {
        this.choice = choice;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
}
