package br.com.wesley.cestabsica;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bt_cadastrar;
    Button bt_consultar;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.sair) {
            sair();
            return true;
        }

        if (id == R.id.sobre) {
            sobre();
            return true;
        }

        if (id == R.id.contato) {
            contato();
            return true;
        }

        if (id == R.id.compartilhar) {
            compartilhar();
            return true;
        }

        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        bt_cadastrar = (Button) findViewById(R.id.bt_cadastrar);
        bt_consultar = (Button) findViewById(R.id.bt_consultar);

        bt_cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CadastrarActivity.class);
                startActivity(intent);
            }
        });

        bt_consultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent intent = Intent(MainActivity.this);
                finish();
            }
        });
    }

    public void onBackPressed(){
        sair();
    }
    public void sair(){
        new AlertDialog
                .Builder(this)
                .setMessage("Deseja realmente sair?")
                .setCancelable(false)
                .setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        MainActivity.this.finish();
                    }
                })
                .setNegativeButton("Não", null)
                .show();
    }

    public void sobre(){
        String info = getString(R.string.info);
        new AlertDialog
                .Builder(this)
                .setMessage(info)
                .setCancelable(false)
                .setNegativeButton("Ok", null)
                .show();
    }

    public void contato(){
        new AlertDialog
                .Builder(this)
                .setMessage("Deseja contatar o responsável?")
                .setCancelable(false)
                .setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        String tel = "999939079";
                        Intent intentLiga = new Intent();
                        intentLiga.setAction(Intent.ACTION_DIAL);
                        intentLiga.setData(Uri.parse("tel:" + tel));
                        startActivity(intentLiga);
                    }
                })
                .setNegativeButton("Não", null)
                .show();
    }

    public void compartilhar(){
        finish();
    }
}
