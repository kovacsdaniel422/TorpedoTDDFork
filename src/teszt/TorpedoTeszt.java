package teszt;

import moell.Hajo;



public class TorpedoTeszt {

    private Hajo hajo;

    public TorpedoTeszt() {
        this.hajo = new Hajo(new int[]{2, 3, 4});
        System.out.println("Tesztesetek");
        tesztLovesTalalt(4);
        tesztLovesNemTalalt(5);
        tesztLovesSullyedt();
        tesztLovesNemSullyedt();
        System.out.println("Tesztesetek VÉGE");
    }

    public static void main(String[] args) {
// new TorpedoTeszt().tesztLovesTalalt(4);
// new TorpedoTeszt().tesztLovesNemTalalt(5);
        new TorpedoTeszt();
    }

    public void tesztLovesTalalt(int poz) {
        System.out.println("---Találat");
        hajo = new Hajo(new int[]{2, 3, 4});
        String t = hajo.talalat(poz);
        assert t.equals("talált") : "nem jó a találat ellenőrzése";
        System.out.println("Találat teszt sikeres");
    }

    public void tesztLovesNemTalalt(int poz) {
        System.out.println("---Mellé");
        hajo = new Hajo(new int[]{2, 3, 4});
        String t = hajo.talalat(poz);
        assert t.equals("mellé") : "nem jó a mellé ellenőrzése";
        System.out.println("Mellé teszt sikeres");
    }

    public void tesztLovesSullyedt() {
        System.out.println("---Süllyedt");
        hajo = new Hajo(new int[]{2, 3, 4});
        hajo.talalat(2);
        hajo.talalat(3);
        hajo.talalat(4);
        boolean s = hajo.isElsullyedt();
        assert s == true : "nem jó a süllyedt ellenőrzése";
        System.out.println("Süllyedt teszt sikeres");
    }

    public void tesztLovesNemSullyedt() {
        System.out.println("---Nem süllyedt");
        hajo = new Hajo(new int[]{2, 3, 4});
        hajo.talalat(2);
        hajo.talalat(3);
        hajo.talalat(1);
        boolean s = hajo.isElsullyedt();
        assert s == false : "nem jó a süllyedt ellenőrzése";
        System.out.println("Nem süllyedt teszt sikeres");
    }

    /*további nem implementált esetek: */
    public void tesztHajoJoHelyenVan() {
    }

    public void tesztTalalatokSzama() {
    }

    public void tesztHolSerult() {
    }
}
