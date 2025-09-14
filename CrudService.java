package service;

import model.SesiBelajar;
import java.util.ArrayList;
import java.util.Scanner;

public class CrudService {
    private ArrayList<SesiBelajar> daftarSesi = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    public CrudService() {
        daftarSesi = new ArrayList<>();

        SesiBelajar sesi1 = new SesiBelajar("Fisika", 20, 5);
        sesi1.tambahTugas("Review Materi Hukum Termodinamika I & II");

        SesiBelajar sesi2 = new SesiBelajar("Matematika", 30, 15);
        sesi2.tambahTugas("Mengerjakan Tugas Limit 1");
        sesi2.tambahTugas("Mengerjakan Quiz Limit");

        SesiBelajar sesi3 = new SesiBelajar("Bahasa Inggris", 20, 10);
        sesi3.tambahTugas("Review Materi Future Past Tense");

        daftarSesi.add(sesi1);
        daftarSesi.add(sesi2);
        daftarSesi.add(sesi3);
    }

    // CREATE
    public void tambahSesi() {
        System.out.print("Masukkan nama sesi belajar: ");
        String nama = input.nextLine();
        int waktuBelajar = validasiInputInt("Masukkan waktu belajar (menit): ");
        int waktuIstirahat = validasiInputInt("Masukkan waktu istirahat (menit): ");

        SesiBelajar sesi = new SesiBelajar(nama, waktuBelajar, waktuIstirahat);

        String tambahTugas;
        do {
            System.out.print("Masukkan tugas (atau ketik 'selesai'): ");
            tambahTugas = input.nextLine();
            if (!tambahTugas.equalsIgnoreCase("selesai")) {
                sesi.tambahTugas(tambahTugas);
            }
        } while (!tambahTugas.equalsIgnoreCase("selesai"));

        daftarSesi.add(sesi);
        System.out.println("Sesi belajar telah berhasil ditambahkan.");
    }

    // READ
    public void tampilkanSesi() {
        if (daftarSesi.isEmpty()) {
            System.out.println("Belum ada sesi belajar.");
        } else {
            System.out.println("===  Daftar Sesi Belajar  ===");
            for (int i = 0; i < daftarSesi.size(); i++) {
                SesiBelajar s = daftarSesi.get(i);
                System.out.println((i + 1) + ". " + s.getNamaSesi());
                System.out.println("   Waktu Belajar  : " + s.getWaktuBelajar() + " menit");
                System.out.println("   Waktu istirahat: " + s.getWaktuIstirahat() + " menit");
                System.out.print("   Daftar tugas   : ");
                if (s.getDaftarTugas().isEmpty()) {
                    System.out.println("(kosong)");
                } else {
                    System.out.println();
                    for (String tugas : s.getDaftarTugas()) {
                        System.out.println(" - " + tugas);
                    }
                }
            }
        }
    }

    // UPDATE
    public void updateSesi() {
        tampilkanSesi();
        if (daftarSesi.isEmpty()) {
            System.out.println("Tidak ada sesi yang dapat diupdate.");
            return;
        }

        System.out.print("Pilih nomor sesi belajar yang ingin diupdate: ");
        int idxUpdate = validasiInputInt("");
        if (idxUpdate > 0 && idxUpdate <= daftarSesi.size()) {
            SesiBelajar s = daftarSesi.get(idxUpdate - 1);

            System.out.print("Nama sesi belajar baru (" + s.getNamaSesi() + "): ");
            String newNama = input.nextLine();
            if (!newNama.isEmpty()) s.setNamaSesi(newNama);

            System.out.print("Waktu belajar baru (" + s.getWaktuBelajar() + "): ");
            String ws = input.nextLine();
            if (!ws.isEmpty()) s.setWaktuBelajar(Integer.parseInt(ws));

            System.out.print("Waktu istirahat baru (" + s.getWaktuIstirahat() + "): ");
            String wi = input.nextLine();
            if (!wi.isEmpty()) s.setWaktuIstirahat(Integer.parseInt(wi));

            System.out.print("Apakah ingin update daftar tugas? (y/n): ");
            String jawab = input.nextLine();
            if (jawab.equalsIgnoreCase("y")) {
                s.getDaftarTugas().clear();
                String tugasBaru;
                do {
                    System.out.print("Masukkan tugas (atau 'selesai'): ");
                    tugasBaru = input.nextLine();
                    if (!tugasBaru.equalsIgnoreCase("selesai")) {
                        s.tambahTugas(tugasBaru);
                    }
                } while (!tugasBaru.equalsIgnoreCase("selesai"));
            }

            System.out.println("Sesi telah berhasil diupdate!");
        } else {
            System.out.println("Nomor tidak valid.");
        }
    }

    // DELETE
    public void hapusSesi() {
        tampilkanSesi();
        if (daftarSesi.isEmpty()) {
            System.out.println("Tidak ada sesi yang bisa dihapus.");
            return;
        }

        System.out.print("Pilih nomor sesi yang ingin dihapus: ");
        int idxHapus = validasiInputInt("");
        if (idxHapus > 0 && idxHapus <= daftarSesi.size()) {
            daftarSesi.remove(idxHapus - 1);
            System.out.println("Sesi telah berhasil dihapus.");
        } else {
            System.out.println("Nomor tidak valid.");
        }
    }

    // SEARCH
    public void cariSesi() {
        System.out.print("Masukkan nama sesi yang dicari: ");
        String keyword = input.nextLine().toLowerCase();

        boolean found = false;
        for (SesiBelajar sesi : daftarSesi) {
            if (sesi.getNamaSesi().toLowerCase().contains(keyword)) {
                System.out.println("Ditemukan: " + sesi.getNamaSesi());
                System.out.println("   Waktu Belajar  : " + sesi.getWaktuBelajar() + " menit");
                System.out.println("   Waktu Istirahat: " + sesi.getWaktuIstirahat() + " menit");
                System.out.print("   Daftar Tugas   : ");
                if (sesi.getDaftarTugas().isEmpty()) {
                    System.out.println("(kosong)");
                } else {
                    System.out.println();
                    for (String tugas : sesi.getDaftarTugas()) {
                        System.out.println(" - " + tugas);
                    }
                }
                found = true;
            }
        }
        if (!found) {
            System.out.println("Sesi tidak ditemukan.");
        }
    }

    // VALIDASI INPUT ANGKA
    private int validasiInputInt(String pesan) {
        int nilai;
        while (true) {
            try {
                if (!pesan.isEmpty()) System.out.print(pesan);
                nilai = Integer.parseInt(input.nextLine());
                if (nilai <= 0) throw new NumberFormatException();
                return nilai;
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka yang Valid (1-6)");
            }
        }
    }
}
