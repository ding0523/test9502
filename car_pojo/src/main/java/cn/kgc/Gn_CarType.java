package cn.kgc;

public class Gn_CarType {
    private Integer id;
    private String gn_carName;
    private String gn_carConfifg;
    private String gn_carDaliyPrice;
    private String gn_picture;
    private String gn_sort;
    private Gn_Store gn_store;
    private Integer carStoreId;
    private Integer star;

    @Override
    public String toString() {
        return "Gn_CarType{" +
                "id=" + id +
                ", gn_carName='" + gn_carName + '\'' +
                ", gn_carConfifg='" + gn_carConfifg + '\'' +
                ", gn_carDaliyPrice='" + gn_carDaliyPrice + '\'' +
                ", gn_picture='" + gn_picture + '\'' +
                ", gn_sort='" + gn_sort + '\'' +
                ", gn_store=" + gn_store +
                ", carStoreId=" + carStoreId +
                ", star=" + star +
                '}';
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public Gn_Store getGn_store() {
        return gn_store;
    }

    public void setGn_store(Gn_Store gn_store) {
        this.gn_store = gn_store;
    }

    public Integer getCarStoreId() {
        return carStoreId;
    }

    public void setCarStoreId(Integer carStoreId) {
        this.carStoreId = carStoreId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGn_carName() {
        return gn_carName;
    }

    public void setGn_carName(String gn_carName) {
        this.gn_carName = gn_carName;
    }

    public String getGn_carConfifg() {
        return gn_carConfifg;
    }

    public void setGn_carConfifg(String gn_carConfifg) {
        this.gn_carConfifg = gn_carConfifg;
    }

    public String getGn_carDaliyPrice() {
        return gn_carDaliyPrice;
    }

    public void setGn_carDaliyPrice(String gn_carDaliyPrice) {
        this.gn_carDaliyPrice = gn_carDaliyPrice;
    }

    public String getGn_picture() {
        return gn_picture;
    }

    public void setGn_picture(String gn_picture) {
        this.gn_picture = gn_picture;
    }

    public String getGn_sort() {
        return gn_sort;
    }

    public void setGn_sort(String gn_sort) {
        this.gn_sort = gn_sort;
    }

}
