/*3. Buat program untuk menetukan kriteria kegemukan dengan menggunakan Indeks Massa Tubuh (IMT), yang dihitung berdasarkan rumus : 
    IMT = 𝐵𝑒𝑟𝑎𝑡 𝐵𝑎𝑑𝑎𝑛 (𝑘𝑔)/ 𝑇𝑖𝑛𝑔𝑔𝑖 𝐵𝑎𝑑𝑎𝑛 (𝑚) 𝑥 𝑇𝑖𝑛𝑔𝑔𝑖 𝐵𝑎𝑑𝑎𝑛 (𝑚)
    |Nilai IMT   |Kriteria          |
    |18,4 kebawah|Barat Badan Kurang|
    |18,5 – 24,9 |BeratBadan Ideal  |
    |25 – 29,9   |Berat Badan Lebih |
    |30 – 39,9   |Gemuk             |
    |40 Keatas   |SangatGemuk       | */
package Indeks_Massa_Tubuh;

public class IMT {
    private final float beratBadan;
    private final float tinggiBadan;

    public IMT(float beratBadan, float tinggiBadan) {//Menyimpan data berat badan dan tinggi badan.
        this.beratBadan = beratBadan;
        this.tinggiBadan = tinggiBadan;
    }

    public double hitungIMT() {//Menghitung IMT berdasarkan rumus yang diberikan.
        return beratBadan / (tinggiBadan * tinggiBadan);
    }

    public String getkriteria() {//Menentukan kriteria kegemukan berdasarkan nilai IMT.
        double imt = hitungIMT();
        if (imt < 18.5) {
            return "Berat Badan Kurang";
        } else if (imt >= 18.5 && imt <= 24.9) {
            return "Berat Badan Ideal";
        } else if (imt >= 25 && imt <= 29.9) {
            return "Berat Badan Lebih";
        } else if (imt >= 30 && imt <= 39.9) {
            return "Gemuk";
        } else {
            return "Sangat Gemuk";
        }
    }

    public double getberatBadan() {//karena private gunakan get maka akan mengembalikan value beratBadan saat di eksekusi
        return beratBadan;
    }

    public double gettinggiBadan() {//karena private gunakan get maka akan mengembalikan value tinggiBadan saat di eksekusi
        return tinggiBadan;
    }
}
