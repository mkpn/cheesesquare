package com.template.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by makoto on 2015/11/18.
 */
public class Content extends BaseObservable {

    private String mFirstName;

    private String mLastName;

    public Content(String firstName, String lastName) {
        mFirstName = firstName;
        mLastName = lastName;
    }

    // getterにはBindableアノテーションを付ける
    @Bindable
    public String getFirstName() {
        return mFirstName;
    }

    @Bindable
    public String getLastName() {
        return mLastName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;

        // setterで、値が変わったことを通知する
        // BR.〇〇 は @Bindable を付けたgetterに依存している
//        notifyPropertyChanged(jp.eno314.databindingdemo.BR.firstName);
    }

    public void setLastName(String lastName) {
        mLastName = lastName;
//        notifyPropertyChanged(jp.eno314.databindingdemo.BR.lastName);
    }
}