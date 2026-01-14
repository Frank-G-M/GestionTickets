package com.fguerrero.ticket_service.repository;

import com.fguerrero.ticket_service.domain.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
