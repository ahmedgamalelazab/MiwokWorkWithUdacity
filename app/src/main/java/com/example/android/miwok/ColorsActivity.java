/*
 * Copyright (C) 2016 The Android Open Source Project
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
package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        //selectin the way of storing data
        ArrayList<TotalVocabulary>ColorsList = new ArrayList<TotalVocabulary>();

        ColorsList.add(new TotalVocabulary("Red","weṭeṭṭi",R.drawable.color_red));
        ColorsList.add(new TotalVocabulary("Green","chokokki",R.drawable.color_green));
        ColorsList.add(new TotalVocabulary("brown","ṭakaakki",R.drawable.color_brown));
        ColorsList.add(new TotalVocabulary("Grey","ṭopoppi",R.drawable.color_gray));
        ColorsList.add(new TotalVocabulary("black","kululli",R.drawable.color_black));
        ColorsList.add(new TotalVocabulary("White","kelelli",R.drawable.color_white));
        ColorsList.add(new TotalVocabulary("Dusty Yellow","ṭopiisә",R.drawable.color_dusty_yellow));
        ColorsList.add(new TotalVocabulary("Mustard Yellow","chiwiiṭә",R.drawable.color_mustard_yellow));

        WordAdapter ColorsAdapter = new WordAdapter(this  , ColorsList);


        ListView listView  = (ListView) findViewById(R.id.ColorsLit);
        listView.setAdapter(ColorsAdapter);




    }
}
