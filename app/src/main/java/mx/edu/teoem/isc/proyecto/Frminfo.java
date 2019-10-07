package mx.edu.teoem.isc.proyecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Frminfo extends AppCompatActivity implements View.OnClickListener  {
    Button buttonX;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frminfo);
        buttonX=(Button)findViewById(R.id.buttonX);
        buttonX.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent FrmLibros=new Intent(this,FrmLibros.class);
        startActivity(FrmLibros);
        finish();
    }
}
