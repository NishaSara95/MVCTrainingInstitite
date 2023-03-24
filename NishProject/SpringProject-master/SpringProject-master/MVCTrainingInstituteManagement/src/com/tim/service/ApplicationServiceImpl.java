/*
 * package com.tim.service;
 * 
 * import java.util.List; import java.util.stream.Collectors;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service;
 * 
 * import com.tim.entity.Application_Tbl; import com.tim.model.ApplicationVO;
 * import com.tim.repository.ApplicationRepository;
 * 
 * @Service public class ApplicationServiceImpl implements ApplicationService {
 * 
 * @Autowired ApplicationRepository applicationRepository;
 * 
 * @Override public List<ApplicationVO> findAll() {
 * 
 * 
 * List<Application_Tbl> application_Tbls = applicationRepository.findAll();
 * //To query the records, use applicationrepo.findAll List<ApplicationVO>
 * applicationVOS = application_Tbls.parallelStream().map(application -> {
 * ApplicationVO applicationVO = new ApplicationVO();
 * applicationVO.setApplicationid(application.getApplicationid());
 * applicationVO.setDescription(application.getDescription());
 * applicationVO.setApplicationname(application.getApplicationname());
 * applicationVO.setOwner(application.getOwner());
 * 
 * return applicationVO; }).collect(Collectors.toList());
 * 
 * return applicationVOS; } }
 */