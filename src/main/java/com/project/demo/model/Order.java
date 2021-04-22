package com.project.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="order_barang")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nama_barang;
	private String keterangan_pemesanan;
	private Integer jumlah_yang_dipesan;
	private String nama_pemesan;
	private String alamat_pemesan;
	private Date tanggal_pemesanan;
	
	
	
	
	public Order() {
	}


	public Order(Integer id, String nama_barang, String keterangan_pemesanan, Integer jumlah_yang_dipesan,
			String nama_pemesan, String alamat_pemesan, Date tanggal_pemesanan) {
		super();
		this.id = id;
		this.nama_barang = nama_barang;
		this.keterangan_pemesanan = keterangan_pemesanan;
		this.jumlah_yang_dipesan = jumlah_yang_dipesan;
		this.nama_pemesan = nama_pemesan;
		this.alamat_pemesan = alamat_pemesan;
		this.tanggal_pemesanan = tanggal_pemesanan;
	}
	

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNama_barang() {
		return nama_barang;
	}
	public void setNama_barang(String nama_barang) {
		this.nama_barang = nama_barang;
	}
	public String getKeterangan_pemesanan() {
		return keterangan_pemesanan;
	}
	public void setKeterangan_pemesanan(String keterangan_pemesanan) {
		this.keterangan_pemesanan = keterangan_pemesanan;
	}
	public Integer getJumlah_yang_dipesan() {
		return jumlah_yang_dipesan;
	}
	public void setJumlah_yang_dipesan(Integer jumlah_yang_dipesan) {
		this.jumlah_yang_dipesan = jumlah_yang_dipesan;
	}
	public String getNama_pemesan() {
		return nama_pemesan;
	}
	public void setNama_pemesan(String nama_pemesan) {
		this.nama_pemesan = nama_pemesan;
	}
	public String getAlamat_pemesan() {
		return alamat_pemesan;
	}
	public void setAlamat_pemesan(String alamat_pemesan) {
		this.alamat_pemesan = alamat_pemesan;
	}
	public Date getTanggal_pemesanan() {
		return tanggal_pemesanan;
	}
	public void setTanggal_pemesanan(Date tanggal_pemesanan) {
		this.tanggal_pemesanan = tanggal_pemesanan;
	}
	
	
}
