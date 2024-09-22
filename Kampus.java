import java.util.ArrayList;
import java.util.List;

// Kelas untuk mendeskripsikan data kampus
class Kampus {
    String namaKampus;
    String telepon;
    String emailKampus;
    String website;

    // Constructor
    public Kampus(String namaKampus, String telepon, String emailKampus, String website) {
        this.namaKampus = namaKampus;
        this.telepon = telepon;
        this.emailKampus = emailKampus;
        this.website = website;
    }
}

// Kelas dasar untuk sivitas akademik
class SivitasAkademik {
    String nama;
    String telepon;
    String email;
    String tanggalLahir;
    String jenisKelamin;

    // Constructor
    public SivitasAkademik(String nama, String telepon, String email, String tanggalLahir, String jenisKelamin) {
        this.nama = nama;
        this.telepon = telepon;
        this.email = email;
        this.tanggalLahir = tanggalLahir;
        this.jenisKelamin = jenisKelamin;
    }
}

// Kelas untuk mahasiswa
class Mahasiswa extends SivitasAkademik {
    String nim;
    String programStudi;
    Integer angkatan;
    String status;
    String tanggalMasuk;

    // Constructor
    public Mahasiswa(String nama, String telepon, String email, String tanggalLahir, String jenisKelamin,
                     String nim, String programStudi, Integer angkatan, String status, String tanggalMasuk) {
        super(nama, telepon, email, tanggalLahir, jenisKelamin);
        this.nim = nim;
        this.programStudi = programStudi;
        this.angkatan = angkatan;
        this.status = status;
        this.tanggalMasuk = tanggalMasuk;
    }

    @Override
    public String toString() {
        return String.format("Nama: %s, NIM: %s, Prodi: %s", nama, nim, programStudi);
    }
}

// Kelas untuk dosen
class Dosen extends SivitasAkademik {
    String nidn;
    String jabatan;
    String departemen;
    String tanggalBergabung;
    String status;

    // Constructor
    public Dosen(String nama, String telepon, String email, String tanggalLahir, String jenisKelamin,
                 String nidn, String jabatan, String departemen, String tanggalBergabung, String status) {
        super(nama, telepon, email, tanggalLahir, jenisKelamin);
        this.nidn = nidn;
        this.jabatan = jabatan;
        this.departemen = departemen;
        this.tanggalBergabung = tanggalBergabung;
        this.status = status;
    }

    @Override
    public String toString() {
        return String.format("Nama: %s, NIDN: %s, Jabatan: %s", nama, nidn, jabatan);
    }
}

// Kelas untuk menyimpan informasi akademik
class Akademik {
    Integer jumlahMahasiswa;
    Integer jumlahDosen;
    String periodeAkademik;
    List<JadwalAkademik> jadwalAkademikList; // Menyimpan jadwal akademik

    // Constructor
    public Akademik(Integer jumlahMahasiswa, Integer jumlahDosen, String periodeAkademik) {
        this.jumlahMahasiswa = jumlahMahasiswa;
        this.jumlahDosen = jumlahDosen;
        this.periodeAkademik = periodeAkademik;
        this.jadwalAkademikList = new ArrayList<>(); // Inisialisasi list
    }

    // Method untuk menambahkan jadwal akademik
    public void addJadwalAkademik(JadwalAkademik jadwalAkademik) {
        this.jadwalAkademikList.add(jadwalAkademik);
    }

    public List<JadwalAkademik> getJadwalAkademikList() {
        return jadwalAkademikList;
    }
}

// Kelas untuk jadwal akademik
class JadwalAkademik extends Akademik {
    String hari;
    int jamKe;
    String waktuMulai;
    String waktuSelesai;
    String kodeMK;
    String namaMK;
    String tePr; // Teori (TE) atau Praktikum (PR)
    Dosen dosenPengajar;
    String ruangan;
    String kelas;

    // Constructor
    public JadwalAkademik(String hari, int jamKe, String waktuMulai, String waktuSelesai, String kodeMK,
                          String namaMK, String tePr, Dosen dosenPengajar, String ruangan, String kelas,
                          Integer jumlahMahasiswa, Integer jumlahDosen, String periodeAkademik) {
        super(jumlahMahasiswa, jumlahDosen, periodeAkademik); // Menggunakan nama yang lebih deskriptif
        this.hari = hari;
        this.jamKe = jamKe;
        this.waktuMulai = waktuMulai;
        this.waktuSelesai = waktuSelesai;
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.tePr = tePr;
        this.dosenPengajar = dosenPengajar;
        this.ruangan = ruangan;
        this.kelas = kelas;
    }

    @Override
    public String toString() {
        return String.format("Hari: %s, Jam ke: %d, Waktu: %s - %s, Kode MK: %s, Nama MK: %s, Tipe: %s, Kode Dosen: %s, Nama Dosen: %s, Ruangan: %s, Kelas: %s",
                hari, jamKe, waktuMulai, waktuSelesai, kodeMK, namaMK, tePr, dosenPengajar.nidn, dosenPengajar.nama, ruangan, kelas);
    }
}
