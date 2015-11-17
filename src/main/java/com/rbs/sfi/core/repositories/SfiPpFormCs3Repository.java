package com.rbs.sfi.core.repositories;

import com.rbs.sfi.core.entities.SfiPpFormCs3;

import java.util.List;

public interface SfiPpFormCs3Repository
{
    List<SfiPpFormCs3>list();
    SfiPpFormCs3 findById(int id);
}
