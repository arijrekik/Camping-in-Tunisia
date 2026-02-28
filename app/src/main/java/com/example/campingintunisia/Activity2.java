package com.example.campingintunisia;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.app.AlertDialog;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    ImageView img1,img2,img3,img4,img5,img6,img7,img8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        img1 = findViewById(R.id.imageView1);
        img2 = findViewById(R.id.imageView2);
        img3 = findViewById(R.id.imageView3);
        img4 = findViewById(R.id.imageView4);
        img5 = findViewById(R.id.imageView5);
        img6 = findViewById(R.id.imageView6);
        img7 = findViewById(R.id.imageView7);
        img8 = findViewById(R.id.imageView8);

        img1.setOnClickListener(v -> showDialog(R.drawable.c01, "View 1"));
        img2.setOnClickListener(v -> showDialog(R.drawable.c02, "View 2"));
        img3.setOnClickListener(v -> showDialog(R.drawable.c03, "View 3"));
        img4.setOnClickListener(v -> showDialog(R.drawable.c04, "View 4"));
        img5.setOnClickListener(v -> showDialog(R.drawable.c05, "View 5"));
        img6.setOnClickListener(v -> showDialog(R.drawable.c06, "View 6"));
        img7.setOnClickListener(v -> showDialog(R.drawable.c07, "View 7"));
        img8.setOnClickListener(v -> showDialog(R.drawable.c08, "View 8"));
    }
    private void showDialog(int imageResId, String titleText) {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        View dialogView = getLayoutInflater().inflate(R.layout.image_display, null);

        ImageView dialogImage = dialogView.findViewById(R.id.dialogImage);
        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);

        dialogImage.setImageResource(imageResId);
        dialogTitle.setText(titleText);

        builder.setView(dialogView);
        builder.setPositiveButton("Exit", (dialog, which) -> dialog.dismiss());

        builder.show();
    }

    public void previousScreen(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void close(View view) {
        finish();
    }
}