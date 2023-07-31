package com.example.newspaperapi;

import com.example.newspaperapi.Models.NewsHeadlines;

import java.util.List;

public interface OnFetchDataListener {

    void onFetchData(List<NewsHeadlines> list, String message);
    void  onError(String Message);
}
