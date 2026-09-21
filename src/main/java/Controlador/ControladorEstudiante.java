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
        
        generarreporte();
        
    }
    
    private void generarreporte(){
        String reporte = "reporte de estudiantes";
        for(int i=0; i<arregloEstudiantes.length;i++){
            Estudiante est= arregloEstudiantes[i];
            reporte +="Id: "+est.getId();
            reporte +="Nombre: "+est.getNombre();
            reporte +="Nota definitiva: "+est.calcularDefinitiva();
            reporte +="Id: "+est.getId();
            reporte +="Estado: "+est.getId();
        }
    }
    
}
