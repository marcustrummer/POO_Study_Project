import java.util.Date;

public class Product {

    private long id;

    private long code;

    private String name;

    private String descríption;

    private String supplier;

    private Date dateOfProductCreation;












    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescríption() {
        return descríption;
    }

    public void setDescríption(String descríption) {
        this.descríption = descríption;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public Date getDateOfProductCreation() {
        return dateOfProductCreation;
    }

    public void setDateOfProductCreation(Date dateOfProductCreation) {
        this.dateOfProductCreation = dateOfProductCreation;
    }
}


