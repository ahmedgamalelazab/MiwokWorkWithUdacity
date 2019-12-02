package com.example.android.miwok;

public class TotalVocabulary {

    private static final int NOIMG = -1;
    //section of state of this object
    private String DefaultEnglishLanguage;
    private String DefaultMiwokLanguage;
    private int mDrawableImg = NOIMG;
    //end of this section

    //seciton of static memebers


    //section of constructors

    public TotalVocabulary(String English, String Miwok) {
        DefaultEnglishLanguage = English;
        DefaultMiwokLanguage = Miwok;

    }

    public TotalVocabulary(String English, String Miwok, int DrawableId) {

        DefaultEnglishLanguage = English;
        DefaultMiwokLanguage = Miwok;
        mDrawableImg = DrawableId;

    }
    //section of getters and setters

    //starting with getters
    public String GetEnglishTranslate() {

        return DefaultEnglishLanguage;
    }

    public String GetMiwokTranslate() {

        return DefaultMiwokLanguage;
    }

    public int GetDrawbleImage() {
        return mDrawableImg;
    }

    //section of setters

    public void SetEnglishWord(String Word) {
        DefaultEnglishLanguage = Word;
    }

    public void SetMiwokWord(String Word) {
        DefaultMiwokLanguage = Word;
    }

    public void SetDrawableImage(int Image) {
        mDrawableImg = Image;
    }

    public boolean HasImage() {

        return mDrawableImg != NOIMG;
    }

}
