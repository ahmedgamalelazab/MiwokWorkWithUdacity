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

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        ArrayList<vocabulary>Pharsesvoc = new ArrayList<vocabulary>();
        Pharsesvoc.add(new vocabulary("Where are you going ?","minto wuksus ?"));
        Pharsesvoc.add(new vocabulary("What's your name ?","tinnә oyaase'nә ?"));
        Pharsesvoc.add(new vocabulary("My name is ...", "oyaaset..."));
        Pharsesvoc.add(new vocabulary("How are you feeling ?", "michәksәs?"));
        Pharsesvoc.add(new vocabulary("Iam feeling good", "kuchi achit"));
        Pharsesvoc.add(new vocabulary("Are you coming ?", "әәnәs'aa?"));
        Pharsesvoc.add(new vocabulary("Yeah iam coming ", "hәә’ әәnәm"));
        Pharsesvoc.add(new vocabulary(" iam coming ", "әәnәm"));
        Pharsesvoc.add(new vocabulary(" Let's Go ", "yoowutis"));
        Pharsesvoc.add(new vocabulary("come here", "әnni'nem"));

        TemplateAdapter PharsesAdapter = new TemplateAdapter(this , Pharsesvoc);
        ListView listView = (ListView) findViewById(R.id.PharsesList);
        listView.setAdapter(PharsesAdapter);


    }
}
