package com.rbs.sfi.core.repositories;

import com.rbs.sfi.core.entities.SfiPpFormAllCountry;

import java.util.List;

public interface SfiPpFormAllCountryRepository
{
    SfiPpFormAllCountry findById(int id);
    List<SfiPpFormAllCountry> list();
    SfiPpFormAllCountry merge(SfiPpFormAllCountry entity);
}