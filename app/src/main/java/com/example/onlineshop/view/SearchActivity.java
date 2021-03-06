package com.example.onlineshop.view;

import androidx.fragment.app.Fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class SearchActivity extends SingleFragmentActivity {

    @Override
    public Fragment createFragment() {
        return SearchFragment.newInstance();
    }

    public static Intent newIntent(Context context){
        Intent intent = new Intent(context , SearchActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        return intent;
    }

}
