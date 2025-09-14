# Nama : Khairunisa Aprilia
# NIM : 2409116060
# Kelas : B Sistem Informasi 2024

# Manajemen Waktu Belajar/Pomodoro Tracker

**- Deskripsi Program**

Program sederhana ini dibuat untuk membantu mengatur waktu belajar dengan menggunakan metode Pomodoro. Metode Pomodoro adalah teknik manajemen waktu yang membagi periode belajar menjadi sesi fokus dan diselingi dengan waktu istirahat. Biasanya untuk sesi fokus waktunya adalah 15, 20, 30 menit dan waktu istirahat waktunya adalah 5, 10, 15 menit. Pengguna dapat menambahkan sesi belajar, melihat daftar sesi, mengupdate, menghapus, serta mencari sesi belajar yang sudah dibuat.

**- Alur Program**

1. Menu utama

   <img width="539" height="240" alt="image" src="https://github.com/user-attachments/assets/d6f186e2-ef42-49da-8275-824c6172c1f2" />

   Pada menu utama terdapat 5 pilihan yang bisa dipilih yaitu 1). tambah sesi belajar, 2). lihat semua sesi belajar, 3). update sesi belajar, 4). hapus sesi belajar, 5). cari sesi belajar, dan 6). keluar.

2. Menu Tambah Sesi Belajar

   <img width="669" height="370" alt="image" src="https://github.com/user-attachments/assets/b5c7f22f-a134-42c7-afb0-542441669259" />

   Jika memilih nomor 1 yaitu tambah sesi belajar, maka akan diminta untuk mengisi nama sesi belajar yang bisa diisi dengan nama pelajaran, mengisi waktu fokus belajar dan waktu istirahat yang bisa disesuaikan sendiri, dan bisa juga mengisi daftar tugas yang ingin dikerjakan.

3. Menu Lihat Semua Sesi belajar
  
   <img width="537" height="729" alt="image" src="https://github.com/user-attachments/assets/23a177e2-73a9-4ede-b4b5-51245b3c8226" />

   Jika memilih nomor 2 yaitu melihat semua sesi belajar, akan tertampil seluruh daftar sesi belajar yang terdaftar di sistem.

4. Menu Update Sesi Belajar

   <img width="536" height="760" alt="image" src="https://github.com/user-attachments/assets/2688c5c9-4892-4f5f-b2cc-b893c1d1e1d5" />

   Jika memilih nomor 3 yaitu mengupdate sesi belajar, akan tertampil daftar sesi belajar dan diminta untuk memilih nomor sesi belajar yang ingin di update. Program akan mengecek terlebih dahulu apakah daftar sesi kosong; jika iya, ditampilkan pesan "Tidak ada sesi yang dapat diupdate". Jika ada, pengguna diminta memilih nomor sesi yang ingin diubah. Setelah sesi dipilih, program memberikan opsi untuk memperbarui nama sesi, durasi belajar, dan durasi istirahat (jika input tidak kosong maka nilainya diperbarui). Selanjutnya, program menanyakan apakah pengguna ingin memperbarui daftar tugas; jika iya, daftar tugas lama dihapus dan pengguna dapat memasukkan tugas baru satu per satu hingga mengetik "selesai". Setelah semua perubahan selesai, program menampilkan pesan "Sesi telah berhasil diupdate", sedangkan jika nomor yang dipilih tidak valid, akan muncul pesan "Nomor tidak valid".

   <img width="589" height="188" alt="image" src="https://github.com/user-attachments/assets/173b6a28-edaf-4df5-8a1a-bb25a8cdf7bc" />

   Misalnya disini kita mengupdate sesi nomor 4 yaitu Kimia, kita akan diminta mengisi nama sesinya (bisa diubah, jika ingin diubah), waktu belajar dan waktu istirahat yang bisa diubah juga, dan kita akan ditanya apakah mau mengupdate daftar tugas, jika ingin diupdate ketik y, jika tidak ketik n dan jika bisa ketik selesai untuk keluar.

   <img width="466" height="504" alt="image" src="https://github.com/user-attachments/assets/564ab192-6685-4e55-ba4e-b09a98fe27f3" />

   Dapat dilihat sesi sejarah telah berhasil terupdate.

