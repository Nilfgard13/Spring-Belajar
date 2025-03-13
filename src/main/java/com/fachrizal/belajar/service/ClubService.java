package com.fachrizal.belajar.service;

import com.fachrizal.belajar.dto.ClubDto;
import com.fachrizal.belajar.models.Club;

import java.util.List;

public interface ClubService {
    List<ClubDto> findAllClubs();

    Club saveClub(Club club);

    ClubDto findClubById(Long clubId);

    void updateClub(ClubDto club);
}
