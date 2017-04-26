package pegawai;
public class projectmanager extends gajipegawai{
public int tunjangan , bonus , bonusAs , bonusAsu;
 public projectmanager (){
    bonus = 450000 ;
    tunjangan = 6000000 ;
    bonusAs = 700000;
    bonusAsu = 225000; 
    }
    public int jumlah10 (){
    return (tunjangan)+(bonus)+(bonusAs)+super.getGaji()+super.getBonus();
    }
    public int jumlah5 (){
    return (tunjangan)+(bonus)+(bonusAsu)+super.getGaji();
    }
}