5. Menu Hapus Sesi Belajar

   <img width="537" height="772" alt="image" src="https://github.com/user-attachments/assets/4c141ae7-72fa-4685-a6c6-6ecd44d4c75b" />

   Jika memilih nomor 4 untuk menghapus sesi belajar, akan diminta memilih nomor sesi belajar yang ingin dihapus. Jika berhasil dihapus akan keluar output sesi telah berhasil dihapus.

   <img width="442" height="399" alt="image" src="https://github.com/user-attachments/assets/255484c2-7ad3-4890-896c-12e98d034242" />

   Dapat dilihat saat di cek kembali di daftar sesi belajar, sesi dengan nama Kimia telah terhapus.

6. Menu Cari Sesi Belajar
  
      <img width="535" height="261" alt="image" src="https://github.com/user-attachments/assets/908e36f2-d9e0-4642-badf-de8680c389e6" />

      Jika memilih nomor 5 untuk mencari sesi belajar, akan diminta memasukan nama sesi yang ingin dicari.

      <img width="451" height="141" alt="image" src="https://github.com/user-attachments/assets/d9f61370-aca8-463c-aa95-4c179ab9e069" />

      Misalnya pada gambar diatas, mencari sesi dengan nama Fisika dan akan tertampil sesi dengan nama Fisika.

      <img width="430" height="73" alt="image" src="https://github.com/user-attachments/assets/de149694-de69-4774-a067-622ac40aaa62" />

      Jika nama sesi yang kita cari tidak ada akan muncul pesan sesi tidak ditemukan.

7. Menu Keluar

   <img width="754" height="310" alt="image" src="https://github.com/user-attachments/assets/cd43518b-7a60-4840-9a7c-a2265ddc6155" />

   Jika memilih nomor 6 untuk keluar dari sistem, akan keluar output terima kasih telah mengunjungi pomodoro tracker.

**- Source Code**

1. Struktur Project (MVC)

   <img width="281" height="165" alt="image" src="https://github.com/user-attachments/assets/1b0a980a-bffd-4741-ac5b-8eb640192bba" />

   Terdapat 3 package, yaitu:

   1) Package Model yang terdapat SesiBelajat.java dan tempat menyimpan struktur data seperti atribut dan constructor.
   2) Package Service yang terdapat CrudService.java dan tempat menyimpan kode logika CRUD.
   3) Package Main yang terdapat Main.Java dan tempat menyimpan menu user.

2. SesiBelajar.Java

   1) Package

      <img width="289" height="38" alt="image" src="https://github.com/user-attachments/assets/5d89a2db-621f-44ea-9ea0-5f76488c8eb9" />

      SesiBelajar.java ini disimpan di package model;

   2) Import
  
      <img width="476" height="38" alt="image" src="https://github.com/user-attachments/assets/79982c2e-9bac-4e0a-a06b-411cdf40f88a" />

      import java.util.ArrayList digunakan untuk memanggil class ArrayList dari package java.util, yang berfungsi menyimpan data dalam bentuk list dinamis.

   3) Properties dan Deklarasi Attribute
  
      <img width="570" height="160" alt="image" src="https://github.com/user-attachments/assets/b5c53110-5eac-499b-840b-043cfb32849a" />

      Deklarasi atribut dalam class SesiBelajar. Di dalamnya terdapat empat atribut utama, yaitu namaSesi bertipe String yang menyimpan nama dari sesi belajar, waktuBelajar bertipe int yang menyimpan lama waktu belajar dalam menit, waktuIstirahat bertipe int yang menyimpan lama waktu istirahat, serta daftarTugas berupa ArrayList<String> yang digunakan untuk menyimpan kumpulan tugas yang berkaitan dengan sesi belajar tersebut. Atribut-atribut ini dibuat dengan modifier private agar tidak bisa diakses langsung dari luar class, sehingga lebih aman dan hanya bisa diakses melalui method getter dan setter yang sudah disediakan.

   4) Constuctor
  
      <img width="1213" height="199" alt="image" src="https://github.com/user-attachments/assets/f96ab883-19e0-4dc7-b5a1-e66fa57b5077" />

      Constructor ini digunakan untuk membuat objek baru dengan memberikan nilai awal pada atribut namaSesi, waktuBelajar, dan waktuIstirahat sesuai parameter yang dimasukkan. Kata kunci this dipakai untuk membedakan antara atribut class dengan parameter yang memiliki nama sama. Selain itu, constructor ini juga menginisialisasi daftarTugas sebagai ArrayList kosong agar setiap objek SesiBelajar langsung siap menampung daftar tugas yang akan ditambahkan.

   5) Getter dan Setter
  
      <img width="598" height="685" alt="image" src="https://github.com/user-attachments/assets/bb6f0a11-2eb2-4c16-ad01-393566864017" />

      Method getter (getNamaSesi, getWaktuBelajar, getWaktuIstirahat, dan getDaftarTugas) digunakan untuk mengambil nilai dari atribut yang bersangkutan, sedangkan method setter (setNamaSesi, setWaktuBelajar, setWaktuIstirahat) berfungsi untuk mengubah nilai atribut tersebut dengan nilai baru. Dengan adanya getter dan setter, akses ke atribut bisa lebih terkontrol tanpa perlu langsung memanipulasi variabel privat. Selain itu, terdapat method tambahTugas yang memungkinkan pengguna menambahkan string baru ke dalam daftarTugas.

