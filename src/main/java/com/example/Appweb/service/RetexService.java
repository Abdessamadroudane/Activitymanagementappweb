package com.example.Appweb.service;
import com.example.Appweb.entities.Retex;

import java.util.List;

public interface RetexService {
    Retex createRetex(Retex retex);
    Retex updateRetex(Retex retex);
    void deleteRetex(Integer retexId);
    Retex getRetexById(Integer retexId);
    List<Retex> getAllRetexes();
    List<Retex> getRetexesByUser(Integer userId);
    List<Retex> getRetexesByProject(Integer projectId);

    List<Retex> getAllRetex();
}
