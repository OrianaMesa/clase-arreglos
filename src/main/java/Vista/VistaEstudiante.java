/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;
import javax.swing.JOptionPane;

/**
 *
 * @author orian
 */
public class VistaEstudiante {
    public int SolicitarcantEstudiantes() {
            String input=JOptionPane.showInputDialog("¿Cuantos estudiantes desea registrar?");
            return Integer.parseInt(input);
    }
    
    public int Solicitarcodigo(int numeroEstudiante){
    int id=0;
    while(id<=21000){
        String input=JOptionPane.showInputDialog("Código del estudiante: ");
        id=Integer.parseInt(input);
        if(id<21000){
            JOptionPane.showMessageDialog(null, "El código debe ser mayor a 21000");
        }
    }
    
    return id;
    }
    
    public String Solicitarnommbre(){
        return JOptionPane.showInputDialog("Digite el nombre del estudiante ");
    }
    public double Solicitarnota(String tipoNota){
        String input=JOptionPane.showInputDialog("Ingrese la nota de " + tipoNota + ": ");
        return Double.parseDouble(input);
    }
    
    public void mensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
        
    }
    
public double SolicitarNotaLimite() {

    double notaLimite = -1;
    while (notaLimite < 0.0 || notaLimite > 4.9) {
        String input = JOptionPane.showInputDialog(
                "Ingrese la nota límite entre 0.0 y 4.9:"
        );

        notaLimite = Double.parseDouble(input);

        if (notaLimite < 0.0 || notaLimite > 4.9) {

            JOptionPane.showMessageDialog(null, "La nota debe estar entre 0.0 y 4.9");
        }
    }
    return notaLimite;
}


}
  
