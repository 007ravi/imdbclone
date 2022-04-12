package com.coducer.imdbclone.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int m_id;

    private String m_name;

    private String m_desc;

    public movie() {
    }

    public movie(int m_id, String m_name, String m_desc) {
        this.m_id = m_id;
        this.m_name = m_name;
        this.m_desc = m_desc;
    }


    public int getM_id() {
        return m_id;
    }

    public void setM_id(int m_id) {
        this.m_id = m_id;
    }

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public String getM_desc() {
        return m_desc;
    }

    public void setM_desc(String m_desc) {
        this.m_desc = m_desc;
    }
}
