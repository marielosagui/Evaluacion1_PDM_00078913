package com.example.labo4;
import java.io.Serializable;

import java.util.ArrayList;

public class usuario implements Serializable{

    private String mName;

    private String mEmail;

    private ArrayList<String> mProduct;

    public usuario(){
        this.mProduct = new ArrayList<String>();
        this.mProduct = mProduct;
        for (int i = 0;i<9;i++){
            this.mProduct.add("");
        }

    }

    public usuario (String mName, String mEmail, ArrayList<String> mProduct) {
        this.mProduct = new ArrayList<String>();
        this.mName = mName;
        this.mEmail = mEmail;
        this.mProduct = mProduct;
        for (int i = 0;i<9;i++){
            this.mProduct.add("");
        }
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }

    public ArrayList<String> getmProduct() {
        return mProduct;
    }

    public void setmProduct(ArrayList<String> mProduct) {
        this.mProduct = mProduct;
    }

    public void setmProduct(int index,int ia) {
        mProduct.add(index,Integer.toString(ia));
    }
}
