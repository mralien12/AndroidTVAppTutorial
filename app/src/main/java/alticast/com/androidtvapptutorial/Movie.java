package alticast.com.androidtvapptutorial;

import java.net.URI;
import java.net.URISyntaxException;

/*
 *  Copyright (c) 2018 Alticast Corp.
 *  All rights reserved. http://www.alticast.com/
 *
 *  This software is the confidential and proprietary information of
 *  Alticast Corp. ("Confidential Information"). You shall not
 *  disclose such Confidential Information and shall use it only in
 *  accordance with the terms of the license agreement you entered into
 *  with Alticast.
 */
public class Movie {
    private static final String TAG = Movie.class.getSimpleName();

    static final long serialVersionUID = 1L;
    private long id;
    private String title;
    private String studio;
    private String cardImageUrl;

    public Movie(){
    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getStudio(){
        return studio;
    }

    public void setStudio(String studio){
        this.studio = studio;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }

    public String getCardImageUrl() {
        return cardImageUrl;
    }

    public void setCardImageUrl(String cardImageUrl) {
        this.cardImageUrl = cardImageUrl;
    }

    public URI getCardImageURI(){
        try{
            return new URI(getCardImageUrl());
        } catch (URISyntaxException e) {
            return null;
        }
    }
}
