package com.christian.ventauniforme.repository;

import com.christian.ventauniforme.model.Vestimenta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VestimentaRepository extends JpaRepository<Vestimenta, String> {
    List<Vestimenta> findByTituloContainingIIdgnoreCaseOrDescripcionContainingIgnoreCaseOrIdContainingIgnoreCase(String titulo, String descripcion, String id);
    List<Vestimenta> findTop10ByOrderByFechaInsertadoDesc();
    List<Vestimenta> findByCategoria(String categoria);
}
