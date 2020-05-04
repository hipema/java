package entornos;

import utilidades.Teclado;

class Usuario {
private String dni = "";
private String nombre = "";
private String apellidos = "";
private String direccion = "";

Usuario() {
}

Usuario(String dni, String nombre, String apellidos, String direccion) {
this.dni = dni;
this.nombre = nombre;
this.apellidos = apellidos;
this.direccion = direccion;
}

public static void main(String[] args) {
char c = 0;
String dni = "";
int NUM_USUARIOS = 3, i;
boolean encontrado = false;

//Se crea el objeto array de Usuario
Usuario [] listaUsuarios = new Usuario[NUM_USUARIOS];

//Se inicializan los 3 elementos del array
listaUsuarios[0] = new Usuario("123", "Nombre1", "Apellidos1", "Mikasa1");
listaUsuarios[1] = new Usuario("456", "Nombre4", "Apellidos4", "Mikasa4");
listaUsuarios[2] = new Usuario("789", "Nombre7", "Apellidos7", "Mikasa7");
System.out.println("Ya están creado los tres objetos:");

do{
System.out.println("Introduce un dni a buscar:");
dni = Teclado.leerCadena();

//Se recorre el array buscando el dni introducido por teclado
for (i = 0; i< NUM_USUARIOS; encontrado = false, i++){

if (dni.equalsIgnoreCase(listaUsuarios[i].getDni())){//coincide

System.out.println(listaUsuarios[i].getDni() + ", " +  listaUsuarios[i].getNombre() + ", " + 
listaUsuarios[i].getApellidos() + ", " +  listaUsuarios[i].getDireccion());
encontrado = true;
break;
}
}//for
if (!encontrado) System.out.println("No se corresponde con ningÃºn usuario. ");

System.out.println("Quieres buscar otro usuario?");
c = Teclado.leerCaracter();
}while ((c == 's') || (c == 'S')); //mientras que el usuario conteste que si
}

String getNombre() {
return nombre;
}
void setNombre(String nombre) {
this.nombre = nombre;
}
String getApellidos() {
return apellidos;
}
public void setApellidos(String apellidos) {
this.apellidos = apellidos;
}
public String getDireccion() {
return direccion;
}
public void setDireccion(String direccion) {
this.direccion = direccion;
}

public String getDni() {
return dni;
}

public void setDni(String dni) {
this.dni = dni;
}

public void muestraEstado(){
System.out.println("(" + dni + ")" + nombre + ", " + apellidos +", " + direccion);
}

}
