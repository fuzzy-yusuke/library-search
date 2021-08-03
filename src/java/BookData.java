/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.inject.Named;
import javax.enterprise.context.Dependent;

import java.io.Serializable;

@Named(value = "bookData")
@Dependent
public class BookData {
    private String ndc           ="";
    private String tyosya_hyouji ="";
    private String id            ="";
    private String title         ="";
    private String author        ="";
    private String publisher     ="";
    
    public String getNdc(){
        return ndc;
    }
    
    public void setNdc(String ndc){
        this.ndc=ndc;
    }
    public String getTyosya_hyouji(){
        return tyosya_hyouji;
    }
    
    public void setTyosya_hyouji(String tyosya_hyouji){
        this.tyosya_hyouji=tyosya_hyouji;
    }
    public String getId(){
        return id;
    }
    
    public void setId(String id){
        this.id=id;
    }
    public String getTitle(){
        return title;
    }
    
    public void setTitle(String title){
        this.title=title;
    }
    public String getAuthor(){
        return author;
    }
    
    public void setAuthor(String author){
        this.author=author;
    }
    public String getPubliser(){
        return publisher;
    }
    
    public void setPublisher(String publisher){
        this.publisher=publisher;
    }
}
