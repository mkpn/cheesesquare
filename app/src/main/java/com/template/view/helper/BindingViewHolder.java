package com.template.view.helper;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by makoto on 2015/11/27.
 */

class BindingHolder extends RecyclerView.ViewHolder {
    private ViewDataBinding binding;

    public BindingHolder(View rowView) {
        super(rowView);
        binding = DataBindingUtil.bind(rowView);
    }
    public ViewDataBinding getBinding() {
        return binding;
    }
}