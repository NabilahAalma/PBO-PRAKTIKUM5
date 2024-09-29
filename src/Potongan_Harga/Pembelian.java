package Potongan_Harga;

/*2. Buat program untuk menentukan besarnya potongan dari pembelian barang yang diberikan seorang pembeli, dengan kriteria : 
    a. jika total pembeliankurang dari Rp. 50.000,- potongan yang diterima sebesar 5% dari total pembelian. (if total <50.000)
    b. Jika total pembelianlebih dari atau sama dengan Rp. 50.000,- potongan yang diterima sebesar 20% dari total pembelian. (else total >= 50.000)
    output 
    Total pembelian Rp. = 50000 (input) setelah input akan muncul di bawah ini:
    Besarnya potongan Rp. 10000 (otomatis) 
    Jumlah yang harus dibayarkan Rp. 40000 (otomatis)  
 */
public class Pembelian {//inisialisasi tipe dan variabel
    private final double totalPembelian;

    public Pembelian(double totalPembelian) {//Menyimpan data Pembelian seperti total yang akan di inputkan.
        this.totalPembelian = totalPembelian;
    }

    public double hitungPotongan() {//perhitungan potongan harga yang diberikan dari input total pembelian
        if (totalPembelian < 50000) {//jika total pembelian kurang dari Rp. 50.000,- maka potongan yang diterima sebesar 5% dari total pembelian.
            return totalPembelian * 0.05;
        } else {//selein itu total pembelian lebih dari atau sama dengan Rp. 50.000,- potongan yang diterima sebesar 20% dari total pembelian. 
            return totalPembelian * 0.2;
        }
    }

    public double hitungJumlahBayar() {//metode menghitung jumlah yang dibayar dengan total dikurangi hasil hitung potongan harga
        return totalPembelian - hitungPotongan();
    }

    public double getTotalPembelian() {//metode hasil total pembelian yang di get sebab private, dan akan mengembalikan value nya saat di eksekusi
        return totalPembelian;
    }
}

