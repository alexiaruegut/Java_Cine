package view.console;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import model.*;

/**
 *
 * @author paucanmil, alexiaruegut
 */
public class Main {

    public static Scanner sc = new Scanner(System.in);
    private static ArrayList<Cine> cines = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Alexia Rueda Gutierrez y Pau Cano Millan | 2DAW | CINE");

        int opcion;
        do {
            System.out.println("\n=== Menú Principal ===");
            System.out.println("1. Crear Cine");
            System.out.println("2. Agregar Sala");
            System.out.println("3. Agregar Película a Sala");
            System.out.println("4. Agregar Sesión a Película");
            System.out.println("5. Ver Plano de Sala");
            System.out.println("6. Comprar Entrada");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = leerEntero();
            switch (opcion) {
                case 1 ->
                    crearCine();
                case 2 ->
                    agregarSala();
                case 3 ->
                    agregarPeliculaSala();
                case 4 ->
                    agregarSesionPelicula();
                case 5 ->
                    verPlanoSala();
                case 6 ->
                    comprarEntrada();
                case 0 ->
                    System.out.println("Saliendo del programa.");
                default ->
                    System.out.println("Opción inválida, intenta de nuevo.");
            }
        } while (opcion != 0);
    }

    private static int leerEntero() {
        while (true) {
            try {
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.print("Entrada inválida. Por favor, introduce un número: ");
                sc.next();
            }
        }
    }

    private static int seleccionarCine() {
        if (cines.isEmpty()) {
            System.out.println("Primero debes crear un cine.");
            return -1;
        }

        System.out.println("Selecciona el cine:");
        for (int i = 0; i < cines.size(); i++) {
            System.out.println((i + 1) + ". " + cines.get(i).getNombre() + " - " + cines.get(i).getUbicacion());
        }
        int id = leerEntero() - 1;
        sc.nextLine();

        if (id >= 0 && id < cines.size()) {
            return id;
        } else {
            System.out.println("Índice de cine no válido.");
            return -1;
        }
    }

    private static void crearCine() {
        System.out.print("Introduce el nombre del cine: ");
        String nombre = sc.next();
        while (nombre.trim().isEmpty()) {
            System.out.print("Nombre inválido. Introduce el nombre del cine: ");
            nombre = sc.next();
        }

        System.out.print("Introduce la ubicación del cine: ");
        String ubicacion = sc.next();
        while (ubicacion.trim().isEmpty()) {
            System.out.print("Ubicación inválida. Introduce la ubicación del cine: ");
            ubicacion = sc.next();
        }

        System.out.print("Introduce el número total de salas: ");
        int totalSalas = leerEntero();
        while (totalSalas <= 0) {
            System.out.print("Número de salas inválido. Introduce el número total de salas: ");
            totalSalas = leerEntero();
        }

        System.out.print("Introduce el precio base de las entradas: ");
        int precioBase = leerEntero();
        while (precioBase <= 0) {
            System.out.print("Precio base inválido. Introduce el precio base de las entradas: ");
            precioBase = leerEntero();
        }

        cines.add(new Cine(nombre, ubicacion, totalSalas, precioBase, new ArrayList<>()));
        System.out.println("Cine creado con éxito.");
    }

    private static void agregarSala() {
        int idCine = seleccionarCine();
        if (idCine == -1) {
            return;
        }

        Cine cine = cines.get(idCine);

        if (cine.getSalas().size() >= cine.getTotalSalas()) {
            System.out.println("No se pueden agregar más salas. El cine ya tiene el número máximo de salas.");
            return;
        }

        System.out.println("Tipos de sala disponibles: ");
        enumTipoSala[] tiposSala = enumTipoSala.values();
        for (int i = 0; i < tiposSala.length; i++) {
            System.out.println((i + 1) + ". " + tiposSala[i]);
        }

        int tipoSalaIndex = -1;
        while (tipoSalaIndex < 0 || tipoSalaIndex >= tiposSala.length) {
            System.out.print("Selecciona un tipo de sala: ");
            tipoSalaIndex = leerEntero() - 1;
            sc.nextLine();
            if (tipoSalaIndex < 0 || tipoSalaIndex >= tiposSala.length) {
                System.out.println("Tipo de sala no válido.");
            }
        }

        enumTipoSala tipoSala = tiposSala[tipoSalaIndex];
        Sala sala = new Sala(tipoSala);
        cine.getSalas().add(sala);
        System.out.println("Sala añadida al cine.");
    }

    private static void agregarPeliculaSala() {
        int idCine = seleccionarCine();
        if (idCine == -1) {
            return;
        }

        Cine cine = cines.get(idCine);

        if (cine.getSalas().isEmpty()) {
            System.out.println("No hay salas disponibles en el cine.");
            return;
        }

        System.out.println("Selecciona una sala:");
        for (int i = 0; i < cine.getSalas().size(); i++) {
            System.out.println((i + 1) + ". " + cine.getSalas().get(i).getTipoSala());
        }

        int salaIndex = leerEntero() - 1;
        sc.nextLine();

        if (salaIndex >= 0 && salaIndex < cine.getSalas().size()) {
            Sala sala = cine.getSalas().get(salaIndex);

            System.out.print("Introduce el título de la película: ");
            String titulo = sc.next();
            while (titulo.trim().isEmpty()) {
                System.out.print("Título inválido. Introduce el título de la película: ");
                titulo = sc.next();
            }

            System.out.print("Introduce la duración de la película (en minutos): ");
            int duracion = leerEntero();
            while (duracion <= 0) {
                System.out.print("Duración inválida. Introduce la duración de la película (en minutos): ");
                duracion = leerEntero();
            }
            sc.nextLine();

            System.out.print("Introduce el idioma de la película: ");
            String idioma = sc.next();
            while (idioma.trim().isEmpty()) {
                System.out.print("Idioma inválido. Introduce el idioma de la película: ");
                idioma = sc.next();
            }

            System.out.print("Introduce la descripción de la película: ");
            String descripcion = sc.next();
            while (descripcion.trim().isEmpty()) {
                System.out.print("Descripción inválida. Introduce la descripción de la película: ");
                descripcion = sc.next();
            }

            Pelicula pelicula = new Pelicula(titulo, duracion, idioma, descripcion);

            sala.getPeliculas().add(pelicula);
            System.out.println("Película agregada a la sala.");
        } else {
            System.out.println("Sala no válida.");
        }
    }

    private static void agregarSesionPelicula() {
        int idCine = seleccionarCine();
        if (idCine == -1) {
            return;
        }

        Cine cine = cines.get(idCine);

        if (cine.getSalas().isEmpty()) {
            System.out.println("No hay salas disponibles en el cine.");
            return;
        }

        System.out.println("Selecciona una película:");
        ArrayList<Pelicula> peliculas = new ArrayList<>();
        for (Sala sala : cine.getSalas()) {
            peliculas.addAll(sala.getPeliculas());
        }
        if (peliculas.isEmpty()) {
            System.out.println("No hay películas disponibles en este cine.");
            return;
        }
        for (int i = 0; i < peliculas.size(); i++) {
            System.out.println((i + 1) + ". " + peliculas.get(i).getTitulo());
        }

        int peliculaIndex = leerEntero() - 1;
        sc.nextLine();

        if (peliculaIndex >= 0 && peliculaIndex < peliculas.size()) {
            Pelicula pelicula = peliculas.get(peliculaIndex);

            Sala sala = null;
            for (Sala s : cine.getSalas()) {
                if (s.getPeliculas().contains(pelicula)) {
                    sala = s;
                    break;
                }
            }

            if (sala == null) {
                System.out.println("No se encontró la sala para la película seleccionada.");
                return;
            }

            System.out.println("Sala seleccionada: " + sala.getTipoSala());

            System.out.print("Introduce la fecha de la sesión (yyyy-MM-dd): ");
            String fecha = sc.next();
            System.out.print("Introduce la hora de la sesión (HH:mm:ss): ");
            String hora = sc.next();
            String fechaHora = fecha + " " + hora;

            try {
                Timestamp timestamp = Timestamp.valueOf(fechaHora);

                Timestamp horaFinNuevaSesion = new Timestamp(timestamp.getTime() + pelicula.getDuracion() * 60 * 1000);

                for (Sesion sesionExistente : sala.getSesiones()) {
                    Timestamp horaInicioExistente = sesionExistente.getHoraFecha();
                    Timestamp horaFinExistente = new Timestamp(
                            horaInicioExistente.getTime() + sesionExistente.getPelicula().getDuracion() * 60 * 1000);

                    if (!(horaFinNuevaSesion.before(horaInicioExistente) || timestamp.after(horaFinExistente))) {
                        throw new IllegalArgumentException(
                                "La sesión se solapa con una existente. Selecciona otro horario.");
                    }
                }

                Sesion sesion = new Sesion(pelicula, new Butaca[5][5], timestamp);
                sala.getSesiones().add(sesion);
                System.out.println("Sesión agregada a la película.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Ocurrió un error inesperado al agregar la sesión.");
            }
        } else {
            System.out.println("Película no válida.");
        }
    }

    private static void verPlanoSala() {
        int idCine = seleccionarCine();
        if (idCine == -1) {
            return;
        }

        Cine cine = cines.get(idCine);

        if (cine.getSalas().isEmpty()) {
            System.out.println("No hay salas disponibles.");
            return;
        }

        System.out.println("Selecciona una película:");
        ArrayList<Pelicula> peliculas = new ArrayList<>();
        for (Sala sala : cine.getSalas()) {
            peliculas.addAll(sala.getPeliculas());
        }
        if (peliculas.isEmpty()) {
            System.out.println("No hay películas disponibles en este cine.");
            return;
        }

        for (int i = 0; i < peliculas.size(); i++) {
            System.out.println((i + 1) + ". " + peliculas.get(i).getTitulo());
        }

        int peliculaIndex = leerEntero() - 1;
        sc.nextLine();

        if (peliculaIndex >= 0 && peliculaIndex < peliculas.size()) {
            Pelicula pelicula = peliculas.get(peliculaIndex);

            Sala sala = null;
            for (Sala s : cine.getSalas()) {
                if (s.getPeliculas().contains(pelicula)) {
                    sala = s;
                    break;
                }
            }

            if (sala == null) {
                System.out.println("No se encontró la sala para la película seleccionada.");
                return;
            }

            if (sala.getSesiones().isEmpty()) {
                System.out.println("No hay sesiones disponibles para esta película.");
                return;
            }

            System.out.println("Selecciona una sesión:");
            for (int i = 0; i < sala.getSesiones().size(); i++) {
                if (sala.getSesiones().get(i).getPelicula().equals(pelicula)) {
                    System.out.println((i + 1) + ". " + sala.getSesiones().get(i).getHoraFecha());
                }
            }

            int sesionIndex = leerEntero() - 1;
            sc.nextLine();

            if (sesionIndex >= 0 && sesionIndex < sala.getSesiones().size()) {
                Sesion sesion = sala.getSesiones().get(sesionIndex);
                if (!sesion.getPelicula().equals(pelicula)) {
                    System.out.println("Sesión no válida para la película seleccionada.");
                    return;
                }
                System.out.println("Plano de butacas:");
                for (int i = 0; i < sesion.getButacas().length; i++) {
                    for (int j = 0; j < sesion.getButacas()[i].length; j++) {
                        if (sesion.getButacas()[i][j] != null && sesion.getButacas()[i][j].isReservada()) {
                            System.out.print("R ");
                        } else {
                            System.out.print("A ");
                        }
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Sesión no válida.");
            }
        } else {
            System.out.println("Película no válida.");
        }
    }

    private static void comprarEntrada() {
        int idCine = seleccionarCine();
        if (idCine == -1) {
            return;
        }
    
        Cine cine = cines.get(idCine);
    
        if (cine.getSalas().isEmpty()) {
            System.out.println("No hay salas disponibles.");
            return;
        }
    
        System.out.println("Selecciona una película:");
        ArrayList<Pelicula> peliculas = new ArrayList<>();
        for (Sala sala : cine.getSalas()) {
            peliculas.addAll(sala.getPeliculas());
        }
        if (peliculas.isEmpty()) {
            System.out.println("No hay películas disponibles en este cine.");
            return;
        }
        for (int i = 0; i < peliculas.size(); i++) {
            System.out.println((i + 1) + ". " + peliculas.get(i).getTitulo());
        }
    
        Pelicula pelicula = null;
        try {
            int peliculaIndex = leerEntero() - 1;
            pelicula = peliculas.get(peliculaIndex);  
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Seleccionaste una película inválida. Inténtalo de nuevo.");
            return;
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado al seleccionar la película.");
            return;
        }
    
        Sala sala = null;
        for (Sala s : cine.getSalas()) {
            if (s.getPeliculas().contains(pelicula)) {
                sala = s;
                break;
            }
        }
    
        if (sala == null) {
            System.out.println("No se encontró la sala para la película seleccionada.");
            return;
        }
    
        if (sala.getSesiones().isEmpty()) {
            System.out.println("No hay sesiones disponibles para esta película.");
            return;
        }
    
        System.out.println("Selecciona una sesión:");
        for (int i = 0; i < sala.getSesiones().size(); i++) {
            if (sala.getSesiones().get(i).getPelicula().equals(pelicula)) {
                System.out.println((i + 1) + ". " + sala.getSesiones().get(i).getHoraFecha());
            }
        }
    
        Sesion sesion = null;
        try {
            int sesionIndex = leerEntero() - 1;
            sesion = sala.getSesiones().get(sesionIndex); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Seleccionaste una sesión inválida. Inténtalo de nuevo.");
            return;
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado al seleccionar la sesión.");
            return;
        }
    
        if (!sesion.getPelicula().equals(pelicula)) {
            System.out.println("Sesión no válida para la película seleccionada.");
            return;
        }
    
        System.out.print("Introduce el número de fila para la butaca: ");
        int fila = leerEntero() - 1;
        System.out.print("Introduce el número de columna para la butaca: ");
        int columna = leerEntero() - 1;
        sc.nextLine();
    
        try {
            if (fila < 0 || fila >= sesion.getButacas().length || columna < 0 || columna >= sesion.getButacas()[fila].length) {
                throw new IllegalArgumentException("Número de fila o columna inválido.");
            }
    
            Butaca butaca = sesion.getButacas()[fila][columna];
    
            if (butaca == null) {
                butaca = new Butaca();
                sesion.getButacas()[fila][columna] = butaca;
            }
    
            if (butaca.isReservada()) {
                throw new IllegalStateException("La butaca ya está reservada.");
            }
    
            int precioEntrada = cine.getPrecioBase();
            butaca.setReservada(true);
    
            System.out.println("¡Compra exitosa!");
            System.out.println("Detalles de la compra:");
            System.out.println("Película: " + sesion.getPelicula().getTitulo());
            System.out.println("Hora de la sesión: " + sesion.getHoraFecha());
            System.out.println("Asiento: Fila " + (fila + 1) + ", Columna " + (columna + 1));
            System.out.println("Precio de la entrada: " + precioEntrada + "€");
    
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado durante la compra de la entrada.");
        }
    }    
}
