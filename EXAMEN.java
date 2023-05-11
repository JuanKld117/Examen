
package examen;
//JJLC----@author juanj
import java.util.ArrayList;
import java.util.Scanner;

/*--------
//INSTRUCCIONES//
Con base al digito final de su matricula, realice el siguiente programa, que
pueda leer datos desde el teclado para añadir elementos en la clase. Las clases
deben estar en archivos independientes a su programa y tener sus metodos GET y
SET y cuando menos los metodos sugeridos. Añada la ruta de archivo GIT en un
documento con sus evidencias
(MATRICULA: 71086----EJERCICIO DE "7,6")(11/05/2023)
---------*/
public class EXAMEN {
    
    private int ID;
    private String Nombre;
    private double Latitud, Longitud;
    private int Municipio, Distrito, Seccion, Listado, Votantes;
    
    public EXAMEN() {
        
    }
    
    public EXAMEN(int ID, String Nombre, double Latitud, double Longitud, int Municipio, int Distrito, int Seccion, int Listado, int Votantes) {
	this.ID = ID;
	this.Nombre = Nombre;
	this.Latitud = Latitud;
	this.Longitud = Longitud;
	this.Municipio = Municipio;
	this.Distrito = Distrito;
	this.Seccion = Seccion;
	this.Listado = Listado;
	this.Votantes = Votantes;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
	return Nombre;
    }

    public void setNombre(String Nombre) {
	this.Nombre = Nombre;
    }

    public double getLatitud() {
	return Latitud;
    }

    public void setLatitud(double Latitud) {
	this.Latitud = Latitud;
    }

    public double getLongitud() {
	return Longitud;
    }

    public void setLongitud(double Longitud) {
	this.Longitud = Longitud;
    }

    public int getMunicipio() {
	return Municipio;
    }

    public void setMunicipio(int Municipio) {
	this.Municipio = Municipio;
    }
	
    public int getDistrito() {
        return Distrito;
    }
	
    public void setDistrito(int Distrito) {
	    this.Distrito = Distrito;
    }
	
    public int getSeccion() {
	return Seccion;
    }
	
    public void setSeccion(int Seccion) {
        this.Seccion = Seccion;
    }
	
    public int getListado() {
	return Listado;
    }
	
    public void setListado(int Listado) {
	this.Listado = Listado;
    }
	
    public int getVotantes() {
	return Votantes;
    }
	
    public void setVotantes(int Votantes) {
	this.Votantes = Votantes;
    }

    @Override
    public String toString() {
    return "Constructor{ " + "ID=" + ID + "Nombre=" + Nombre + "Latitud=" + Latitud + "Longitud=" + Longitud + "Municipio= " + Municipio + "Distrito= " + Distrito + "Seccion= " + Seccion + "Listado= "+ Listado + "Votantes= " + Votantes + '}';
    }
    
    public static void main(String[] args) {
	ArrayList<EXAMEN> Casillas = new ArrayList<EXAMEN>();
	Scanner Console = new Scanner (System.in);
	Casillas.add(new EXAMEN(1, "Escuela Justo Sierra Mendez", 19.844, 90.535, 1, 1, 1, 700, 600));
	Casillas.add(new EXAMEN(2, "Escuela Francisco I. Madero", 19.844, 90.535, 2, 2, 2, 700, 600));
        int MainID = Console.nextInt();
	String MainNombre = Casillas.get(MainID).getNombre();
	double MainLatitud = Casillas.get(MainID).getLatitud();
	double MainLongitud = Casillas.get(MainID).getLongitud();
	int MainMunicipio = Casillas.get(MainID).getMunicipio();
	int MainDistrito = Casillas.get(MainID).getDistrito();
	int MainSeccion = Casillas.get(MainID).getSeccion();
        int MainListado = Casillas.get(MainID).getSeccion();
        int MainVotantes = Casillas.get(MainID).getVotantes();
	float PorcentajeParticipacion = (MainVotantes)* (MainVotantes / MainListado) * 100;
        float PorcentajeAbstinencia = (100 / MainListado) * 100;
        int Faltantes = MainListado - MainVotantes;
        System.out.println(Casillas.toString());
        
        //Agregar nuevos datos
        System.out.println("Nuevo ID");
        MainID = Console.nextInt();
        System.out.println("Nuevo nombre");
        MainNombre = Console.next();
        MainNombre = Console.nextLine();
        System.out.println("Nueva latitud");
        MainLatitud = Console.nextDouble();
        System.out.println("Nueva longitud");
        MainLongitud = Console.nextDouble();
        MainMunicipio = Console.nextInt();
        MainDistrito = Console.nextInt();
        MainSeccion = Console.nextInt();
        MainListado = Console.nextInt();
        MainVotantes = Console.nextInt();
        Casillas.add(new EXAMEN(MainID, MainNombre, MainLatitud, MainLongitud, MainMunicipio, MainDistrito, MainSeccion, MainListado, MainVotantes));
        PorcentajeParticipacion = (MainVotantes)* (MainVotantes / MainListado) * 100;
        PorcentajeAbstinencia = (100 / MainListado) * 100;
        Faltantes = MainListado - MainVotantes;
        System.out.println(Casillas.toString());
	}
}
