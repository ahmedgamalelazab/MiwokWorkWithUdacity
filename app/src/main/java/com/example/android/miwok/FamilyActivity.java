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

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        //selecting the way of how we will store our data in !!
        //start with ArrayList
        ArrayList<TotalVocabulary>FamilyVocab = new ArrayList<TotalVocabulary>();

        FamilyVocab.add(new TotalVocabulary("father","әpә",R.drawable.family_father));
        FamilyVocab.add(new TotalVocabulary("mother","әṭa",R.drawable.family_mother));
        FamilyVocab.add(new TotalVocabulary("son","angsi",R.drawable.family_son));
        FamilyVocab.add(new TotalVocabulary("daughter","tune",R.drawable.family_daughter));
        FamilyVocab.add(new TotalVocabulary("older brother","taachi",R.drawable.family_older_brother));
        FamilyVocab.add(new TotalVocabulary("Younger Brother","chalitti",R.drawable.family_younger_brother));
        FamilyVocab.add(new TotalVocabulary("Older Sister","teṭe",R.drawable.family_older_sister));
        FamilyVocab.add(new TotalVocabulary("Younger sister","kolliti",R.drawable.family_younger_sister));
        FamilyVocab.add(new TotalVocabulary("grandmother","ama",R.drawable.family_grandfather));
        FamilyVocab.add(new TotalVocabulary("grandfather","paapa",R.drawable.family_grandfather));


        WordAdapter Familyadapter = new WordAdapter(this, FamilyVocab);
        ListView listview = (ListView) findViewById(R.id.listFamily);
        listview.setAdapter(Familyadapter);



    }
}
