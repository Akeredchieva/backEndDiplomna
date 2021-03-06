package com.anakeredchieva.doctor.sheduler.services;

import com.anakeredchieva.doctor.sheduler.api.NotFoundException;
import com.anakeredchieva.doctor.sheduler.entities.PatientsDiseases;
import com.anakeredchieva.doctor.sheduler.model.DiseasesTO;
import com.anakeredchieva.doctor.sheduler.model.PatientTO;

import java.util.List;

/**
 * Created by akere on 05/12/2018.
 */
public interface PatientService {
    //TODO: направи си javadoc за всиччки методи и за самия интърфейс
    /**
     *
     * @param patientTO {@link PatientTO}
     */
    void createPatients(PatientTO patientTO);

    List<PatientTO> findAllPatients() throws NotFoundException;

    PatientTO updatePatients(PatientTO patientTO, Integer id);

    PatientTO findPatientById(Integer id);

    void deletePatient(Integer id);

    List<DiseasesTO> findDiseaseByPatientId(Integer patientId);

    void deletePatientDisease(Integer patientId, Integer diseaseId);

    void updatePatientDisease(DiseasesTO diseasesTO, Integer patientId, Integer diseaseId);
}
