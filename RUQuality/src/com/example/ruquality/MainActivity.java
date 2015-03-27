package com.example.ruquality;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void imagen(View view){
		
		Toast.makeText(this, "Botao Avaliar Clicado", Toast.LENGTH_LONG).show();
	}
	public void imagen2(View view){
		
		Toast.makeText(this, "Botao Visualize Estatistica de Qualidade Clicado", Toast.LENGTH_LONG).show();
	}
	public void imagen3(View view){
		
		Toast.makeText(this, "Botao Compare Resultados Clicado", Toast.LENGTH_LONG).show();
	}
	public void imagen4(View view){
		
		Toast.makeText(this, "Botao Seus Creditos Clicado", Toast.LENGTH_LONG).show();
	}
	
	
}
