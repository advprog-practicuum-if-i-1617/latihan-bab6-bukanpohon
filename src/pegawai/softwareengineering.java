
package pegawai;

public class softwareengineering extends gajipegawai {
    public int bonus , tunjangan;
    public softwareengineering (){
    bonus = 300000;
    tunjangan = 5500000;
    }
    public int jumlah5 (){
    return (tunjangan)+(bonus)+super.getGaji()+super.getBonus();
    }
    public int jumlah (){
    return (tunjangan)+(bonus)+super.getGaji();
    }
}
