package com.aminata.gestionstagiaire.serviceImpl;

import com.aminata.gestionstagiaire.entites.Departement;
import com.aminata.gestionstagiaire.entites.Service;
import com.aminata.gestionstagiaire.repository.ServiceRepository;
import com.aminata.gestionstagiaire.service.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@org.springframework.stereotype.Service
public class ServicesServiceImpl implements ServicesService {

    @Autowired
    ServiceRepository serviceRepository;
    @Override
    public Service saveService(Service s) {
        return serviceRepository.save(s);
    }

    @Override
    public Service updateService(Service s) {
        return serviceRepository.save(s);
    }

    @Override
    public void deleteService(Service s) {
        serviceRepository.delete(s);
    }

    @Override
    public void deleteServiceById(Long uio) {
        serviceRepository.deleteById(uio);
    }

    @Override
    public Service getServiceById(Long uio) {
        return serviceRepository.findById(uio).get();
    }

    @Override
    public List<Service> getAllService() {
        return serviceRepository.findAll();
    }

    @Override
    public List<Service> findByDepartement(Departement departement) {
        return serviceRepository.findByDepartement(departement);
    }

    @Override
    public Service findByNom(String nom) {
        return serviceRepository.findByNom(nom);
    }

    @Override
    public List<Service> findByNombreemploye(Long nombreemploye) {
        return serviceRepository.findByNombreemploye(nombreemploye);
    }
}
