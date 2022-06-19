package com.lega.practica10;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.lega.practica10.databinding.ActivityLoginBinding;
import com.lega.practica10.view.PageAdapterOnboarding;

public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding binding;
    private PageAdapterOnboarding pageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        pageAdapter = new PageAdapterOnboarding(this);
        binding.VPA1ContainerPages.setAdapter(pageAdapter);
        binding.VPA1ContainerPages.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);

    }

}