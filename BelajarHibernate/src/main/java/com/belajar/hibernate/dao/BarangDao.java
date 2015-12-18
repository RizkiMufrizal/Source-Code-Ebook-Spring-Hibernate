package com.belajar.hibernate.dao;

import com.belajar.hibernate.model.Barang;
import java.util.List;

/**
 * @Author Rizki Mufrizal
 * @Since Dec 6, 2015
 */
public interface BarangDao {

    public void save(Barang barang);

    public void update(Barang barang);

    public void delete(Barang barang);

    public Barang getBarang(String idBarang);

    public List<Barang> getBarangs();
}
