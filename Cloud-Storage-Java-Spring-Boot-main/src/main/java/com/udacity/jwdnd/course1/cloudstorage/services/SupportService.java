package com.udacity.jwdnd.course1.cloudstorage.services;

import com.udacity.jwdnd.course1.cloudstorage.mapper.SupportMapper;
import com.udacity.jwdnd.course1.cloudstorage.model.SupportReport;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupportService {
    private final SupportMapper supportMapper;

    public SupportService(SupportMapper supportMapper) {
        this.supportMapper = supportMapper;
    }

    public Integer createReport(String subject, String message, Integer userId) {
        SupportReport report = new SupportReport();
        report.setSubject(subject);
        report.setMessage(message);
        report.setUserId(userId);
        return supportMapper.insert(report);
    }

    public List<SupportReport> getAllReports() {
        return supportMapper.getAllReports();
    }

    public void deleteReport(Integer id) {
        supportMapper.delete(id);
    }

    public void deleteReportsByUserId(Integer userId) {
        supportMapper.deleteByUserId(userId);
    }
}
