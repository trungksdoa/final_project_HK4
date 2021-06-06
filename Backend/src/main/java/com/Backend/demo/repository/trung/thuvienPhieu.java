package com.Backend.demo.repository.trung;

import org.springframework.data.repository.CrudRepository;

import com.Backend.demo.model.trung.Phieunhapxuat;  
import org.springframework.data.jpa.repository.JpaRepository;

public interface thuvienPhieu extends JpaRepository<Phieunhapxuat, String>
{

}
