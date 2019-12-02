package com.example.android.miwok;

import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<TotalVocabulary> {

    //rewriting the code to let it accept a color
    private int mColor;

    public WordAdapter(AppCompatActivity context, ArrayList<TotalVocabulary> vocabularies) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, vocabularies);
    }

    public WordAdapter(AppCompatActivity contex, ArrayList<TotalVocabulary> vocabularies, int color) {
        super(contex, 0, vocabularies);
        mColor = color;

    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        TotalVocabulary currentAndroidFlavor = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.textOneTranslated);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameTextView.setText(currentAndroidFlavor.GetMiwokTranslate());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.textTwoTranslated);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        numberTextView.setText(currentAndroidFlavor.GetEnglishTranslate());

        //==============================================================================================
        View textContainer = listItemView.findViewById(R.id.textContainers);
        int color = ContextCompat.getColor(getContext(), mColor);
        textContainer.setBackgroundColor(color);
        //==============================================================================================
        ImageView ImageTranslate = (ImageView) listItemView.findViewById(R.id.TranslationImage);

        if (currentAndroidFlavor.HasImage()) {
            ImageTranslate.setImageResource(currentAndroidFlavor.GetDrawbleImage());
            ImageTranslate.setVisibility(View.VISIBLE);

        } else {

            ImageTranslate.setVisibility(View.GONE);


        }

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
