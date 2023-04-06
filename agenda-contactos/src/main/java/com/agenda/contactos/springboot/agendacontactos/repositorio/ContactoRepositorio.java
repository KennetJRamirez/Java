package com.agenda.contactos.springboot.agendacontactos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agenda.contactos.springboot.agendacontactos.modelo.Contacto;

public interface ContactoRepositorio extends JpaRepository<Contacto, Integer>{
    
}
