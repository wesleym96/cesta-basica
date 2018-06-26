package br.com.wesley.cestabsica;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CadastrarActivity extends AppCompatActivity {

    FloatingActionButton fab_add;
    Button bt_fim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar);

        fab_add = (FloatingActionButton) findViewById(R.id.fab_add);
        fab_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CadastrarActivity.this, ProdutoActivity.class);
                startActivity(intent);
            }
        });

        bt_fim = (Button) findViewById(R.id.bt_fim);
        bt_fim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
