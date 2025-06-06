/* SeatService.java
     Seat Service class
     Author: SM Rawoot (221075127)
     Date: 25 May 2025 */
package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Seat;
import za.ac.cput.repository.SeatRepository;

import java.util.List;

@Service
public class SeatService implements ISeatService {

    private ISeatService service;
    @Autowired
    private SeatRepository repository;

    @Override
    public Seat create(Seat seat) {
        return this.repository.save(seat);
    }

    @Override
    public Seat read(String id) {
        return this.repository.findById(id).orElse(null);
    }

    @Override
    public Seat update(Seat seat) {
        return this.repository.save(seat);
    }

    @Override
    public boolean delete(String id) {
        this.repository.deleteById(id);
        return true;
    }

    @Override
    public List<Seat> getAll() {
        return this.repository.findAll();
    }
}
