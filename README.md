# UTS_PBO2_K223B_23552011134
# UTS PBO 2 - Aplikasi Kasir Bank

## Identitas
- Nama: Ramdhan Maulana
- NIM: 23552011134
- Kelas: K223B

## Deskripsi Program
Aplikasi ini merupakan simulasi sistem kasir bank berbasis Java yang terhubung dengan database MySQL. Program ini dibuat dengan menerapkan konsep Pemrograman Berorientasi Objek (OOP) seperti:
- Inheritance
- Polymorphism
- Abstract Class
- Interface
- Encapsulation

## Fitur
- Menambahkan dan menyimpan data rekening (Tabungan dan Giro)
- Melakukan transaksi setor dan tarik
- Menyimpan transaksi ke dalam database
- Menampilkan seluruh data rekening yang tersimpan
- Menampilkan histori transaksi

## Teknologi yang Digunakan
- Java
- MySQL
- JDBC
- NetBeans
- XAMPP (phpMyAdmin)

## Cara Menjalankan
1. Aktifkan **MySQL** melalui XAMPP
2. Buat database bernama `kasir_bank` dan jalankan script SQL berikut di phpMyAdmin:

```sql
CREATE TABLE rekening (
    id INT AUTO_INCREMENT PRIMARY KEY,
    jenis VARCHAR(50),
    saldo DOUBLE
);

CREATE TABLE transaksi (
    id INT AUTO_INCREMENT PRIMARY KEY,
    rekening_id INT,
    tipe VARCHAR(50),
    jumlah DOUBLE,
    tanggal DATE
);
