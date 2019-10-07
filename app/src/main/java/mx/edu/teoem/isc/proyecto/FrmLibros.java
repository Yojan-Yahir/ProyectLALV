package mx.edu.teoem.isc.proyecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FrmLibros extends AppCompatActivity implements View.OnClickListener {
    Button button21, button22,button27, button28, button29, button30, button31, button34;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_libros);
        button21=(Button)findViewById(R.id.button21);
        button21.setOnClickListener(this);

        button22=(Button)findViewById(R.id.button22);
        button22.setOnClickListener(this);

        button27=(Button)findViewById(R.id.button27);
        button27.setOnClickListener(this);

        button28=(Button)findViewById(R.id.button28);
        button28.setOnClickListener(this);

        button29=(Button)findViewById(R.id.button29);
        button29.setOnClickListener(this);

        button30=(Button)findViewById(R.id.button30);
        button30.setOnClickListener(this);

        button31=(Button)findViewById(R.id.button31);
        button31.setOnClickListener(this);

        button34=(Button)findViewById(R.id.button34);
        button34.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button21:
                Intent Frml1 = new Intent(this, Frml1.class);
                startActivity(Frml1);
                finish();
             break;

            case R.id.button22:
                Intent Frml2 = new Intent(this, Frml2.class);
                startActivity(Frml2);
                finish();
                break;

            case R.id.button27:
                Intent Frml3 = new Intent(this, Frml3.class);
                startActivity(Frml3);
                finish();
                break;

            case R.id.button28:
                Intent Frml4 = new Intent(this, Frml4.class);
                startActivity(Frml4);
                finish();
                break;

            case R.id.button29:
                Intent Frml6 = new Intent(this, Frml6.class);
                startActivity(Frml6);
                finish();
                break;

            case R.id.button30:
                Intent Frml5 = new Intent(this, Frml5.class);
                startActivity(Frml5);
                finish();
                break;

            case R.id.button31:
                Intent Frml7 = new Intent(this, Frml7.class);
                startActivity(Frml7);
                finish();
                break;

            case R.id.button34:
                Intent Frminfo = new Intent(this, Frminfo.class);
                startActivity(Frminfo);
                finish();
                break;
        }
    }
}
