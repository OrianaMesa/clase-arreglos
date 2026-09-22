/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estudiantetecnologia;
import Controlador.ControladorEstudiante;
import Vista.VistaEstudiante;
/**
 *
 * @author orian
 */
public class EstudianteTecnologia {

    public static void main(String[] args) {
         VistaEstudiante vista = new VistaEstudiante();
        ControladorEstudiante controlador =new ControladorEstudiante(vista);

        controlador.iniciar();
    }
}