3. CrudService.java

   1) Package
  
      <img width="216" height="23" alt="image" src="https://github.com/user-attachments/assets/e8648800-f464-4908-8213-091e68a73d8a" />

      CrudService.java ini disimpan di package service;

   2) Import
  
      <img width="309" height="68" alt="image" src="https://github.com/user-attachments/assets/e32d2f0d-b35f-4e02-a45f-4f005b83e126" />

      - import model.SesiBelajar; berfungsi untuk mengimpor class SesiBelajar yang sudah dibuat dalam package model, sehingga bisa dipanggil di file lain tanpa perlu menuliskan path lengkapnya.
      - import java.util.ArrayList; digunakan untuk memanggil class ArrayList dari library Java, yang berfungsi menyimpan data dalam bentuk list dinamis.
      - import java.util.Scanner; berfungsi memanggil class Scanner dari library Java, yang digunakan untuk membaca input dari pengguna melalui keyboard.
     
   3) Data Default
  
      <img width="706" height="445" alt="image" src="https://github.com/user-attachments/assets/0706c6d7-ebf3-4678-ab45-fad9c8afa4c8" />
  
      Pada baris pertama, dibuat atribut daftarSesi bertipe ArrayList<SesiBelajar> yang digunakan untuk menyimpan daftar semua sesi belajar. Lalu ada atribut input bertipe Scanner untuk membaca masukan dari pengguna. Di dalam constructor CrudService(), daftarSesi diinisialisasi sebagai list kosong. Setelah itu dibuat tiga objek SesiBelajar, yaitu sesi1, sesi2, dan sesi3, masing-masing dengan nama sesi, waktu belajar, dan waktu istirahat tertentu. Setiap sesi juga langsung ditambahkan daftar tugasnya menggunakan method tambahTugas(). Terakhir, ketiga sesi tersebut dimasukkan ke dalam daftarSesi.

   4) Create (tambahSesi())
  
      <img width="836" height="448" alt="image" src="https://github.com/user-attachments/assets/93ff0b9d-81e5-49a6-be30-92d6ac5c4c14" />

      tambahSesi() yang digunakan untuk menambahkan sesi belajar baru. Pertama, program meminta pengguna memasukkan nama sesi belajar, waktu belajar (dalam menit), dan waktu istirahat (dalam menit). Setelah itu, dibuat objek SesiBelajar dengan data yang sudah diinput. Kemudian, program masuk ke perulangan do-while untuk meminta pengguna menambahkan tugas-tugas yang berkaitan dengan sesi tersebut, dan perulangan berhenti jika pengguna mengetikkan kata "selesai". Setiap tugas yang dimasukkan akan ditambahkan ke dalam objek sesi. Setelah semua data terkumpul, sesi belajar dimasukkan ke dalam daftar sesi (daftarSesi), dan program menampilkan pesan bahwa sesi belajar berhasil ditambahkan.

   5) Read (tampilkanSesi())
  
      <img width="918" height="497" alt="image" src="https://github.com/user-attachments/assets/18d4183f-39dc-4334-bbd7-aabe964bd9f8" />

      tampilkanSesi() yang berfungsi untuk menampilkan daftar sesi belajar yang sudah tersimpan. Pertama, program mengecek apakah daftarSesi kosong, jika iya maka akan ditampilkan pesan "Belum ada sesi belajar.". Jika ada, program akan mencetak judul "Daftar Sesi Belajar" lalu melakukan perulangan untuk menampilkan setiap sesi satu per satu. Informasi yang ditampilkan meliputi nama sesi, waktu belajar, waktu istirahat, serta daftar tugas di dalam sesi tersebut. Jika daftar tugas kosong, maka akan ditampilkan "(kosong)", sedangkan jika ada tugas, maka setiap tugas ditampilkan dalam bentuk daftar dengan awalan tanda "-".
   6) Update (updateSesi())
  
      <img width="789" height="834" alt="image" src="https://github.com/user-attachments/assets/3040b037-ca6d-4320-a7a4-365d5d043bf5" />

      updateSesi() yang digunakan untuk memperbarui data pada sesi belajar. Pertama, program menampilkan semua sesi belajar yang ada, lalu mengecek apakah daftar sesi kosong. Jika kosong, maka ditampilkan pesan "Tidak ada sesi yang dapat diupdate.". Jika ada, pengguna diminta memilih nomor sesi yang ingin diperbarui. Setelah memilih, pengguna bisa mengganti nama sesi, waktu belajar, dan waktu istirahat; jika input dibiarkan kosong, maka nilai lama tetap dipertahankan. Selain itu, program juga menanyakan apakah pengguna ingin memperbarui daftar tugas. Jika ya, maka daftar tugas lama akan dihapus dan pengguna bisa memasukkan tugas baru sampai mengetik "selesai". Setelah semua perubahan dilakukan, program menampilkan pesan bahwa sesi berhasil diupdate. Namun, jika nomor sesi yang dimasukkan tidak valid, maka akan muncul pesan "Nomor tidak valid.".

   7) Delete (hapusSesi())
  
      <img width="717" height="372" alt="image" src="https://github.com/user-attachments/assets/6bfb795d-3b81-4c27-bce6-75afcae0baa2" />

      hapusSesi() yang digunakan untuk menghapus sesi belajar dari daftar. Pertama, program menampilkan seluruh sesi yang ada dengan memanggil tampilkanSesi(), lalu mengecek apakah daftar sesi kosong. Jika kosong, maka akan ditampilkan pesan "Tidak ada sesi yang bisa dihapus." dan proses dihentikan. Jika ada, pengguna diminta memasukkan nomor sesi yang ingin dihapus. Program kemudian memvalidasi input: jika nomor sesuai dengan indeks sesi yang ada, maka sesi tersebut akan dihapus dari daftarSesi dan ditampilkan pesan "Sesi telah berhasil dihapus.". Namun, jika nomor yang dimasukkan tidak valid, maka program akan menampilkan pesan "Nomor tidak valid.".

   8) Search (cariSesi())
  
      <img width="983" height="581" alt="image" src="https://github.com/user-attachments/assets/84f81e69-ffab-4ec1-9232-15c5e271ca5e" />

      cariSesi() yang digunakan untuk mencari sesi belajar berdasarkan nama. Pertama, program meminta pengguna memasukkan kata kunci nama sesi yang dicari, lalu mengubahnya menjadi huruf kecil agar pencarian tidak bergantung pada huruf besar atau kecil. Program kemudian melakukan perulangan untuk memeriksa setiap objek SesiBelajar dalam daftarSesi. Jika nama sesi mengandung kata kunci yang dimasukkan, maka informasi sesi tersebut akan ditampilkan, meliputi nama sesi, waktu belajar, waktu istirahat, serta daftar tugas (atau ditampilkan "(kosong)" jika tidak ada tugas). Jika minimal satu sesi ditemukan, variabel found akan bernilai true. Jika setelah pencarian tidak ada sesi yang cocok, maka program akan menampilkan pesan "Sesi tidak ditemukan.".

   9) Validasi Input Data
  
       <img width="806" height="335" alt="image" src="https://github.com/user-attachments/assets/ee0dfc19-f284-4a60-a824-66a111267d54" />

      validasiInputInt(String pesan) yang digunakan untuk memvalidasi input angka dari pengguna. Method ini menerima parameter berupa pesan yang akan ditampilkan sebagai petunjuk input. Di dalamnya, terdapat perulangan while(true) agar program terus meminta input hingga pengguna memasukkan angka yang benar. Program mencoba (try) membaca input sebagai bilangan bulat dengan Integer.parseInt(). Jika input kosong, program tetap menampilkan pesan; jika nilai yang dimasukkan kurang dari atau sama dengan nol, maka dilemparkan error NumberFormatException. Jika input valid, nilai tersebut dikembalikan (return). Jika terjadi kesalahan format (misalnya input bukan angka), blok catch akan menangkap error dan menampilkan pesan "Input harus berupa angka yang Valid (1-6)".

