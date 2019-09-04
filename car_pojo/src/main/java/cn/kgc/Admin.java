package cn.kgc;

public class Admin {
    private Integer id;
    private String AdminUser;
    private String AdminPassword;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdminUser() {
        return AdminUser;
    }

    public void setAdminUser(String adminUser) {
        AdminUser = adminUser;
    }

    public String getAdminPassword() {
        return AdminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        AdminPassword = adminPassword;
    }
}
