package cz.czechitas.ukol3;

import cz.czechitas.ukol3.model.Disk;
import cz.czechitas.ukol3.model.Pamet;
import cz.czechitas.ukol3.model.Pocitac;
import cz.czechitas.ukol3.model.Procesor;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {

        Disk mujDisk = new Disk();
        mujDisk.setKapacita(475_000_000_000L);
        mujDisk.setVyuziteMisto(147_000_000_000L);

        Pamet mojePamet = new Pamet();
        mojePamet.setKapacita(8_000_000_000L);

        Procesor mujProcesor = new Procesor();
        mujProcesor.setVyrobce("Intel");
        mujProcesor.setRychlost(2_400_000_000L);

        Pocitac mujPocitac = new Pocitac();
        mujPocitac.setCpu(mujProcesor);
        mujPocitac.setRam(mojePamet);
        mujPocitac.setPevnyDisk(mujDisk);

        mujPocitac.zapniSe();
        mujPocitac.zapniSe();

        System.out.println(mujPocitac);

        mujPocitac.vypniSe();

        System.out.println(mujPocitac);

        mujPocitac.vytvorSouborOVelikosti(400_000_000_000L);
        System.out.println(mujDisk.getVyuziteMisto());


        mujPocitac.vymazSouboryOVelikosti(300_000_000_000L);
        System.out.println(mujDisk.getVyuziteMisto());


        System.out.println("Program spuštěn.");
    }
}
