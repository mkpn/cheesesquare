/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.template.view.fragment;

import android.app.LauncherActivity;
import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.template.BR;
import com.template.ContentDetailActivity;
import com.template.R;
import com.template.databinding.FragmentListBinding;
import com.template.databinding.ListItemBinding;
import com.template.model.Cheese;
import com.template.model.Cheeses;
import com.template.model.Item;
import com.template.view.adapter.ItemAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MutableListFragment extends Fragment {

    private FragmentListBinding mBinding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_list, container, false);
        return mBinding.recyclerview;
    }

    @Override
    public void onResume() {
        super.onResume();
        setupRecyclerView(mBinding.recyclerview);
    }

    private void setupRecyclerView(RecyclerView recyclerView) {
        ArrayList<Item> itemList = new ArrayList<>();
        for (String sCheeseString : Cheeses.sCheeseStrings) {
            Item item = new Item(sCheeseString, "lastname");
            itemList.add(item);
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(new ItemAdapter(itemList));
    }
}
