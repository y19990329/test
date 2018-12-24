package entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Users {
    private Integer id;
    private String name;
    private String password;
    private String telephone;
    private String username;
    private String isadmin;
    private House houses;

    @Id
    @Column(name = "ID", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NAME", nullable = true, length = 150)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "PASSWORD", nullable = true, length = 150)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "TELEPHONE", nullable = true, length = 45)
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Basic
    @Column(name = "USERNAME", nullable = true, length = 150)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "ISADMIN", nullable = true, length = 15)
    public String getIsadmin() {
        return isadmin;
    }

    public void setIsadmin(String isadmin) {
        this.isadmin = isadmin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return Objects.equals(id, users.id) &&
                Objects.equals(name, users.name) &&
                Objects.equals(password, users.password) &&
                Objects.equals(telephone, users.telephone) &&
                Objects.equals(username, users.username) &&
                Objects.equals(isadmin, users.isadmin);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, password, telephone, username, isadmin);
    }

    @OneToOne(mappedBy = "users")
    public House getHouses() {
        return houses;
    }

    public void setHouses(House houses) {
        this.houses = houses;
    }
}
