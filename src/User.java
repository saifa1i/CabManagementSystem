/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saifali
 */
class User {
    private String Source,Destination,Time;
    private int Offerdays;
    
    public User(String Source,String Destination,String Time,int Offerdays){
    this.Offerdays= Offerdays;
    this.Destination = Destination;
    this.Source = Source;
    this.Time=Time;
    }
    
    public int getOfferdays(){
    return Offerdays;
    }
    
    public String getSource(){
    return Source;
    }
    
    public String getDestination(){
    return Destination;
    }
    public String getTime(){
    return Time;
    }
}
