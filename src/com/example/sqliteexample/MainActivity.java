package com.example.sqliteexample;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        AdminSQLiteOpenHelper ASQLOH = new AdminSQLiteOpenHelper(getApplicationContext());
        
        // Escribimos 4 registros en nuestra tabla
        ASQLOH.insertarContacto(1, "Pedro", 111111111, "pedro@DB.es");
        ASQLOH.insertarContacto(2, "Sandra", 222222222, "sandra@DB.es");
        ASQLOH.insertarContacto(3, "Maria", 333333333, "maria@DB.es");
        ASQLOH.insertarContacto(4, "Daniel", 444444444, "daniel@DB.es");
        
        // Recuperamos los 4 registros y los mostramos en el log
        Log.d("TOTAL", Integer.toString(ASQLOH.recuperarContactos().size()));
        int[] ids = new int[ASQLOH.recuperarContactos().size()];
        String[] noms = new String[ASQLOH.recuperarContactos().size()];
        int[] tlfs = new int[ASQLOH.recuperarContactos().size()];
        String[] emls = new String[ASQLOH.recuperarContactos().size()];
        for (int i = 0; i < ASQLOH.recuperarContactos().size(); i++) {
            ids[i] = ASQLOH.recuperarContactos().get(i).getId();
            noms[i] = ASQLOH.recuperarContactos().get(i).getNombre();
            tlfs[i] = ASQLOH.recuperarContactos().get(i).getTelefono();
            emls[i] = ASQLOH.recuperarContactos().get(i).getEmail();
            Log.d(""+ids[i], noms[i] + ", " + tlfs[i] + ", " + emls[i]);
        }
        
        // Modificamos el registro 3
        ASQLOH.modificarContacto(3, "PPPPP", 121212121, "xxxx@xxxx.es");
        
        // Recuperamos el 3 registro y lo mostramos en el log
        int id = ASQLOH.recuperarContacto(3).getId();
        String nombre = ASQLOH.recuperarContacto(3).getNombre();
        int telefono = ASQLOH.recuperarContacto(3).getTelefono();
        String email = ASQLOH.recuperarContacto(3).getEmail();
        Log.d(""+id, nombre + ", " + telefono + ", " + email);
        
        // Borramos el registro 3
        ASQLOH.borrarContacto(3); 
    }

}
