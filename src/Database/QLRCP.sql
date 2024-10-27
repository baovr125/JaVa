-- Tạo cơ sở dữ liệu
USE [master];
GO
CREATE DATABASE QuanLyRapChieuPhim;
Go
USE QuanLyRapChieuPhim;
GO

-- Tạo bảng Khach
CREATE TABLE Khach (
    maKH VARCHAR(10) PRIMARY KEY,
    hoTen NVARCHAR(255),
    SDT INT
);
GO

-- Tạo bảng NhanVien
CREATE TABLE NhanVien (
    maNV VARCHAR(10) PRIMARY KEY,
    hoTen NVARCHAR(255),
    sdt INT,
    vaiTro NVARCHAR(255)
);
GO

-- Tạo bảng SanPhamBanKem
CREATE TABLE SanPhamBanKem (
    maSP VARCHAR(10) PRIMARY KEY,
    tenSP NVARCHAR(255),
    gia DECIMAL(10, 2)
);
GO

-- Tạo bảng Phim
CREATE TABLE Phim (
    maPhim VARCHAR(10) PRIMARY KEY,
    tenPhim NVARCHAR(255),
    daoDien NVARCHAR(255),
    namSanXuat INT,
    thoiLuong INT,
    gioHanDoTuoi INT,
    moTa NVARCHAR(255)
);
GO

-- Tạo bảng TheLoai
CREATE TABLE TheLoai (
    maTheLoai VARCHAR(10) PRIMARY KEY,
    tenTheLoai NVARCHAR(255)
);
GO

-- Tạo bảng trung gian Phim_TheLoai để liên kết nhiều-nhiều giữa Phim và TheLoai
CREATE TABLE Phim_TheLoai (
    maPhim VARCHAR(10),
    maTheLoai VARCHAR(10),
    PRIMARY KEY (maPhim, maTheLoai),
    FOREIGN KEY (maPhim) REFERENCES Phim(maPhim),
    FOREIGN KEY (maTheLoai) REFERENCES TheLoai(maTheLoai)
);
GO

-- Tạo bảng Phong
CREATE TABLE Phong (
    maPhong VARCHAR(10) PRIMARY KEY,
    soLuongGhe INT
);
GO

-- Tạo bảng Ghe với liên kết đến Phong
CREATE TABLE Ghe (
    maGhe VARCHAR(10) PRIMARY KEY,
    maPhong VARCHAR(10),
    trangThai NVARCHAR(255),
    FOREIGN KEY (maPhong) REFERENCES Phong(maPhong)
);
GO

-- Tạo bảng VePhim với liên kết đến Phong, Phim và Ghe
CREATE TABLE VePhim (
    maVe VARCHAR(10) PRIMARY KEY,
    gioChieu TIME,
    maPhong VARCHAR(10),
    maPhim VARCHAR(10),
    maGhe VARCHAR(10),
    giaVe DECIMAL(10, 2),
    FOREIGN KEY (maPhong) REFERENCES Phong(maPhong),
    FOREIGN KEY (maPhim) REFERENCES Phim(maPhim),
    FOREIGN KEY (maGhe) REFERENCES Ghe(maGhe)
);
GO

-- Tạo bảng HoaDon
CREATE TABLE HoaDon (
    maHD VARCHAR(10) PRIMARY KEY,
    ngayTao DATE,
    hinhThucThanhToan NVARCHAR(255),
    maKH VARCHAR(10),
    maNV VARCHAR(10),
    FOREIGN KEY (maKH) REFERENCES Khach(maKH),
    FOREIGN KEY (maNV) REFERENCES NhanVien(maNV)
);
GO

-- Tạo bảng CTHoaDon (Chi tiết hóa đơn) với liên kết đến HoaDon và SanPhamBanKem
CREATE TABLE CTHoaDon (
    maCTHD VARCHAR(10) PRIMARY KEY,
    maHD VARCHAR(10), -- Tham chiếu đến HoaDon
    maVe VARCHAR(10),
    maSP VARCHAR(10),
    soLuong INT,
    tenSanPham NVARCHAR(255),
    FOREIGN KEY (maHD) REFERENCES HoaDon(maHD),
    FOREIGN KEY (maVe) REFERENCES VePhim(maVe),
    FOREIGN KEY (maSP) REFERENCES SanPhamBanKem(maSP)
);
GO
