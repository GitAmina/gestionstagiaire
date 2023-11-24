package com.aminata.gestionstagiaire.service;

import com.aminata.gestionstagiaire.entites.Departement;
import com.aminata.gestionstagiaire.entites.Service;

import java.util.List;
@org.springframework.stereotype.Service
public interface ServicesService {
    Service saveService(Service s);
    Service updateService(Service s);
    void deleteService(Service s);
    void deleteServiceById(Long uio);
    Service getServiceById(Long uio);
    List<Service> getAllService();
    List<Service> findByDepartement(Departement departement);
    Service findByNom(String nom);
    List<Service> findByNombreemploye(Long nombreemploye);
}
