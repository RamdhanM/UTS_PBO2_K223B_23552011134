##UTS Pemrograman Berorientasi Obyek 2
Mata Kuliah: Pemrograman Berorientasi Obyek 2
Dosen Pengampu: Muhammad Ikhwan Fathulloh

#Profil
Nama: Ramdhan Maulana
NIM: 23552011134
Kelas: K223B
Studi Kasus: Aplikasi Kasir Bank

#Judul Studi Kasus
Aplikasi Kasir Bank

#Penjelasan Studi Kasus
Aplikasi ini merupakan simulasi sistem kasir bank menggunakan bahasa pemrograman Java dan database MySQL. Aplikasi memungkinkan pengguna membuat rekening tabungan dan giro, melakukan transaksi setor serta tarik tunai, dan menyimpan data transaksi ke dalam database menggunakan koneksi JDBC. Proyek ini dibangun dengan menerapkan konsep OOP.

#Penjelasan 4 Pilar OOP dalam Studi Kasus
1. Inheritance
Class Tabungan dan Giro mewarisi class Rekening agar memiliki properti dan metode dasar rekening.
2. Encapsulation
Properti pada class seperti saldo dan id disembunyikan (private/protected) dan diakses melalui getter/setter.
3. Polymorphism
Metode hitungBunga() di-override dalam class Tabungan dan Giro agar perhitungan bunga sesuai jenis rekening.
4. Abstraction
Class Rekening digunakan sebagai class abstrak dasar yang tidak perlu tahu detail implementasi setiap jenis rekening.

#Demo Proyek
Demo proyek tersedia dalam bentuk:
Program dapat dijalankan langsung melalui Main.java di NetBeans
Database menggunakan XAMPP dan phpMyAdmin

Link GitHub: https:

Video demo: https://drive.google.com/drive/folders/1F8D9b6Bm5MUbNwrZUfw7aSUmv6trgcKV
