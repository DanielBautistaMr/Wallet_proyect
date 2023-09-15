package com.danielbautista.walletapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ListAccountActivity extends AppCompatActivity {

    private ArrayList<Account> listAccountRV = new ArrayList<>();
    private RecyclerView myRecycleAccount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_account);
        loadFakeData();

        myRecycleAccount = findViewById(R.id.rv_list_account);
        AccountAdapter myAdaptador = new AccountAdapter(listAccountRV);
        myRecycleAccount.setAdapter(myAdaptador);
        myRecycleAccount.setLayoutManager(new LinearLayoutManager(ListAccountActivity.this));


    }



    private void loadFakeData(){

        Account myAccount1 = new Account("Bancolombia", "Cuenta de Ahorros", 11111111.0, "https://i.pinimg.com/originals/b8/cd/c1/b8cdc1ad498fe080bc21bb5a03c24f83.png");
        Account myAccount2 = new Account("Davivienda", "Cuenta debito", 222222222.0, "https://s3.amazonaws.com/lacabinadavivienda.com/projects/assets_generales/img/logo-davivienda.png")   ;
        Account myAccount3 = new Account("Efectivo", "Efectivo", 333333333.0, "https://cdn-icons-png.flaticon.com/512/2331/2331941.png");
        listAccountRV.add(myAccount1);
        listAccountRV.add(myAccount2);
        listAccountRV.add(myAccount3);


    }
}