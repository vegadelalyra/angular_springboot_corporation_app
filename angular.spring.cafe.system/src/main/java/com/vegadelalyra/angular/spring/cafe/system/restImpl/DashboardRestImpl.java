package com.vegadelalyra.angular.spring.cafe.system.restImpl;

import com.vegadelalyra.angular.spring.cafe.system.rest.DashboardRest;
import com.vegadelalyra.angular.spring.cafe.system.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class DashboardRestImpl implements DashboardRest {
    @Autowired
    DashboardService dashboardService;

    @Override
    public ResponseEntity<Map<String, Object>> getCount() {
        return dashboardService.getCount();
    }
}
