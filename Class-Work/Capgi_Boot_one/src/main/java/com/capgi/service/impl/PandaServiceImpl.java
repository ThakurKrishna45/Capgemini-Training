package com.capgi.service.impl;

import com.capgi.entity.Panda;
import com.capgi.repository.PandaRepository;
import com.capgi.service.PandaService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PandaServiceImpl implements PandaService {

    private final PandaRepository pandaRepository;


    @Override
    public void save(Panda panda) {
        pandaRepository.save(panda);
    }
}
