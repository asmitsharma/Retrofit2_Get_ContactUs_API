package com.example.contacturbanghats;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ApiClient.getAPICall().contact()
                .enqueue(new Callback<Contact>() {
                    @Override
                    public void onResponse(Call<Contact> call, Response<Contact> response) {
                        Log.e("MainActivity", "Api Call: "+call.request());
                        Log.e("MainActivity", "Success Response: "+response.body().toString());
                        Log.e("MainActivity", "Success: "+response.body().getMessage());
                        Toast.makeText(MainActivity.this, ""+response.body().getLocationList().getMobileNo(), Toast.LENGTH_SHORT).show();
                        tv1 = findViewById(R.id.tv1);
                        tv1.setText(response.body().getLocationList().getAddress());
                    }

                    @Override
                    public void onFailure(Call<Contact> call, Throwable t) {
                        Log.e("MainActivity", "onFailure: "+t.getLocalizedMessage() );
                    }
                });
    }




}
