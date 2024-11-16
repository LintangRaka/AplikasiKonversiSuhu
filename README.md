# Konversi Suhu Frame

Nama : Lintang Raka Buana  
NPM : 2210010381   
Kelas: 5A REG Banjarbaru

![image](https://github.com/user-attachments/assets/aaeac0ce-bfda-4b19-9e71-a21d3fde53ae)
![image](https://github.com/user-attachments/assets/d275dbe2-bd8f-4881-bf5c-cf87aab7f52a)
![image](https://github.com/user-attachments/assets/4b7a0536-9967-44a7-a867-e4b2027faa0a)


Aplikasi **Konversi Suhu** menggunakan Java Swing untuk mengonversi suhu antar skala (Celsius, Fahrenheit, Reamur, Kelvin). Program secara otomatis mengonversi suhu saat input diubah.

## Fitur Utama
- **Input Suhu**: Masukkan suhu dalam salah satu skala.
- **Konversi Otomatis**: Konversi suhu terjadi otomatis saat teks input diubah.
- **Pilihan Skala Tujuan**: Pilih skala suhu tujuan menggunakan radio button.
- **Validasi Input**: Hanya angka dan titik desimal yang diperbolehkan.

## Cara Penggunaan
1. Masukkan suhu pada field **Masukkan suhu**.
2. Pilih jenis suhu input di **Jenis konversi**.
3. Pilih skala tujuan suhu dengan radio button.
4. Hasil konversi akan muncul di field **Hasil**.

## Struktur Kode
- **KonversiSuhuFrame**: Kelas utama GUI.
- **txtSuhu**: Input suhu.
- **cbbSuhuInput**: Dropdown jenis suhu input.
- **txtSuhuHasil**: Menampilkan hasil konversi.
- **btnKonversi**: Tombol konversi manual.
- **rbCelsius, rbFahrenheit, rbReamur, rbKelvin**: Radio button untuk memilih skala tujuan.

## Persyaratan
- Java JDK 8 atau lebih baru.

## Event Listener
- **DocumentListener**: Untuk konversi otomatis saat input berubah.
- **ItemListener**: Untuk mengubah arah konversi saat memilih radio button.

