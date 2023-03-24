/*
 * package com.tim.controller;
 * 
 * import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.cglib.core.CollectionUtils; import
 * org.springframework.stereotype.Controller; import
 * org.springframework.ui.Model; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.servlet.ModelAndView;
 * 
 * import com.tim.model.ApplicationVO; import
 * com.tim.service.ApplicationService;
 * 
 * @Controller
 * 
 * @RequestMapping("/applications") public class ApplicationController {
 * 
 * @Autowired ApplicationService applicationService;
 * 
 * @GetMapping("/list") public ModelAndView getApplications(Model model) {
 * List<ApplicationVO> applicationVOS = null; try { applicationVOS =
 * applicationService.findAll(); //log.info("Application response :{} ");
 * 
 * } catch (Exception e) { //
 * log.error("Exception occured while calling getApplications", e); }
 * model.addAttribute("applications", applicationVOS); return new
 * ModelAndView("listApplications");
 * 
 * }
 * 
 * }
 */