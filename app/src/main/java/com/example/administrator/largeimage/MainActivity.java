package com.example.administrator.largeimage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity
{
    private LargeImageView mLargeImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLargeImageView = (LargeImageView) findViewById(R.id.id_largetImageview);
        try
        {
            InputStream inputStream = getAssets().open("qm.jpg");
            mLargeImageView.setInputStream(inputStream);

        } catch (IOException e)
        {
            e.printStackTrace();
        }


    }

}
