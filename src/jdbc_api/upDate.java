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
public class upDate implements Serializable{
    
    private String vName;
    private String size;
    private int noAvail;
    private Product product;

    /**
     *
     * @param vName
     * @param size
     * @param noAvail
     * @param product
     */
    public upDate(String vName, String size, int noAvail, Product product) {
        this.vName = vName;
        this.size = size;
        this.noAvail = noAvail;
        this.product = product;
    }

    /**
     *
     * @return
     */
    public String getvName() {
        return vName;
    }

    /**
     *
     * @param vName
     */
    public void setvName(String vName) {
        this.vName = vName;
    }

    /**
     *
     * @return
     */
    public String getSize() {
        return size;
    }

    /**
     *
     * @param size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     *
     * @return
     */
    public int getNoAvail() {
        return noAvail;
    }

    /**
     *
     * @param noAvail
     */
    public void setNoAvail(int noAvail) {
        this.noAvail = noAvail;
    }

    /**
     *
     * @return
     */
    public Product getProduct() {
        return product;
    }

    /**
     *
     * @param product
     */
    public void setProduct(Product product) {
        this.product = product;
    }

        
    
}
