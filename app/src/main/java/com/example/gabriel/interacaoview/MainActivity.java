package com.example.gabriel.interacaoview;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edtTexto;
    private TextView txtInicial;
    private Button btnClicar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        edtTexto = (EditText)findViewById(R.id.edtTexto);
        txtInicial = (TextView)findViewById(R.id.txtInicial);
        btnClicar = (Button)findViewById(R.id.btnClicar);

        btnClicar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        txtInicial.setText(edtTexto.getText().toString());
    }
}
