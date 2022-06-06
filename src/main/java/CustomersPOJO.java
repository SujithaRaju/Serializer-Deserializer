import org.apache.juneau.annotation.Beanc;

import java.util.*;

public class CustomersPOJO {

    private String branch;
    private String customer_First_Name;
    private String customer_Last_Name;

   private List<String> customer_Details;

   @Beanc(properties = "branch,customer_First_Name,customer_Last_Name,customer_Details")
    public CustomersPOJO(String branch, String customer_First_Name, String customer_Last_Name, List<String> customer_Details) {
        this.branch = branch;
        this.customer_First_Name = customer_First_Name;
        this.customer_Last_Name = customer_Last_Name;
        this.customer_Details = customer_Details;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setCustomer_First_Name(String customer_First_Name) {
        this.customer_First_Name = customer_First_Name;
    }

    public void setCustomer_Last_Name(String customer_Last_Name) {
        this.customer_Last_Name = customer_Last_Name;
    }

    public void setCustomer_Details(List<String> customer_Details) {
        this.customer_Details = customer_Details;
    }

    public String getBranch() {
        return branch;
    }

    public String getCustomer_First_Name() {
        return customer_First_Name;
    }

    public String getCustomer_Last_Name() {
        return customer_Last_Name;
    }

    public List<String> getCustomer_Details() {
        return customer_Details;
    }

    @Override
    public String toString() {
        return "CustomersPOJO{" +
                "branch='" + branch + '\'' +
                ", customer_First_Name='" + customer_First_Name + '\'' +
                ", customer_Last_Name='" + customer_Last_Name + '\'' +
                ", customer_Details=" + customer_Details +
                '}';
    }
}

