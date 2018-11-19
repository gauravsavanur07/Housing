/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package housingapp;

/**
 *
 * @author x17114357
 */
public class Renting extends Housing {
    private int min_rent;
    private int max_rent;

    public Renting(int min_rent, int max_rent, String owner, String type, String county, int bedrooms, int bathrooms) {
        super(owner, type, county, bedrooms, bathrooms);
        this.min_rent = min_rent;
        this.max_rent = max_rent;
    }
public Renting(){
    super();
    min_rent=0;
    max_rent=0;
}
    public void setMin_rent(int min_rent) {
        this.min_rent = min_rent;
    }

    public void setMax_rent(int max_rent) {
        this.max_rent = max_rent;
    }
    
    

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }
    
    
    
}
