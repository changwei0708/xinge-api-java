package com.tencent.xinge.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Alert {

    @JsonProperty(value = "title",required = true)
    private String title;

    @JsonProperty(value ="body", required = true)
    private String body;

    @JsonProperty(value ="title-loc-key")
    private String title_loc_key;

    @JsonProperty(value ="title-loc-args")
    private ArrayList<String> title_loc_args;

    @JsonProperty(value ="loc-key" )
    private String loc_key;

    @JsonProperty(value ="loc-args")
    private ArrayList<String> loc_args;

    @JsonProperty(value ="launch-image")
    private String launch_image;

    public String getTitle_loc_key() {
        return title_loc_key;
    }

    public void setTitle_loc_key(String title_loc_key) {
        this.title_loc_key = title_loc_key;
    }

    public ArrayList<String> getTitle_loc_args() {
        return title_loc_args;
    }

    public void setTitle_loc_args(ArrayList<String> title_loc_args) {
        this.title_loc_args = title_loc_args;
    }

    public String getLoc_key() {
        return loc_key;
    }

    public void setLoc_key(String loc_key) {
        this.loc_key = loc_key;
    }

    public ArrayList<String> getLoc_args() {
        return loc_args;
    }

    public void setLoc_args(ArrayList<String> loc_args) {
        this.loc_args = loc_args;
    }

    public String getLaunch_image() {
        return launch_image;
    }

    public void setLaunch_image(String launch_image) {
        this.launch_image = launch_image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }


}
