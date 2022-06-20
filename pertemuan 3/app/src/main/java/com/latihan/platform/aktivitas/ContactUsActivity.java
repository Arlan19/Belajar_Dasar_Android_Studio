package com.latihan.platform.aktivitas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ContactUsActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView location, phone, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        location = findViewById(R.id.tv_location);
        phone = findViewById(R.id.tv_phone);
        email = findViewById(R.id.tv_email);

        location.setOnClickListener(this);
        phone.setOnClickListener(this);
        email.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_location:
                Intent loc = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("google.navigation:q=" +location.getText().toString()));
                startActivity(loc);
                break;
            case R.id.tv_email:
                Intent mail = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", email.getText().toString(), null));
                mail.putExtra(Intent.EXTRA_SUBJECT, "Subjek");
                mail.putExtra(Intent.EXTRA_TEXT, "Isi Pesan");
                startActivity(mail);
                break;
            case R.id.tv_phone:
                Intent call = new Intent(Intent.ACTION_DIAL);
                call.setData(Uri.parse("tel:" +phone.getText().toString()));
                startActivity(call);
                break;
        }
    }
}