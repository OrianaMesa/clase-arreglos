/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import javax.swing.JOptionPane;
/**
 *
 * @author orian
 */

import Modelo.Estudiante;
import Vista.VistaEstudiante;
public class ControladorEstudiante {
    private VistaEstudiante vista;
    private Estudiante[] arregloEstudiantes; //Uso del arreglo

    public ControladorEstudiante(VistaEstudiante vista) {
        this.vista = vista;
    }
    
    public void iniciar(){
        int cantidad= vista.SolicitarcantEstudiantes();
        arregloEstudiantes= new Estudiante[cantidad];
        
        //llenar el arreglo
        for(int i=0; i<arregloEstudiantes.length;i++){
            int id = vista.Solicitarcodigo(i+1);
            String nombre= vista.Solicitarnommbre();
            double notaDesarrollo= vista.Solicitarnota("Desarrollo");
            double notaMatematicas= vista.Solicitarnota("Matemáticas");
            
            arregloEstudiantes[i]=new Estudiante(String.valueOf(id),nombre,notaDesarrollo,notaMatematicas);
        }
        
       double notaLimite = vista.SolicitarNotaLimite();
       generarreporte(notaLimite);
    }

    
    private void generarreporte(double notaLimite) {

    String reporte = "Reporte de estudiantes\n\n";

    for (int i = 0; i < arregloEstudiantes.length; i++) {
        Estudiante est = arregloEstudiantes[i];
        double definitiva = est.calcularDefinitiva();
        if (definitiva > notaLimite) {
            reporte += "Código: " + est.getId() + "\n";
            reporte += "Nombre: " + est.getNombre() + "\n";
            reporte += "Nota definitiva: " + definitiva + "\n";
            reporte += "-----------------------------\n";
        }
    }

    vista.mensaje(reporte);
}
    
   public void incrementarNotaDesarrollo(double incremento) {
       for (int i = 0; i < arregloEstudiantes.length; i++) {
        Estudiante est = arregloEstudiantes[i];
        double nuevaNota = est.getNotaDesarrollo() + incremento;
        
        if (nuevaNota > 5.0) {
            est.setNotaDesarrollo(5.0); // Tope máximo permitido inferior o igual a 5.0
        } else {
            est.setNotaDesarrollo(nuevaNota);
        }
    }
    vista.mensaje("Se ha aplicado el incremento a la nota de Desarrollo exitosamente.");
}
}


