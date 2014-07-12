package com.example.sqliteexample;

public class Contactos {

	 private int id;
	    private String nombre;
	    private int telefono;
	    private String email;
	 
	    public Contactos(int id, String nombre, int telefono, String email) {
	        this.id = id;
	        this.nombre = nombre;
	        this.telefono = telefono;
	        this.email = email;
	    }

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getTelefono() {
			return telefono;
		}

		public void setTelefono(int telefono) {
			this.telefono = telefono;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
	 
	    
}
