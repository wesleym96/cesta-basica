package br.com.wesley.cestabsica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class ProdutoActivity extends AppCompatActivity {

    Button bt_adicionar;
    Button bt_cancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto);

        bt_adicionar = (Button) findViewById(R.id.bt_adicionar);
        bt_cancelar = (Button) findViewById(R.id.bt_cancelar);

        bt_cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}