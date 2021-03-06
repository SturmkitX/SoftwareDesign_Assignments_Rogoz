package interfaces;

import java.util.List;
import java.util.Set;

import entities.Tournament;

public interface TournamentDAO {
    Tournament findTournament(int id);
    Set<Tournament> findAll();
    Tournament findTournamentByName(String name);
    void insertTournament(Tournament tournament);
    void updateTournament(Tournament tournament);
    void deleteTournament(Tournament tournament);
}