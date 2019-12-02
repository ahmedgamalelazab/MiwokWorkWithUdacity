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

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        //creating an array list and initialize this with some numbers
       ArrayList<TotalVocabulary> vocabularyArrayList = new ArrayList<TotalVocabulary>();
       /*
        vocabularies.add("One");
        vocabularies.add("Two");
        vocabularies.add("Three");
        vocabularies.add("Four");
        vocabularies.add("Five");
        vocabularies.add("six");
        vocabularies.add("Seven");
        vocabularies.add("Eight");
        vocabularies.add("Nine");
        vocabularies.add("Ten");
        */
        TotalVocabulary FirstNumber = new TotalVocabulary("One" ,"lutti",R.drawable.number_one);
        TotalVocabulary SecondNumber = new TotalVocabulary("Two" ,"otiiko",R.drawable.number_two);
        TotalVocabulary ThirdNumber = new TotalVocabulary("Three" ,"tolookosu",R.drawable.number_three);
        TotalVocabulary FourNUMBER = new TotalVocabulary("Four" ,"oyyisa",R.drawable.number_four);
        TotalVocabulary FiveNumber = new TotalVocabulary("Five" ,"massokka",R.drawable.number_five);
        TotalVocabulary SixNumber = new TotalVocabulary("Six" ,"temmokka",R.drawable.number_six);
        TotalVocabulary SevenNumber = new TotalVocabulary("Seven" ,"kenekaku",R.drawable.number_seven);
        TotalVocabulary EightNumber = new TotalVocabulary("Eight" ,"kawinta",R.drawable.number_eight);
        TotalVocabulary NineNumber = new TotalVocabulary("Nine" ,"wo’e",R.drawable.number_nine);
        TotalVocabulary TenNumber = new TotalVocabulary("Ten" ,"na’aacha",R.drawable.number_ten);
        //seciton of storing this data in the ARRAYLIST
        vocabularyArrayList.add(FirstNumber);
        vocabularyArrayList.add(SecondNumber);
        vocabularyArrayList.add(ThirdNumber);
        vocabularyArrayList.add(FourNUMBER);
        vocabularyArrayList.add(FiveNumber);
        vocabularyArrayList.add(SixNumber);
        vocabularyArrayList.add(SevenNumber);
        vocabularyArrayList.add(EightNumber);
        vocabularyArrayList.add(NineNumber);
        vocabularyArrayList.add(TenNumber);
        //another way of how to initialize your ArrayList
        //vocabularyArrayList.add(new vocabulary("Ten","na’aacha"));
        //ArrayAdapter<vocabulary> itemsAdapter = new ArrayAdapter<vocabulary>(this, android.R.layout.simple_list_item_1, vocabularies);
        //ArrayAdapter<vocabulary> itemsAdapter = new ArrayAdapter<vocabulary>(this, R.layout.list_item, vocabularies);
        WordAdapter AdapterConnect = new WordAdapter(this, vocabularyArrayList);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(AdapterConnect);

        //LinearLayout RootView = (LinearLayout) findViewById(R.id.BelowRoot);
        /*
        for (int i = 0 ; i < vocabularies.size(); i++){
            TextView WordOne = new TextView(this);
            WordOne.setText(vocabularies.get(i));
            RootView.addView(WordOne);

        };
        */
        /*
        //working with adding this to the text view
        TextView Numbers = (TextView) findViewById(R.id.NumbersList);
        String NumberListReady =""; //initialized already
        for (int i = 0 ; i < vocabularies.size(); i ++){
            NumberListReady = NumberListReady+vocabularies.get(i)+"\n";
        };
        Numbers.setText(NumberListReady);
        */

    }
}
