package Nilai_Mahasiswa_InputBranching;

/*1. Buatlah program yang menghasilkan tampilan Input dan Output sebagai berikut : 
    Tampilan Input 
        NPM             : <input> 
        Nama Mahasiswa  : <input> 
        NilaiKehadiran  : <input> 
        NilaiTugas      : <input> 
        Nilai UTS       : <input> 
        Nilai UAS       : <input> 
    Tampilan Output
        NPMMahasiswa    : <tampilotomatis> 
        Nama Mahasiswa  : <tampil otomatis> 
        Nilai Rata-rata : <tampil otomatis> 
        Grade           : <tampil ototmatis> 
        Keterangan      : <tampil otomatis> 
    Ketentuan Soal 
    Nilai akhir : (10% x Nilai Absen) + (20% x Nilai Tugas) +(30% x Nilai Tugas) + (40% x NilaiUAS) 
    Nilai akhir     grade   keterangan 
      0 – 45        E       KURANG SEKALI   
      46 – 55       D       KURANG 
      56 – 65       C       CUKUP 
      66 – 75       B       BAIK 
      76 – 100      A       ISTIMEWA  */
public class Nilai_Mahasiswa {
    private final String npm;
    private final String nama;
    private final float nilaiKehadiran;
    private final float nilaiTugas;
    private final float nilaiUTS;
    private final float nilaiUAS;

    public Nilai_Mahasiswa(String npm, String nama, float nilaiKehadiran, float nilaiTugas, float nilaiUTS, float nilaiUAS) {//Menyimpan data mahasiswa seperti NPM, nama, dan nilai.
        this.npm = npm;
        this.nama = nama;
        this.nilaiKehadiran = nilaiKehadiran;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    public float hitungNilaiAkhir() {//Menghitung nilai akhir berdasarkan bobot yang diberikan.
       return (float) ((0.1 * nilaiKehadiran) + (0.2 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS));
    }

    public String getGrade() {//Menentukan grade dan keterangan berdasarkan nilai akhir.
        float nilaiAkhir = hitungNilaiAkhir();
        if (nilaiAkhir >= 76) {
            return "A";
        } else if (nilaiAkhir >= 66) {
            return "B";
        } else if (nilaiAkhir >= 56) {
            return "C";
        } else if (nilaiAkhir >= 46) {
            return "D";
        } else {
            return "E";
        }
    }

    public String getKeterangan() {
        String grade = getGrade();
        switch (grade) {
            case "A":
                return "ISTIMEWA";
            case "B":
                return "BAIK";
            case "C":
                return "CUKUP";
            case "D":
                return "KURANG";
            default:
                return "KURANG SEKALI";
        }
    }

    public String getNpm() {//karena di enkapsulasi private maka gunakan get dan return value npm yang di inputkan saat dipanggil
        return npm;
    }

    public String getNama() {//karena di enkapsulasi private maka gunakan get dan return value nama yang di inputkan saat dipanggil
        return nama;
    }
}