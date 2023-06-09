-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 27 Bulan Mei 2021 pada 16.14
-- Versi server: 10.1.36-MariaDB
-- Versi PHP: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pw2`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_admin`
--

CREATE TABLE `tb_admin` (
  `id_admin` int(10) NOT NULL,
  `nama_depan` varchar(50) NOT NULL,
  `nama_belakang` varchar(50) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(20) NOT NULL,
  `kode_refferal` varchar(15) NOT NULL,
  `tgl_lahir` varchar(13) NOT NULL,
  `alamat` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_admin`
--

INSERT INTO `tb_admin` (`id_admin`, `nama_depan`, `nama_belakang`, `username`, `password`, `kode_refferal`, `tgl_lahir`, `alamat`) VALUES
(33448, 'cachee', 'agl', 'cachee', 'cacheagl', '90990ad', '2020-11-13', 'cikampak'),
(115201, 'Dian ', 'Lestari', 'dian1234', 'dian', 'ab1234', '2003-12-05', 'balebak'),
(300659, 'rifki ', 'alfariz', 'rifkii', 'rifki1234', 'boy1234', '2020-12-10', 'cibanteng'),
(469041, 'iewb', 'wiebk', 'abc', 'abc', '123456', '2020-12-11', 'loji'),
(666516, 'tania', 'susanto', 'taniaa', 'tania123', '1111', '2020-11-12', 'cikampak'),
(790710, 'sintia', 'aluna', 'sintiaa', 'sintia123', '2a27ad', '2020-11-12', 'cibanteng');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_ekskul`
--

CREATE TABLE `tb_ekskul` (
  `ekskul` varchar(50) NOT NULL,
  `nama_pelatih` varchar(50) NOT NULL,
  `status` varchar(30) NOT NULL,
  `id_admin` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_ekskul`
--

INSERT INTO `tb_ekskul` (`ekskul`, `nama_pelatih`, `status`, `id_admin`) VALUES
(' PALADIS', 'Pa Fariz Mutaqqin', 'Tersedia', 0),
('REISAS', 'Riski Muttaqin', 'Tersedia', 0),
('PASKIBRA', 'riandi putra', 'Belum Tersedia', 33448),
('PMR', 'Kang Acung', 'Tersedia', 33448),
('Jaipong', 'Risma', 'Tersedia', 115201);

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_laporan`
--

CREATE TABLE `tb_laporan` (
  `nis` int(15) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `laporan` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_laporan`
--

INSERT INTO `tb_laporan` (`nis`, `nama`, `laporan`) VALUES
(10181468, 'Christian', 'nama saya keliru '),
(10181527, 'hardiansyah', 'saya sudah ga ekskul disitu pak'),
(10183212, 'Daffa', 'sakit perut'),
(10187777, 'toddy', 'pak saya sudah keluar dari ekskul');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_pendaftaran`
--

CREATE TABLE `tb_pendaftaran` (
  `nis` int(12) NOT NULL,
  `nama_lengkap` varchar(50) NOT NULL,
  `jk` varchar(20) NOT NULL,
  `kelas` varchar(10) NOT NULL,
  `jurusan` varchar(50) NOT NULL,
  `agama` varchar(15) NOT NULL,
  `ekskul` varchar(50) NOT NULL,
  `usia` varchar(15) NOT NULL,
  `alamat` text NOT NULL,
  `jml_ekskul` int(2) NOT NULL,
  `bukti_foto` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_pendaftaran`
--

INSERT INTO `tb_pendaftaran` (`nis`, `nama_lengkap`, `jk`, `kelas`, `jurusan`, `agama`, `ekskul`, `usia`, `alamat`, `jml_ekskul`, `bukti_foto`) VALUES
(123, 'shanti dermawan', 'LAKI-LAKI', 'xii2', 'RPL', 'KONGHUCU', 'KARATE', '16', 'ciherang', 1, ''),
(62992, 'WINDI', 'LAKI-LAKI', 'X RPL 8', 'RPL', 'KATHOLIK', 'PERISAI DIRI', '30', 'CIBADAK', 2, ''),
(808080, 'archie maftuh', 'PEREMPUAN', 'xii gmk 2', 'GEOMATIKA', 'ISLAM', 'KARATE', '18', 'ciomas', 2, ''),
(9999999, 'JEON JUNGKOOK', 'LAKI-LAKI', 'xi rpl 2', 'RPL', 'ISLAM', 'PASKIBRA', '17 tahun', 'busan', 2, ''),
(10181527, 'erik thohir', 'LAKI-LAKI', 'xii rpl 2', 'RPL', 'ISLAM', 'REISAS', '72 th', 'cangkurawok', 2, ''),
(10183212, 'reynhard sinaga', 'PEREMPUAN', 'xii mk 3', 'MEKATRONIKA', 'KATHOLIK', 'PASKIBRA', '17', 'jakarta', 7, ''),
(10186456, 'Christian ', 'LAKI-LAKI', 'RPL', 'RPL', 'ISLAM', 'PALADIS', '17 tahun', 'sindang barang loji DEKAT SDN LOJI 3', 0, ''),
(10187777, 'toddy ersan daniswara', 'LAKI-LAKI', 'XII tkj 3', 'TKJ', 'ISLAM', 'BAND', '17 tahun', 'tegal gundil jl drupada no 12', 0, ''),
(101823456, 'ADRIAN TIRTAMANGGALA', 'LAKI-LAKI', 'XI RPL 2', 'RPL', 'ISLAM', 'PMR', '17', 'LOJI', 1, ''),
(101843565, 'Bagas Prasetio', 'LAKI-LAKI', 'RPL', 'GEOTA', 'ISLAM', 'BOLA VOLI', '17 Tahun', 'rawajaha setu gede', 0, ''),
(101843566, 'MIKKO', 'LAKI-LAKI', 'XII TB 2', 'TATA BUSANA', 'ISLAM', 'DANCE TRADISIONAL', '24', 'LOJI', 8, '');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_siswa`
--

CREATE TABLE `tb_siswa` (
  `nama_depan` varchar(50) NOT NULL,
  `nama_belakang` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(20) NOT NULL,
  `nis` varchar(15) NOT NULL,
  `tanggal_lahir` varchar(20) NOT NULL,
  `alamat` text NOT NULL,
  `id_siswa` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_siswa`
--

INSERT INTO `tb_siswa` (`nama_depan`, `nama_belakang`, `username`, `password`, `nis`, `tanggal_lahir`, `alamat`, `id_siswa`) VALUES
('Christian', 'Ramdhoni', '081102', 'ramdhoni', '0', '081102', 'loji', 1),
('cece', 'arifan', '2002', 'bencong', '0', '2002', 'jakarta', 2),
('dapunta', 'hyang', 'dapunta6', 'hyang', '0', '2002', 'jonggol', 3),
('cece', 'drepan', 'cece45', 'cece455', '0', '1999 07 09', 'jakarta', 5),
('shinta', 'irawan', 'shinta455', 'shinta45', '0', '1997 01 13', 'ciherang', 6),
('ARCHIE', 'MAFTUH RAHMAN', 'archie123', 'archie7', '0', '2002 08 11', 'cisarua', 7),
('saya', 'gakuat', 'sayaa', 'saya123', '10181468', '2020-11-06', 'loji', 20900),
('Daffa', 'kusuma', 'daffabizaaa', 'daffa123', '10183212', '2016-08-06', 'sbj aja', 51318),
('hardiansyah', 'tri saputra', 'hardii', 'hardi123', '10181527', '2020-11-05', 'dramaga', 112869),
('ramdhoni', 'aja', 'ramdhoni_christian', 'ramdhoni45', '0', '2002-11-08', 'loji', 325607),
('nasi', 'padang', 'naspad', 'naspad', '10189761', '2020-12-03', 'padang', 326583),
('Christian', 'ramdhoni', 'ramdhoniaja', 'ramdhoni', '10181468', '2020-12-17', 'Loji', 362014),
('jeon', 'jungkook', 'jk25', 'jk255', '0', '2002 11 08', 'hanam dong', 479349),
('Christian', 'Ramdhoni', 'RAMDHONI123', 'DONI123', '10181468', '2002-11-08', 'Loji', 668170),
('mamank', 'garok', 'garok', 'garok123', '10181212', '2020-12-10', 'jakarta', 678885),
('toddy', 'ersan', 'toddy_', 'toddy257', '10187777', '2020-09-16', 'tegal gundil jl drupada no 12', 753257);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tb_admin`
--
ALTER TABLE `tb_admin`
  ADD PRIMARY KEY (`id_admin`);

--
-- Indeks untuk tabel `tb_laporan`
--
ALTER TABLE `tb_laporan`
  ADD PRIMARY KEY (`nis`);

--
-- Indeks untuk tabel `tb_pendaftaran`
--
ALTER TABLE `tb_pendaftaran`
  ADD PRIMARY KEY (`nis`);

--
-- Indeks untuk tabel `tb_siswa`
--
ALTER TABLE `tb_siswa`
  ADD PRIMARY KEY (`id_siswa`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `tb_admin`
--
ALTER TABLE `tb_admin`
  MODIFY `id_admin` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=790711;

--
-- AUTO_INCREMENT untuk tabel `tb_pendaftaran`
--
ALTER TABLE `tb_pendaftaran`
  MODIFY `nis` int(12) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=101843567;

--
-- AUTO_INCREMENT untuk tabel `tb_siswa`
--
ALTER TABLE `tb_siswa`
  MODIFY `id_siswa` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=753258;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