4. Main.java (Entry Point Class)

   1) Package

      <img width="206" height="27" alt="image" src="https://github.com/user-attachments/assets/dcc96ae6-e4c1-4edc-9138-aa2cf704d624" />

      Main.java ini disimpan di package main;

   2) Import
  
      <img width="352" height="48" alt="image" src="https://github.com/user-attachments/assets/12b9d4a3-72dd-42f3-8a04-7610ac327b0f" />

      - import service.CrudService; digunakan untuk mengimpor class CrudService yang berada di dalam package service. Class ini kemungkinan berisi interface atau class dasar yang menyediakan operasi CRUD (Create, Read, Update, Delete) untuk dikelola di program.
      - import java.util.Scanner; digunakan untuk mengimpor class Scanner dari library Java, yang berfungsi membaca input dari pengguna (misalnya input dari keyboard).
     
   3) Menu Utama
  
      <img width="925" height="543" alt="image" src="https://github.com/user-attachments/assets/da9231d6-3bfc-455e-93b5-f3c97ce4a9d0" />

  
      Class Main yang berfungsi sebagai titik awal (entry point) program. Di dalam method main, pertama dibuat objek CrudService bernama crud yang akan menangani operasi CRUD (Create, Read, Update, Delete) pada sesi belajar. Kemudian dibuat objek Scanner bernama sc untuk membaca input pengguna dari keyboard. Sebuah variabel pilihan juga disiapkan untuk menyimpan menu yang dipilih. Setelah itu, program menampilkan menu utama di dalam perulangan do-while, yang berisi daftar pilihan seperti menambah sesi belajar, melihat semua sesi, mengupdate, menghapus, mencari sesi, atau keluar dari program. Menu ini menjadi antarmuka utama agar pengguna bisa berinteraksi dengan sistem manajemen waktu belajar berbasis Pomodoro Tracker. Setelah daftar menu ditampilkan, program melakukan validasi input menggunakan while (!sc.hasNextInt()) untuk memastikan bahwa pengguna hanya bisa memasukkan angka. Jika pengguna memasukkan input yang bukan angka, program akan menampilkan pesan "Input harus berupa angka yang valid (1-6).", kemudian meminta input ulang. Setelah valid, nilai menu yang dipilih disimpan ke variabel pilihan dengan sc.nextInt(), dan sc.nextLine() dipanggil untuk membersihkan buffer agar tidak terjadi error saat membaca input berikutnya.

   4) Logika Menu Utama
     
      <img width="989" height="304" alt="image" src="https://github.com/user-attachments/assets/72caa7ef-1bc4-49c7-bdb9-7b44c890e551" />

   Bagian akhir dari logika menu utama yang menggunakan switch-case untuk mengeksekusi pilihan pengguna. Setiap angka menu (1–6) akan memanggil method yang sesuai dari objek crud (yang merupakan instance dari CrudService).
   
   - Case 1 → memanggil crud.tambahSesi() untuk menambah sesi belajar baru.
   - Case 2 → memanggil crud.tampilkanSesi() untuk menampilkan semua sesi belajar.
   - Case 3 → memanggil crud.updateSesi() untuk mengubah data sesi belajar.
   - Case 4 → memanggil crud.hapusSesi() untuk menghapus sesi belajar.
   - Case 5 → memanggil crud.cariSesi() untuk mencari sesi belajar berdasarkan nama.
   - Case 6 → menampilkan pesan ucapan terima kasih dan keluar dari program
   - Default → menampilkan pesan jika input tidak valid.

Loop do-while akan terus berjalan selama pilihan != 6, artinya program hanya akan berhenti jika pengguna memilih menu keluar. Setelah keluar, sc.close() dipanggil untuk menutup Scanner dan mengakhiri program dengan baik.









      





  
      




   


   


   


      


      

  
      



   

   




   


  
      



   
