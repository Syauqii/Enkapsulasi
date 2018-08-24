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
        Bio.setnamaAyah("Muahmmad");
        Bio.setnamaIbu("Nikamtul");
        Bio.setnamaSendiri("Syauqi");
        Bio.setnamaSaudara("Fika");
        Bio.setAlamat("Nganjuk");
        Bio.setHobi("Belajar");
        Bio.setCitacita("CEO");
        Bio.setUmur(16);
        
        
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
