package com.kangogo.textextractor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Calendar;

import de.hdodenhof.circleimageview.CircleImageView;

public class AboutActivity extends AppCompatActivity {
    private Button gitBtn, InstaBtn, LinBtn;
    private TextView textView;
    private CircleImageView profileImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        gitBtn = (Button) findViewById(R.id.git_btn);
        InstaBtn = (Button) findViewById(R.id.insta_btn);
        LinBtn = (Button) findViewById(R.id.lin_btn);
        textView = (TextView) findViewById(R.id.copyright_txt);
        profileImage = findViewById(R.id.profile_image);

        profileImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://jkangogo.github.io/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


        // link to my profile portfolio
        gitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://github.com/jkangogo");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        // instagram button
        InstaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://twitter.com/KangogoJoel3");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        // Linkedin button
        LinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.linkedin.com/in/kangogo-joel-a43655199/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        textView.setText("© " + year + ", All rights reserved.");


    }
}
