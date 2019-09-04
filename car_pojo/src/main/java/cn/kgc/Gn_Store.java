package cn.kgc;

public class Gn_Store {
    private Integer id;
    private String storeName;
    private String storeDistance;
    private String storeAddress;
    private String area;


    @Override
    public String toString() {
        return "Gn_Store{" +
                "id=" + id +
                ", storeName='" + storeName + '\'' +
                ", storeDistance='" + storeDistance + '\'' +
                ", storeAddress='" + storeAddress + '\'' +
                ", area='" + area + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreDistance() {
        return storeDistance;
    }

    public void setStoreDistance(String storeDistance) {
        this.storeDistance = storeDistance;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
