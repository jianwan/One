package com.example.dell_user.one.gson.home.TimeGraphicInformation;

import com.example.dell_user.one.gson.home.IdGraphicInformation.Share_list;
import com.google.gson.annotations.SerializedName;

/**
 * Created by wanjian on 2017/2/20.
 */

//TimeGraphicInformation(根据年月份获取图文详细信息列表)中的Data_TimeGraphicInformation数组，
// 备注：hpcontent_id为id，hp_title为图片左下角文字，author_id为作者id，hp_img_url为图片地址，
// hp_author为图片右下角文字，hp_content为文本，hp_makettime、last_update_date为时间，格式2016-10-25 21:00:00
// praisenum为点赞数，sharenum为分享数，commentnum为评论数

public class Data_TimeGraphicInformation {

    @SerializedName("hpcontent_id")
    private String hpcontent_id;

    @SerializedName("hp_title")
    private String hp_title;

    @SerializedName("author_id")
    private String author_id;

    @SerializedName("hp_img_url")
    private String hp_img_url;

    @SerializedName("hp_img_original_url")
    private String hp_img_original_url;

    @SerializedName("hp_author")
    private String hp_author;

    @SerializedName("ipad_url")
    private String ipad_url;

    @SerializedName("hp_content")
    private String hp_content;

    @SerializedName("hp_makettime")
    private String hp_makettime;

    @SerializedName("hide_flag")
    private String hide_flag;

    @SerializedName("last_update_date")
    private String last_update_date;

    @SerializedName("web_url")
    private String web_url;

    @SerializedName("wb_img_url")
    private String wb_img_url;

    @SerializedName("image_authors")
    private String image_authors;

    @SerializedName("text_authors")
    private String text_authors;

    @SerializedName("image_from")
    private String image_from;

    @SerializedName("text_from")
    private String text_from;

    @SerializedName("content_bgcolor")
    private String content_bgcolor;

    @SerializedName("template_category")
    private String template_category;

    @SerializedName("maketime")
    private String maketime;

    @SerializedName("share_list")
    private Share_list share_list;

    @SerializedName("praisenum")
    private int praisenum;

    @SerializedName("sharenum")
    private int sharenum;

    @SerializedName("commentnum")
    private int commentnum;



    public void setHpcontent_id(String hpcontent_id){
        this.hpcontent_id = hpcontent_id;
    }
    public String getHpcontent_id(){
        return this.hpcontent_id;
    }

    public void setHp_title(String hp_title){
        this.hp_title = hp_title;
    }
    public String getHp_title(){
        return this.hp_title;
    }

    public void setAuthor_id(String author_id){
        this.author_id = author_id;
    }
    public String getAuthor_id(){
        return this.author_id;
    }

    public void setHp_img_url(String hp_img_url){
        this.hp_img_url = hp_img_url;
    }
    public String getHp_img_url(){
        return this.hp_img_url;
    }

    public void setHp_img_original_url(String hp_img_original_url){
        this.hp_img_original_url = hp_img_original_url;
    }
    public String getHp_img_original_url(){
        return this.hp_img_original_url;
    }

    public void setHp_author(String hp_author){
        this.hp_author = hp_author;
    }
    public String getHp_author(){
        return this.hp_author;
    }

    public void setIpad_url(String ipad_url){
        this.ipad_url = ipad_url;
    }
    public String getIpad_url(){
        return this.ipad_url;
    }

    public void setHp_content(String hp_content){
        this.hp_content = hp_content;
    }
    public String getHp_content(){
        return this.hp_content;
    }

    public void setHp_makettime(String hp_makettime){
        this.hp_makettime = hp_makettime;
    }
    public String getHp_makettime(){
        return this.hp_makettime;
    }

    public void setHide_flag(String hide_flag){
        this.hide_flag = hide_flag;
    }
    public String getHide_flag(){
        return this.hide_flag;
    }

    public void setLast_update_date(String last_update_date){
        this.last_update_date = last_update_date;
    }
    public String getLast_update_date(){
        return this.last_update_date;
    }

    public void setWeb_url(String web_url){
        this.web_url = web_url;
    }
    public String getWeb_url(){
        return this.web_url;
    }

    public void setWb_img_url(String wb_img_url){
        this.wb_img_url = wb_img_url;
    }
    public String getWb_img_url(){
        return this.wb_img_url;
    }

    public void setImage_authors(String image_authors){
        this.image_authors = image_authors;
    }
    public String getImage_authors(){
        return this.image_authors;
    }

    public void setText_authors(String text_authors){
        this.text_authors = text_authors;
    }
    public String getText_authors(){
        return this.text_authors;
    }

    public void setImage_from(String image_from){
        this.image_from = image_from;
    }
    public String getImage_from(){
        return this.image_from;
    }

    public void setText_from(String text_from){
        this.text_from = text_from;
    }
    public String getText_from(){
        return this.text_from;
    }

    public void setContent_bgcolor(String content_bgcolor){
        this.content_bgcolor = content_bgcolor;
    }
    public String getContent_bgcolor(){
        return this.content_bgcolor;
    }

    public void setTemplate_category(String template_category){
        this.template_category = template_category;
    }
    public String getTemplate_category(){
        return this.template_category;
    }

    public void setMaketime(String maketime){
        this.maketime = maketime;
    }
    public String getMaketime(){
        return this.maketime;
    }

    public void setShare_list(Share_list share_list){
        this.share_list = share_list;
    }
    public Share_list getShare_list(){
        return this.share_list;
    }

    public void setPraisenum(int praisenum){
        this.praisenum = praisenum;
    }
    public int getPraisenum(){
        return this.praisenum;
    }

    public void setSharenum(int sharenum){
        this.sharenum = sharenum;
    }
    public int getSharenum(){
        return this.sharenum;
    }

    public void setCommentnum(int commentnum){
        this.commentnum = commentnum;
    }
    public int getCommentnum(){
        return this.commentnum;
    }

}
