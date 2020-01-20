package pt.upacademy.coreFinalProject.services;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.Event;
import pt.upacademy.coreFinalProject.models.DTOS.EventDTO;
import pt.upacademy.coreFinalProject.repositories.EventRepository;


@RequestScoped
public class EventService extends EntityService <EventRepository, Event>{

}
