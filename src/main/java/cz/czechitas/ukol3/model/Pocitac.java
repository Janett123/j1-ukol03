package cz.czechitas.ukol3.model;

import java.util.Objects;

public class Pocitac {

    private boolean jeZapnuty;

    private Procesor cpu;

    private Pamet ram;

    private Disk pevnyDisk;


    public Procesor getCpu() {
        return cpu;
    }

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    public Pamet getRam() {
        return ram;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    public Disk getPevnyDisk() {
        return pevnyDisk;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }

    @Override
    public String toString() {
        return "Pocitac{" +
                "jeZapnuty=" + jeZapnuty +
                ", cpu=" + cpu +
                ", ram=" + ram +
                ", pevnyDisk=" + pevnyDisk +
                '}';
    }


    public void zapniSe() {

        if (ram == null || cpu == null || pevnyDisk == null) {
            System.err.println("chybí součást PC");
            jeZapnuty = false;
            return;
        }

        if (jeZapnuty == true) {
            System.err.println("Počítač je už zapnutý!");
            return;
        }
        jeZapnuty = true;

    }

    public void vypniSe() {
        jeZapnuty = false;
    }

    public boolean jeZapnuty() {
        return jeZapnuty;
    }

    public void vytvorSouborOVelikosti(long velikost) {
        pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto() + velikost);
        //System.out.println(pevnyDisk.getVyuziteMisto());

        if (pevnyDisk.getVyuziteMisto() > pevnyDisk.getKapacita()) {
            System.err.println("Využité místo překračuje kapacitu!");
            pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto()- velikost);
        }
    }

    public void vymazSouboryOVelikosti(long velikost) {
        pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto() - velikost);

        if(pevnyDisk.getVyuziteMisto()<0) {
            System.err.println("Využité místo nesmí být záporné!");
            pevnyDisk.setVyuziteMisto(0);
        }
    }

}


