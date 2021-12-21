package Persona;

public class Persona {

private String nombre;
private String Dni;



private static Persona persona;

private Persona()
{
}

public static Persona getPersona()
{
if(persona == null) {
Persona persona = new Persona();
}
return persona;
}



public String getNombre() {
return nombre;
}



public void setNombre(String nombre) {
this.nombre = nombre;
}

public String getDni() {
	return Dni;
}

public void setDni(String dni) {
	Dni = dni;
}



public static void setPersona(Persona persona) {
Persona.persona = persona;
}




}