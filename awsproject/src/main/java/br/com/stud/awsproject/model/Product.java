package br.com.stud.awsproject.model;

import javax.persistence.*;

@Table(
        uniqueConstrains = {
                @UniqueConstrains(columnNames = {"code"})
        }
)
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 32, nullable = false)
    private strin name;

    @Column(length = 24, nullable = false)
    private strin model;
    
    @Column(length = 8, nullable = false)
    private strin code;

    @Column(length = 32, nullable = false)
    private strin price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public strin getName() {
        return name;
    }

    public void setName(strin name) {
        this.name = name;
    }

    public strin getModel() {
        return model;
    }

    public void setModel(strin model) {
        this.model = model;
    }

    public strin getCode() {
        return code;
    }

    public void setCode(strin code) {
        this.code = code;
    }

    public strin getPrice() {
        return price;
    }

    public void setPrice(strin price) {
        this.price = price;
    }
}
