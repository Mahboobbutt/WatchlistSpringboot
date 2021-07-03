/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.smilinigtech.test;

/**
 *
 * @author marwamunem
 */
public class WatchlistItem {
    
    private Integer id;
    private String  comment;
    private Double  rating;
    private String  title;
    private String  priority;
    private static Integer index = 0;

    public WatchlistItem(String title , Double rating, String priority , String comment) {
        this.id = index++;
        this.comment = comment;
        this.rating = rating;
        this.title = title;
        this.priority = priority;
    }

    public String getComment() {
        return comment;
    }

    public Double getRating() {
        return rating;
    }

    public String getTitle() {
        return title;
    }

    public String getPriority() {
        return priority;
    }

    public static Integer getIndex() {
        return index;
    }
    
    
    
}
