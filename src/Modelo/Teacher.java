/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author jairo
 */
public class Teacher extends Person {
   private String university, program;
   
   public Teacher(){
       super();
   }
   
   public Teacher(int id, String name, String lastName, int age, String university, String program){
       super(id, name, lastName, age);
       this.university=university;
       this.program=program;
   }

    /**
     * @return the university
     */
    public String getUniversity() {
        return university;
    }

    /**
     * @param university the university to set
     */
    public void setUniversity(String university) {
        this.university = university;
    }

    /**
     * @return the program
     */
    public String getProgram() {
        return program;
    }

    /**
     * @param program the program to set
     */
    public void setProgram(String program) {
        this.program = program;
    }
   
   
   @Override
    public String retornarDatos(){
        
        return super.retornarDatos()+ 
               "Program: " + this.program + "\n" + 
               "University: " + this.university + "\n"; 
    }
   
   
   
}
