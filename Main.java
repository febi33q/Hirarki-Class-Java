import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Buat data kampus
        Kampus kampus = new Kampus("Politeknik Negeri Bandung", "022-1234567", "info@polban.ac.id", "www.polban.ac.id");

        // Buat data dosen
        Dosen dosen1 = new Dosen("Dr. Budi Santoso", "08123456789", "budi@polban.ac.id", "1975-05-15", "Laki-laki", "123456", "Profesor", "Teknik Informatika", "2001-08-01", "Aktif");
        Dosen dosen2 = new Dosen("Dr. Siti Nurjanah", "08198765432", "siti@polban.ac.id", "1980-07-22", "Perempuan", "654321", "Lektor", "Teknik Elektro", "2005-03-15", "Aktif");
        Dosen dosen3 = new Dosen("Dr. Andi Supriyadi", "08123456790", "andi@polban.ac.id", "1978-02-12", "Laki-laki", "789012", "Asisten Profesor", "Teknik Informatika", "2007-01-01", "Aktif");
        Dosen dosen4 = new Dosen("Dr. Rina Kartika", "08123456791", "rina@polban.ac.id", "1985-03-23", "Perempuan", "345678", "Lektor", "Teknik Sipil", "2010-02-15", "Aktif");
        Dosen dosen5 = new Dosen("Prof. Joko Widodo", "08123456792", "joko@polban.ac.id", "1965-04-04", "Laki-laki", "456789", "Profesor", "Teknik Mesin", "2000-03-10", "Aktif");
        Dosen dosen6 = new Dosen("Dr. Indah Putri", "08123456793", "indah@polban.ac.id", "1990-05-16", "Perempuan", "234567", "Asisten Profesor", "Teknik Elektro", "2015-07-20", "Aktif");
        Dosen dosen7 = new Dosen("Dr. Rudi Hartono", "08123456794", "rudi@polban.ac.id", "1972-06-28", "Laki-laki", "678901", "Lektor", "Teknik Kimia", "2003-09-05", "Aktif");
        Dosen dosen8 = new Dosen("Prof. Linda Ayu", "08123456795", "linda@polban.ac.id", "1982-07-30", "Perempuan", "890123", "Profesor", "Teknik Lingkungan", "2012-11-11", "Aktif");
        Dosen dosen9 = new Dosen("Dr. Eko Prasetyo", "08123456796", "eko@polban.ac.id", "1988-08-15", "Laki-laki", "567890", "Lektor", "Teknik Informatika", "2014-01-25", "Aktif");
        Dosen dosen10 = new Dosen("Dr. Nia Sari", "08123456797", "nia@polban.ac.id", "1995-09-12", "Perempuan", "345123", "Asisten Profesor", "Teknik Sipil", "2019-05-30", "Aktif");

        // Menyimpan data dosen dalam list
        List<Dosen> listDosen = new ArrayList<>();
        listDosen.add(dosen1);
        listDosen.add(dosen2);
        listDosen.add(dosen3);
        listDosen.add(dosen4);
        listDosen.add(dosen5);
        listDosen.add(dosen6);
        listDosen.add(dosen7);
        listDosen.add(dosen8);
        listDosen.add(dosen9);
        listDosen.add(dosen10);

        // Buat data mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("Ahmad Rizky", "08123456780", "ahmad@polban.ac.id", "2000-01-01", "Laki-laki", "M001", "Teknik Informatika", 2020, "Aktif", "2020-08-01");
        Mahasiswa mahasiswa2 = new Mahasiswa("Putri Ayu", "08123456781", "putri@polban.ac.id", "2000-02-02", "Perempuan", "M002", "Teknik Elektro", 2020, "Aktif", "2020-08-01");
        Mahasiswa mahasiswa3 = new Mahasiswa("Budi Setiawan", "08123456782", "budi@polban.ac.id", "2000-03-03", "Laki-laki", "M003", "Teknik Mesin", 2020, "Aktif", "2020-08-01");
        Mahasiswa mahasiswa4 = new Mahasiswa("Dewi Sartika", "08123456783", "dewi@polban.ac.id", "2000-04-04", "Perempuan", "M004", "Teknik Sipil", 2020, "Aktif", "2020-08-01");
        Mahasiswa mahasiswa5 = new Mahasiswa("Eko Prabowo", "08123456784", "eko@polban.ac.id", "2000-05-05", "Laki-laki", "M005", "Teknik Elektro", 2020, "Aktif", "2020-08-01");
        Mahasiswa mahasiswa6 = new Mahasiswa("Fani Anisa", "08123456785", "fani@polban.ac.id", "2000-06-06", "Perempuan", "M006", "Teknik Informatika", 2020, "Aktif", "2020-08-01");
        Mahasiswa mahasiswa7 = new Mahasiswa("Gilang Pratama", "08123456786", "gilang@polban.ac.id", "2000-07-07", "Laki-laki", "M007", "Teknik Mesin", 2020, "Aktif", "2020-08-01");
        Mahasiswa mahasiswa8 = new Mahasiswa("Hani Rahma", "08123456787", "hani@polban.ac.id", "2000-08-08", "Perempuan", "M008", "Teknik Sipil", 2020, "Aktif", "2020-08-01");
        Mahasiswa mahasiswa9 = new Mahasiswa("Irfan Maulana", "08123456788", "irfan@polban.ac.id", "2000-09-09", "Laki-laki", "M009", "Teknik Kimia", 2020, "Aktif", "2020-08-01");
        Mahasiswa mahasiswa10 = new Mahasiswa("Jasmine Sari", "08123456789", "jasmine@polban.ac.id", "2000-10-10", "Perempuan", "M010", "Teknik Lingkungan", 2020, "Aktif", "2020-08-01");
        // Menyimpan data mahasiswa tambahan dalam list
        List<Mahasiswa> listMahasiswa = new ArrayList<>();
        listMahasiswa.add(mahasiswa1);
        listMahasiswa.add(mahasiswa2);
        listMahasiswa.add(mahasiswa3);
        listMahasiswa.add(mahasiswa4);
        listMahasiswa.add(mahasiswa5);
        listMahasiswa.add(mahasiswa6);
        listMahasiswa.add(mahasiswa7);
        listMahasiswa.add(mahasiswa8);
        listMahasiswa.add(mahasiswa9);
        listMahasiswa.add(mahasiswa10);

        // Membuat list untuk jadwal kuliah
        List<JadwalAkademik> listJadwalKuliah = new ArrayList<>();

        // Tambahkan jadwal kuliah langsung
        listJadwalKuliah.add(new JadwalAkademik("Senin", 3, "08.40", "10.40", "21IF2015", "Komputer Grafik", "TE", dosen1, "Ruang D105", "Kelas 2B-D3", 30, 5, "2024 Semester Ganjil"));
        listJadwalKuliah.add(new JadwalAkademik("Senin", 5, "09.50-", "12.20", "21IF2013", "Pengantar Rekayasa Perangkat Lunak", "TE", dosen2, "Ruang D105", "Kelas B", 25, 5, "2024 Semester Ganjil"));
        listJadwalKuliah.add(new JadwalAkademik("Senin", 5, "09.50-", "12.20", "21IF2013", "Komputer Grafik", "PR", dosen2, "Ruang D102", "Kelas 2B-D3", 25, 5, "2024 Semester Ganjil"));
        listJadwalKuliah.add(new JadwalAkademik("Selasa", 2, "10:00", "12:00", "MK002", "Basis Data", "PR", dosen2, "Ruang 202", "Kelas B", 25, 5, "2024 Semester Ganjil"));
        listJadwalKuliah.add(new JadwalAkademik("Selasa", 1, "08:00", "10:00", "MK001", "Aljabar Linear", "TE", dosen1, "Ruang 101", "Kelas A", 30, 5, "2024 Semester Ganjil"));
        listJadwalKuliah.add(new JadwalAkademik("Rabu", 2, "10:00", "12:00", "MK002", "Proyek 3", "TE", dosen2, "Ruang 202", "Kelas B", 25, 5, "2024 Semester Ganjil"));
        listJadwalKuliah.add(new JadwalAkademik("Kamis", 1, "08:00", "10:00", "MK001", "Basis Data", "TE", dosen1, "Ruang 101", "Kelas A", 30, 5, "2024 Semester Ganjil"));
        listJadwalKuliah.add(new JadwalAkademik("Kamis", 2, "10:00", "12:00", "MK002", "Pemograman Berorientasi Objek", "TE", dosen2, "Ruang 202", "Kelas B", 25, 5, "2024 Semester Ganjil"));
        listJadwalKuliah.add(new JadwalAkademik("Kamis", 1, "08:00", "10:00", "MK001", "Pemograman Berorientasi Objek", "PR", dosen1, "Ruang 101", "Kelas A", 30, 5, "2024 Semester Ganjil"));
        listJadwalKuliah.add(new JadwalAkademik("Kamis", 2, "10:00", "12:00", "MK002", "Matematika Diskrit 2", "TE", dosen2, "Ruang 202", "Kelas B", 25, 5, "2024 Semester Ganjil"));
        listJadwalKuliah.add(new JadwalAkademik("Jumat", 1, "08:00", "10:00", "MK001", "Pengantar Rekayasa Perangkat Lunak", "PR", dosen1, "Ruang 101", "Kelas A", 30, 5, "2024 Semester Ganjil"));


        // Membuat menu
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Tampilkan Dosen");
            System.out.println("2. Tampilkan Mahasiswa");
            System.out.println("3. Tampilkan Jadwal Kuliah");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Clear newline

            switch (pilihan) {
                case 1:
                    // Tampilkan daftar dosen
                    System.out.println("\n=== Daftar Dosen ===");
                    for (Dosen dosen : listDosen) {
                        System.out.println("Nama: " + dosen.nama);
                        System.out.println("NIDN: " + dosen.nidn);
                        System.out.println("Jabatan: " + dosen.jabatan);
                        System.out.println("Departemen: " + dosen.departemen);
                        System.out.println("--------------------");
                    }
                    break;
                case 2:
                    // Tampilkan daftar mahasiswa
                    System.out.println("\n=== Daftar Mahasiswa ===");
                    for (Mahasiswa mahasiswa : listMahasiswa) {
                        System.out.println(mahasiswa);  // Memanggil toString()
                        System.out.println("--------------------");
                    }
                    break;
                case 3:
                    // Tampilkan jadwal kuliah dalam format tabel
                    System.out.println("\n=== Jadwal Kuliah ===");
                    System.out.printf("%-10s %-8s %-15s %-15s %-10s %-35s %-10s %-15s %-20s %-10s\n",
                            "Hari", "Jam Ke", "Waktu Mulai", "Waktu Selesai", "Kode MK", "Nama MK", "TE/PR", "NIDN Dosen", "Nama Dosen", "Ruang");
                    System.out.println("---------------------------------------------------------------------------------------------------------------");
                    for (JadwalAkademik jadwal : listJadwalKuliah) {
                        System.out.printf("%-10s %-8d %-15s %-15s %-10s %-35s %-10s %-15s %-20s %-10s\n",
                                jadwal.hari, jadwal.jamKe, jadwal.waktuMulai, jadwal.waktuSelesai, jadwal.kodeMK, jadwal.namaMK, jadwal.tePr,
                                jadwal.dosenPengajar.nidn, jadwal.dosenPengajar.nama, jadwal.ruangan);
                    }

                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        } while (pilihan != 0);

        scanner.close();
    }
}
