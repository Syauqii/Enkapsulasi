/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author SYSTEM
 */
public class runSyauqi {
        public static void main(String[] args){
        Syauqi Bio = new Syauqi();
        Bio.setnamaAyah("Romeo");
        Bio.setnamaIbu("Juliet");
        Bio.setnamaSendiri("Frank");
        Bio.setnamaSaudara("Mukidi");
        Bio.setAlamat("San Fransisco");
        Bio.setHobi("Belajar");
        Bio.setCitacita("Presiden");
        Bio.setUmur(17);
        
        
        System.out.println
        ("Nama Ayah       : " + Bio.getnamaAyah()
        +"\nNama Ibu        : " + Bio.getnamaIbu()
        +"\nNama Sendiri    : " + Bio.getnamaSendiri()
        +"\nNama Saudara    : " + Bio.getnamaSaudara()
        +"\nAlamat          : " + Bio.getAlamat()
        +"\nHobi            : " + Bio.getHobi()
        +"\nCita-cita       : " + Bio.getCitacita()
        +"\nUmur            : " + Bio.getUmur()
        
        );
        
    
    }
}
