/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.*;



/**
 *
 * @author jairo
 */
public class Test {
    
    public static void main(String[] args) {
        
        Person p = new Person(12345, "Jairo", "Seoaes", 25);
        System.out.println(p.retornarDatos());
        
        Doctor d = new Doctor(3456, "Pepito", "Perez", 21, "Radiologo", "HEAD");
        System.out.println(d.retornarDatos());
        
        Teacher t = new Teacher(3456, "Fulano", "De tal", 35, "Sistemas", "UPC");
        System.out.println(t.retornarDatos());
        
    }
    
}
