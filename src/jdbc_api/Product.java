/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc_api;

import java.io.*;
/**
 *
 * @author HP
 */
public class Product implements Serializable{
    
    private String bName;
    private String nameOfProduct;

    /**
     *
     * @param bName
     * @param nameOfProduct
     */
    public Product(String bName, String nameOfProduct) {
        this.bName = bName;
        this.nameOfProduct = nameOfProduct;
    }
    
    /**
     *
     * @param product
     * @return
     */
    public boolean equals(Product product){
        if(this.bName == product.bName && this.nameOfProduct.equals(product.nameOfProduct)){
            return true;
        }else{
            return false;
        }
    }

    /**
     *
     * @return
     */
    public String getbName() {
        return bName;
    }

    /**
     *
     * @param bName
     */
    public void setbName(String bName) {
        this.bName = bName;
    }

    /**
     *
     * @return
     */
    public String getNameOfProduct() {
        return nameOfProduct;
    }

    /**
     *
     * @param nameOfProduct
     */
    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }


    
}
